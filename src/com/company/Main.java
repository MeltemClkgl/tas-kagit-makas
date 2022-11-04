package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
	    Scanner p1 = new Scanner(System.in);
        Scanner p2 = new Scanner(System.in);

        //tas: makas -> kazandin, kagit -> kaybettin
        //makas: kagit -> kazandin, tas -> kaybettin
        //kagit: tas -> kazandin, makas -> kaybettin

        //Biraz eglenmis olabilirim :D


        while (true){
            System.out.println("Ilk kullanici, secimini yap kaderin buna bagli \n" +
                    "1- Tas \n" +
                    "2- Kagit \n" +
                    "3- Makas \n" +
                    "Secimin: ");
            int p1_secim = p1.nextInt();

            System.out.println("Ikinci kullanici, secimini yap. Ya benimsin ya topragin \n" +
                    "1- Tas \n" +
                    "2- Kagit \n" +
                    "3- Makas \n" +
                    "Secimin: ");
            int p2_secim = p2.nextInt();

            if(p1_secim == 1 && p2_secim == 1){
                System.out.println("Ayni secimi yapmayi nasil basardiniz? Bir daha deneyin");
            }
            if(p1_secim == 1 && p2_secim == 2){
                System.out.println("Kullanici 2: Kazandin ama arkadasliginiz bitmis olabilir benden soylemesi");
                break;
            }
            if(p1_secim == 1 && p2_secim == 3){
                System.out.println("Kullanici 1: Kazandin, helal lan!");
                break;
            }

            if(p1_secim == 2 && p2_secim == 1){
                System.out.println("Kullanici 1: Kazandin, helal lan!");
                break;
            }
            if(p1_secim == 2 && p2_secim == 2){
                System.out.println("Ayni secimi yapmayi nasil basardiniz? Bir daha deneyin");
            }
            if(p1_secim == 2 && p2_secim == 3){
                System.out.println("Kullanici 2: Kazandin ama arkadasliginiz bitmis olabilir benden soylemesi");
                break;
            }

            if(p1_secim == 3 && p2_secim == 1){
                System.out.println("Kullanici 2: Kazandin ama arkadasliginiz bitmis olabilir benden soylemesi");
                break;
            }
            if(p1_secim == 3 && p2_secim == 2){
                System.out.println("Kullanici 1: Kazandin, helal lan!");
                break;
            }
            if(p1_secim == 3 && p2_secim == 3){
                System.out.println("Ayni secimi yapmayi nasil basardiniz? Bir daha deneyin");
            }

        }
    }
}
