package com.company;

public class KurumsalMusteri extends Musteri{
    private String sirketAdi;

    public KurumsalMusteri(long kimlikNo, String adSoyad, float bakiye, String musteriNo, String sirketAdi) {
        super(kimlikNo, adSoyad, bakiye, musteriNo);
        this.sirketAdi = sirketAdi;
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }
}
