package day07_accessModifier_encapsulation.package1;

public class ayniPackageDigerClass {

    public static void main(String[] args) {

        DataClassi dataClassi = new DataClassi();
        // System.out.println(dataClassi.sayiPrivateS);
        // 'sayiPrivateS' has private access in 'day07_accessModifier_encapsulation.package1.DataClassi'
        // private access modifier'a sahip oldugu icin kendi class'i disinda KULLANILAMAZ
        // dataClassi.sayiPrivate = 6;
        // 'sayiPrivate' has private access in 'day07_accessModifier_encapsulation.package1.DataClassi'


        System.out.println(DataClassi.strDefaultAccModS);
        dataClassi.strDefaultAccMod = "Cem";


        DataClassi.chrProtectedS = 'p';
        System.out.println(dataClassi.chrProtected);

        // public access modifier'a sahip olanlar
        DataClassi.dblPublicS = 9.2;
        System.out.println(dataClassi.dblPublic);


    }
}
