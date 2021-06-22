package com.company;

public class Musteri {
    private long kimlikNo;
    private String adSoyad;
    private float bakiye;
    private String musteriNo;

    public Musteri(){ }
    public Musteri(long kimlikNo, String adSoyad, float bakiye, String musteriNo) {
        this.kimlikNo = kimlikNo;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.musteriNo = musteriNo;
    }


    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public float getBakiye() {
        return bakiye;
    }

    public void setBakiye(float bakiye) {
        this.bakiye = bakiye;
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }



}
