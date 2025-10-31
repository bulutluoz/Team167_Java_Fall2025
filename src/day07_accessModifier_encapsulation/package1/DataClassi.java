package day07_accessModifier_encapsulation.package1;

public class DataClassi {


    static private int sayiPrivateS;
    static String strDefaultAccModS= "Ali"; // default access modifier
    static protected char chrProtectedS;
    static public double dblPublicS = 6.7;

    private int sayiPrivate = 4;
    String strDefaultAccMod; // default access modifier
    protected char chrProtected = 'k';
    public double dblPublic;


    public static void main(String[] args) {

        DataClassi dataClassi = new DataClassi();
        // private access modifier'a sahip olanlar SADECE kendi class'inda kullanilabilir
        System.out.println(sayiPrivateS);
        dataClassi.sayiPrivate = 6;

        // default access modifier'a sahip olanlar
        // SADECE icinde bulundugu class ve package'dan KULLANILABILIR
        // Package disindan KULLANILAMAZ
        // default access modifier'in diger adi PACKAGE PRIVATE (package'a ozel) dir.
        System.out.println(strDefaultAccModS);
        dataClassi.strDefaultAccMod = "Cem";

        // protected access modifier'a sahip olanlar
        // kendi class'i + kendi package + baska package'daki child class'lardan kullanilabilir
        chrProtectedS = 'p';
        System.out.println(dataClassi.chrProtected);

        // public access modifier'a sahip olanlar
        dblPublicS = 9.2;
        System.out.println(dataClassi.dblPublic);


    }


}
