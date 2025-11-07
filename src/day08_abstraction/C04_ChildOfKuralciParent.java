package day08_abstraction;

public class C04_ChildOfKuralciParent extends C03_KuralciParentCar{
    /*
    abstract olmayan bir class'i parent edinirseniz hic bir zorunluluk olmaz
    AMMMAAA abstract bir class'i parent edinirseniz
    o abstract class'daki body'si olmayan(abstract) TUM METHOD'lari olusturmak zorundasiniz

    parent edinilen abstract class'daki
    abstract olmayan(concrete) method'lar zorunlu olmaz
    o method'lar inheritance kurallarina tabiidir
    yanii child class direkt parent'dan kullanir, isterse kendine uyarlar

    Abstract parent class
    child class'in MUTLAKA BULUNDURMASI gereken method'lari belirler
    ama method'larin body'sine yani icinde ne yapilacagina KARISMAZ
 */




    public void motor() {

    }

    public void teker(int cap) {

    }

    public void aku() {

    }

    // implement abstract method 'motor()' in 'C03_KuralciParentCar'
    // implement abstract method 'teker()' in 'C03_KuralciParentCar'
    //implement abstract method 'aku()' in 'C03_KuralciParentCar'



}
