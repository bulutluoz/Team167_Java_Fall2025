package day08_abstraction;

public abstract class C06_Araba {

    // bir car icin MUTLAKA BULUNDURMASI gereken ozellikler var mi ?
    public abstract void motor();
    // child class'lar motor method'u BULUNDURMAK ZORUNDADIR

    public abstract void teker(int jantCapi);
    // child class'lar teker method'u BULUNDURMAK ZORUNDADIR

    public abstract void aku();
    // child class'lar aku method'u BULUNDURMAK ZORUNDADIR


    // bir car icin opsiyonel olarak belirlenebilecek ozellikler

    public void sunroof(){
        System.out.println("araclar isterlerse sunroof kullanabilirler");
    }

    public void klima(){
        System.out.println("araclar isterlerse klima kullanabilirler");
    }

}
