package com.company;

public class HesapIslemleri {
    private float hesapBakiyesi;
    private float tutar;

    public HesapIslemleri(float hesapBakiyesi, float tutar) {
        this.hesapBakiyesi = hesapBakiyesi;
        this.tutar = tutar;
    }

    public float paraCekme(){
        if (tutar>hesapBakiyesi) {
            System.out.println("Yetersiz Bakiye, işlem başarısız.");
            return hesapBakiyesi;
        }
        hesapBakiyesi=hesapBakiyesi-tutar;
        return hesapBakiyesi;
    }
    public float paraYatırma(){
        hesapBakiyesi+=tutar;
        return hesapBakiyesi;
    }

}
