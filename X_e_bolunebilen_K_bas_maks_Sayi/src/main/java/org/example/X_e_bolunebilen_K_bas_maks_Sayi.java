package org.example;
// X sayısına bölünebilen K basamaklı en büyük sayıyı bulma

import java.lang.*;

class X_e_bolunebilen_K_bas_maks_Sayi {
    public static double answer(double X, double K)
    {
        double i = 10;
        // MAKS değişkeninin hesaplanması
        double MAKS = Math.pow(i, K) - 1;

        // X'e bölünebilen MAKS değerinin döndürülmesi
        return (MAKS - (MAKS % X));
    }

    public static void main(String[] args)
    {

        // MAKS değere bölünebilmesini istediğimiz sayı
        double X = 38;

        // MAKS değere bölünebilmesini istediğimiz sayının basamak sayısı
        double K = 4;

        System.out.println((int)answer(X, K));
    }
}

