package day07_accessModifier_encapsulation;

public class C04_RaporClassi {

    public static void main(String[] args) {

        C03_EncapsulePazarlamaClass obj = new C03_EncapsulePazarlamaClass();

        // obj.satisTutari = 500;
        // 'satisTutari' has private access in 'day07_accessModifier_encapsulation.C03_EncapsulePazarlamaClass'
        // private oldugu icin satis tutari variable'ina direkt olarak ulasilamaz

        // obj.toplamSatisTutari = 5000;
        //  'toplamSatisTutari' has private access in 'day07_accessModifier_encapsulation.C03_EncapsulePazarlamaClass'

        obj.setSatisTutari(1000);

        obj.setSatisTutari(2000);
        obj.setSatisTutari(500);
        obj.setSatisTutari(1000);

        // System.out.println(obj.setSatisTutari(3000));
        // setSatisTutari() method'u void'dir
        // yani isini yapar ama cagrildigi yere bir sey dondurmez
        // bu sebeple sout icinde kullanilamaz


        System.out.println(obj.getToplamSatisTutari());

        // obj.getToplamSatisTutari() = 6000;
        // esitligin sol tarafinda SADECE variable olabilir
        // obj.getToplamSatisTutari() bize bir deger getiriyor, variable degil

    }
}
