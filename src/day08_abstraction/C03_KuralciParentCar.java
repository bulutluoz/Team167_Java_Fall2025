package day08_abstraction;

public abstract class C03_KuralciParentCar {
    /*
        EGER bir class'i parent edinen child class'larin
        MUTLAKA bulundurmasi gereken METHOD'lari BELIRLEMEK ISTIYORSANIZ

        1- o parent class'i ABSTRACT yapmalisiniz
        2- abstract bir class'da zorunlu olacak method'lar belirlenmeli
           ve bu method'lar abstract method yapilmalidir
        3- bir method'u abstract yapmak icin deklarasyonuna abstract yazilir,
        4- abstract method'lar bugune kadar kullandigimiz method'lar gibi degildir
           standart'daki kurali belirleyen bir cumle gibidir
           vazifesi bir method olmak degil
           "beni parent edinen child class'lar bu method'u bulundurmak zorundadir" demektir

     */
    public static void main(String[] args) {
        // C03_KuralciParentCar car1 = new C03_KuralciParentCar();
        // 'C03_KuralciParentCar' is abstract; cannot be instantiated
        // C03 class'i abstract oldugundan direkt obje OLUSTURULAMAZ
        // cunku abstract class'larin icinde body'si olmayan method'lar

        // car1.aku();

    }

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
