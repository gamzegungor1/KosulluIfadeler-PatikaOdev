import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int  mesafe;
        int yas;

        int seyahatTipi = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Bilet Satış Sitemize Hoşgeldiniz!!");

        System.out.println(" Gideceğiniz Mesafeyi Giriniz : ");
        mesafe = inp.nextInt();

        System.out.println("Lütfen Yaşınızı Giriniz : ");
        yas= inp.nextInt();

        System.out.println("Yolculuk Tipinizi Giriniz : (Tek Yön: 1 , Gidiş-Dönüş 2 ");
        seyahatTipi = inp.nextInt();



        // Verilen bilgilerin geçerliliğini kontrol ediniz :
        if(yas<=0 || mesafe<=0 || (seyahatTipi !=1 && seyahatTipi !=2)){
            System.out.println("Lütfen  Geçerli Bilgiler Giriniz : ");
            return;


        }

        //uçuşun toplam fiyatı

       double biletFiyati = mesafe*0.10;


        if(yas <12){
            biletFiyati *= 0.50;
        } else if (yas >=12 && yas <=24) {
           biletFiyati *=0.90;
        }else if(yas > 65){
            biletFiyati *=0.70;

        }

        if(seyahatTipi ==2){
            biletFiyati *=0.80;
        }

        System.out.println("Bilet Fiyatınız : " + biletFiyati + " TL");


    }
}


