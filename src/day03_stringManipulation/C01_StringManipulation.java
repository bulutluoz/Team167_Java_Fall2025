package day03_stringManipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        int sayi1 = 20;
        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR


        System.out.println(str.toLowerCase()); // java candir


        System.out.println(str); // Java Candir

        // String'de hazir method'larla yapilan degisiklikler KALICI OLMAZ
        // Kalici degisiklik yapmak istenirse, atama yapilmalidir

        str = str.toUpperCase();


        System.out.println("Atama yapildiktan sonra str : " + str);

    }
}
