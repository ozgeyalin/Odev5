package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int gunlukMaas = 250;
    static int gunlukPrim = 1000;
    static int calisilanGun1 = 16;
    static int calisilanGun2 = 29;

    static int primHesapla(int calisilanGun) {
        return (calisilanGun > 25) ? (calisilanGun - 25) * gunlukPrim : 0;
    }

    static int maasPrimHesapla(int calisilanGun) {
        int hakEdilenPrim = primHesapla(calisilanGun);
        return calisilanGun * gunlukMaas + hakEdilenPrim;
    }

    public static void main(String[] args) {
        System.out.println("Çalışılan gün: " + calisilanGun1 +
                ", Hak edilen prim: " + primHesapla(calisilanGun1) +
                ", Hak edilen maaş ve prim toplamı: " + maasPrimHesapla(calisilanGun1));

        System.out.println("Çalışılan gün: " + calisilanGun2 +
                ", Hak edilen prim: " + primHesapla(calisilanGun2) +
                ", Hak edilen maaş ve prim toplamı: " + maasPrimHesapla(calisilanGun2));
    }
}