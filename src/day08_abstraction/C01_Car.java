package day08_abstraction;

public class C01_Car {

    // bir car icin MUTLAKA BULUNDURMASI gereken ozellikler var mi ?
    public void motor(){
        System.out.println("Tum araclarin motoru olmalidir");
    }

    public void teker(){
        System.out.println("Tum araclarin tekeri olmalidir");
    }

    public void aku(){
        System.out.println("Tum araclarin akusu olmalidir");
    }


    // bir car icin opsiyonel olarak belirlenebilecek ozellikler

    public void sunroof(){
        System.out.println("araclar isterlerse sunroof kullanabilirler");
    }

    public void klima(){
        System.out.println("araclar isterlerse klima kullanabilirler");
    }

}
