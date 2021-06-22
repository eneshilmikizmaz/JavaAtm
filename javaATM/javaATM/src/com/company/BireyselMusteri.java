package com.company;

public class BireyselMusteri extends Musteri{
    private String evAdresi;


    public BireyselMusteri(long kimlikNo, String adSoyad, float bakiye, String musteriNo, String evAdresi) {
        super(kimlikNo, adSoyad, bakiye, musteriNo);
        this.evAdresi = evAdresi;
    }

    public String getEvAdresi() {
        return evAdresi;
    }

    public void setEvAdresi(String evAdresi) {
        this.evAdresi = evAdresi;
    }
}
