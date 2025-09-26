package day02_ifStatements;

import java.util.Scanner;

public class C02_SinifGecme {

    public static void main(String[] args) {
        // kullanicidan notunu alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        Double girilenNot = scanner.nextDouble();


        // notu 50 veya daha buyukse "sinifi gectin" yazdirin

        if (girilenNot >= 50 ){
            System.out.println("sinifi gectin");
        }


    }
}
