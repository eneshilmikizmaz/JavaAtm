package com.company;

import java.util.*;

import static java.util.Objects.hash;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Musteri musteri1 = new BireyselMusteri(11111,"mahmut",443.7f,"1213","kemalpaşa mah.");
        Musteri musteri2 = new BireyselMusteri(22222,"tuncer",500,"2435","istiklal mah.");
        Musteri musteri3 = new KurumsalMusteri(33333,"enes",345.5f,"3453","hineks");
        Musteri musteri4 = new BireyselMusteri(44444,"mehmet",1000.1f,"4768","acıbadem mah.");
        Musteri musteri5 = new KurumsalMusteri(55555,"hilmi",43,"5234","testinium");
        HashMap<String, Musteri> musteriler = new HashMap<>();
        musteriler.put(musteri1.getMusteriNo(), musteri1);
        musteriler.put(musteri2.getMusteriNo(),musteri2);
        musteriler.put(musteri3.getMusteriNo(), musteri3);
        musteriler.put(musteri4.getMusteriNo(),musteri4);
        musteriler.put(musteri5.getMusteriNo(), musteri5);

        /*try {
            musteriler.entrySet()
                    .forEach(item -> System.out.println("KEY: " + item.getKey()
                            + "  Bilgiler :" + item.getValue().getMusteriNo() + "  " + item.getValue().getKimlikNo() + "  " + item.getValue().getAdSoyad() + "  " + item.getValue().getBakiye() + "  " +
                            ((BireyselMusteri) item.getValue()).getEvAdresi() + "  " + ((KurumsalMusteri) item.getValue()).getSirketAdi()));
            //((BireyselMusteri) item.getValue()).getEvAdresi()
        }catch (Exception e){
            System.out.println(e);
        }
         */

        for(Map.Entry m : musteriler.entrySet()){
            String check = String.valueOf(m.getValue());
            //System.out.println(((BireyselMusteri) musteriler.get(it.next())).getEvAdresi());
            Object tmp = m.getValue();
            if(check.contains("BireyselMusteri")) {
                BireyselMusteri bireyselMusteri=(BireyselMusteri)tmp;
                String veriler = bireyselMusteri.getMusteriNo() +"  "+bireyselMusteri.getKimlikNo()+"  "+bireyselMusteri.getAdSoyad()+"  "+bireyselMusteri.getBakiye() +"  "+ bireyselMusteri.getEvAdresi();
                System.out.println(veriler);
            }else{

                KurumsalMusteri kurumsalMusteri=(KurumsalMusteri)tmp;
                String veriler = kurumsalMusteri.getMusteriNo() +"  "+kurumsalMusteri.getKimlikNo()+"  "+kurumsalMusteri.getAdSoyad()+"  "+kurumsalMusteri.getBakiye() +"  "+kurumsalMusteri.getSirketAdi();
                System.out.println(veriler);
            }
        }





/*
        for (int i=1;i<=musteriler.size();i++){
            String check = String.valueOf(musteriler.get(i));
            if(check.contains("BireyselMusteri")) {
                System.out.println("Müşteri no : " + musteriler.get(i).getMusteriNo() + "  Kimlik Numarası : " + musteriler.get(i).getKimlikNo() + "  Adı Soyadı : " + musteriler.get(i).getAdSoyad() + "  Bakiyesi : " + musteriler.get(i).getBakiye() + "  Ev adresi : " + ((BireyselMusteri) musteriler.get(i)).getEvAdresi());
            }else{
                System.out.println("Müşteri no : " + musteriler.get(i).getMusteriNo() + "  Kimlik Numarası : " + musteriler.get(i).getKimlikNo() + "  Adı Soyadı : " + musteriler.get(i).getAdSoyad() + "  Bakiyesi : " + musteriler.get(i).getBakiye() + "  Şirket Adı : " + ((KurumsalMusteri) musteriler.get(i)).getSirketAdi());
            }
        }*/

        System.out.println("-----------------------");
        System.out.println("Hesap İşlemleri");
        System.out.println("-----------------------");
        System.out.println("Para çekmek için 1'e basınız.");
        System.out.println("Para yatırmak için 2'ye basınız.");
        System.out.println("-----------------------");
/*
        Scanner atm = new Scanner(System.in);
        int secenek = atm.nextInt();
        switch (secenek){
            case 1:
                System.out.println("Müşteri Numarası giriniz");
                int musteriNo = atm.nextInt();
                Hesapİslemleri hesapİslemleri = new Hesapİslemleri(musteriler.get(musteriNo),)

        }*/

    }



}
