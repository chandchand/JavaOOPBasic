
#include <SPI.h>
#include <RFID.h>

#define SS_PIN 10
#define RST_PIN 9

RFID rfid(SS_PIN, RST_PIN);

String KTP[4]; 
int jml_tempel = 0;
int salah_kartu = 0;

const int relay_1 = 2;  //relay_1 untuk kontak on dan off, sambungkan ke pin D2 arduino
const int relay_2 = 4;  //relay_2 untuk switch standar, sambungkan ke pin D4 arduino
const int relay_3 = 3;  //relay_3 untuk starter dan rem, sambungkan ke pin D3 arduino
//const int relay_4 = 5;  //relay_4 untuk buzzer, sambungkan ke pin D5 arduino


char app;

void setup(){
  Serial.begin(9600);
  delay(500);
  SPI.begin();
  rfid.init();
  //Silahkan kalian ganti dengan ID E-KTP kalian.
  KTP[0] = "13641472202"; // KTP 1
  KTP[1] = "31462485108"; // KTP 2
  KTP[2] = "1364953176"; // KTP 2
  KTP[3] = "1037212012245"; // KTP 2
  pinMode(relay_1,OUTPUT);
  pinMode(relay_2,OUTPUT);
  pinMode(relay_3,OUTPUT);
//  pinMode(relay_4,OUTPUT);

  digitalWrite(relay_1,HIGH);
  digitalWrite(relay_2,HIGH);
  digitalWrite(relay_3,HIGH);
//  digitalWrite(relay_4,HIGH);
}

void loop(){
  if(Serial.available()>0){
    app=Serial.read();
    delay(1000);

    if(app=='A'){
      digitalWrite(relay_1,LOW);
    }
    else if(app=='B'){
      digitalWrite(relay_1,HIGH);
    }
    else if(app=='C'){
      digitalWrite(relay_2,LOW);
      digitalWrite(relay_3,LOW);
      delay(1500);
      digitalWrite(relay_2,HIGH);
      digitalWrite(relay_3,HIGH);
    }
  }
   // rfid
  if (rfid.isCard()) {
    if (rfid.readCardSerial()) {
      String serial;
      int member = 0;

      for (int i = 0; i <= 4; i++) {
        serial += String(rfid.serNum[i], DEC);
      }
      
      for (int i = 0; i < sizeof(KTP); i++) {
        if (serial == KTP[i]) {
          member = 1;
        }
      }

      //Jika KTP Kita benar
      if (member == 1) {
        jml_tempel++;
        if (jml_tempel == 1) {
          Serial.println("Kontak Sudah Terhubung, Tap sekali lagi untuk menghidupkan mesin motor");
          digitalWrite(relay_1, LOW);
          digitalWrite(relay_3, HIGH);
        }
        if (jml_tempel == 2) {
          Serial.println("Menghidupkan Mesin Motor");
          delay(1700);
          digitalWrite(relay_1, LOW);
          digitalWrite(relay_3, LOW);
          delay(800);
          digitalWrite(relay_3, HIGH);
        }
        if (jml_tempel == 3) {
          Serial.println("Kontak dan Mesin Motor dimatikan");
          digitalWrite(relay_1, HIGH);
          digitalWrite(relay_3, HIGH);
          delay(200);
        }
        if (jml_tempel >= 3) {
          jml_tempel = 0;
        }

      } else {
        salah_kartu++;
        Serial.println("Hayo... coba coba nge-Tap.. motor siapa tuh..");
        digitalWrite(relay_1, HIGH);
        digitalWrite(relay_3, HIGH);
        jml_tempel = 0;
        if (salah_kartu == 3) {
          delay(2000);
          Serial.println("Kok masih ngeyel sih, KTP tidak terdaftar nih.. sorry sistem dimatikan dulu 5 menit baru nyoba lagi..");
          int longDelayInSeconds = 300;
          int p = 0;
          while (p < longDelayInSeconds) {
            delay(1000);
            p++;
          }

          salah_kartu = 0;
        }
      }
    }

  }
  rfid.halt();
  delay(1000);
}
