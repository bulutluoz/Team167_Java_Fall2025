package day08_abstraction;

public class C02_ChildOfCar extends C01_Car{
    /*
        java'da bir class ISTEDIGI herhangi bir class'i PARENT edinebilir

        Child class
        - parent class'da var olan method'larda istediklerini DIREKT kullanabilir
        - child class parent class'da var olan method'lardan istediklerini KENDISINE UYARLAYABILIR
        - child class isterse parent class'da olmayan yeni method'lar ekleyebilir

        yannniiiii Inheritance kullaniminda CHILD CLASS kraldir
        parent class child class'a hic bir yaptirim uygulayamaz
     */

    public void method1(){
        //  - parent class'da var olan method'larda istediklerini DIREKT kullanabilir

        aku(); // Tum araclarin akusu olmalidir
        motor(); // Tum araclarin motoru olmalidir

        // - child class parent class'da var olan method'lardan istediklerini KENDISINE UYARLAYABILIR

        teker(); // Ben 17 inc teker kullanirim

        // - child class isterse parent class'da olmayan yeni method'lar ekleyebilir
        kasa(); // karbon alasimli kasa kullanir
    }

    public void teker(){
        System.out.println("Ben 17 inc teker kullanirim");
    }

    public void kasa(){
        System.out.println("karbon alasimli kasa kullanir");
    }

}
