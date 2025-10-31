package day07_accessModifier_encapsulation.package2;

import day07_accessModifier_encapsulation.package1.DataClassi;

public class FarkliPackageChildOlmayanClass {

    public static void main(String[] args) {

        DataClassi dataClassi = new DataClassi();
        // System.out.println(dataClassi.sayiPrivateS);
        // 'sayiPrivateS' has private access in 'day07_accessModifier_encapsulation.package1.DataClassi'
        // private access modifier'a sahip oldugu icin kendi class'i disinda KULLANILAMAZ
        // dataClassi.sayiPrivate = 6;
        // 'sayiPrivate' has private access in 'day07_accessModifier_encapsulation.package1.DataClassi'


        // System.out.println(DataClassi.strDefaultAccModS);
        // 'strDefaultAccModS' is not public in 'day07_accessModifier_encapsulation.package1.DataClassi'.
        // Cannot be accessed from outside package
        // Default access modifier'a sahip oldugu icin
        // KENDI PACKAGE'i disinda KULLANILAMAZ
        // dataClassi.strDefaultAccMod = "Cem";


        // DataClassi.chrProtectedS = 'p';
        // 'chrProtectedS' has protected access in 'day07_accessModifier_encapsulation.package1.DataClassi'
        // protected access modifier'a sahip oldugundan
        // baska package'daki child olmayan class'dan KULLANILAMAZ
        // System.out.println(dataClassi.chrProtected);

        // public access modifier'a sahip olanlar
        dataClassi.dblPublicS = 9.2;
        System.out.println(dataClassi.dblPublic);

        // GENEL olarak dusunuldugunde
        // erisim icin MUMKUN OLAN en dar access modifier tercih
    }
}
