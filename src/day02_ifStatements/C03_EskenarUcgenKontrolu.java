package day02_ifStatements;

import java.util.Scanner;

public class C03_EskenarUcgenKontrolu {

    public static void main(String[] args) {

        // kullanicidan bir ucgenin kenar uzunluklarini alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini girin, \nher kenardan sonra enter a basin");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        // kenar uzunluklari birbirine esit ise "Eskenar ucgen" yazdirin

        if (kenar1 == kenar2  &&  kenar1== kenar3){

            System.out.println("Eskenar ucgen");
        }



        // EGER kenar uzunluklari pozitif sayi ise bu gecerli olsun denirse

        if (kenar1 == kenar2  &&  kenar1== kenar3 && kenar1>0){

            System.out.println("Eskenar ucgen");
        }

    }
}
