package com.company;

public class HesapIslemleri {
    private float hesapBakiyesi;
    private float tutar;
    public HesapIslemleri(Musteri musteri, float Tutar){
        hesapBakiyesi=musteri.getBakiye();
        this.tutar=Tutar;
    }

    public float paraCekme(){
        if (tutar>hesapBakiyesi) System.out.println("Yetersiz Bakiye");
        hesapBakiyesi=hesapBakiyesi-tutar;
        return hesapBakiyesi;
    }
    public float paraYatırma(){
        hesapBakiyesi+=tutar;
        return hesapBakiyesi;
    }


    public float getHesapBakiyesi() {
        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(float hesapBakiyesi) {

        this.hesapBakiyesi = hesapBakiyesi;

    }
}
