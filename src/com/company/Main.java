package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            Musteri musteri1 = new BireyselMusteri(11111, "mahmut", 443.7f, "1432", "kemalpaşa mah.");
            Musteri musteri2 = new BireyselMusteri(22222, "tuncer", 500, "2435", "istiklal mah.");
            Musteri musteri3 = new KurumsalMusteri(33333, "enes", 345.5f, "37657", "hineks");
            Musteri musteri4 = new BireyselMusteri(44444, "mehmet", 1000.1f, "4234", "acıbadem mah.");
            Musteri musteri5 = new KurumsalMusteri(55555, "hilmi", 43, "5345", "testinium");
            HashMap<String, Musteri> musteriler = new HashMap<>();
            musteriler.put(musteri1.getMusteriNo(), musteri1);
            musteriler.put(musteri2.getMusteriNo(), musteri2);
            musteriler.put(musteri3.getMusteriNo(), musteri3);
            musteriler.put(musteri4.getMusteriNo(), musteri4);
            musteriler.put(musteri5.getMusteriNo(), musteri5);

            Set<String> set = musteriler.keySet();
            System.out.println("MüşteriNo|KimlikNo|AdSoyad|Bakiye|Konum");
            for (Object tmp : set) {
                String check = String.valueOf(musteriler.get(tmp));
                System.out.print(musteriler.get(tmp).getMusteriNo() + " | ");
                System.out.print(musteriler.get(tmp).getKimlikNo() + " | ");
                System.out.print(musteriler.get(tmp).getAdSoyad() + " | ");
                System.out.print(musteriler.get(tmp).getBakiye() + " | ");
                if (check.contains("BireyselMusteri")) {
                    System.out.println(((BireyselMusteri) musteriler.get(tmp)).getEvAdresi());
                } else {
                    System.out.println(((KurumsalMusteri) musteriler.get(tmp)).getSirketAdi());
                }

            }

            Scanner atm = new Scanner(System.in);
           // do {
                System.out.println("-----------------------");
                System.out.println("Hesap İşlemleri");
                System.out.println("-----------------------");
                System.out.println("Para çekmek için 1'e basınız.");
                System.out.println("Para yatırmak için 2'ye basınız.");
                System.out.println("-----------------------");
                int secenek = atm.nextInt();
                System.out.println("Müşteri Numarası giriniz..:");
                String musteriNo = String.valueOf(atm.nextInt());
                System.out.println("Tutar giriniz..:");
                float tutar = atm.nextFloat();
                HesapIslemleri hesapIslemleri = new HesapIslemleri(musteriler.get(musteriNo).getBakiye(), tutar);
                if (secenek == 1) {
                    musteriler.get(musteriNo).setBakiye(hesapIslemleri.paraCekme());
                    System.out.println("Sayın :" + musteriler.get(musteriNo).getAdSoyad() + " | " + musteriler.get(musteriNo).getKimlikNo() + " | " + musteriler.get(musteriNo).getMusteriNo());
                    System.out.println("Güncel Bakiye :" + musteriler.get(musteriNo).getBakiye());
                } else if (secenek == 2) {
                    musteriler.get(musteriNo).setBakiye(hesapIslemleri.paraYatırma());
                    System.out.println("Sayın :" + musteriler.get(musteriNo).getAdSoyad() + " | " + musteriler.get(musteriNo).getKimlikNo() + " | " + musteriler.get(musteriNo).getMusteriNo());
                    System.out.println("Güncel Bakiye :" + musteriler.get(musteriNo).getBakiye());
                } else {
                    System.out.println("hatalı giriş");
                }
           // } while (true);
        }catch (Exception e){
            System.out.println(e);
        }

    }



}
