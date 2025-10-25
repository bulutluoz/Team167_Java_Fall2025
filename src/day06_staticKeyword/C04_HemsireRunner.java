package day06_staticKeyword;

public class C04_HemsireRunner {

    public static void main(String[] args) {

        // Baska class'lardaki static class uyelerine
        // ClassIsmi.staticUyeIsmi yazarak DIREKT ulasilabilir

        System.out.println(C03_Hemsire.hastaneIsmi);
        C03_Hemsire.hastaneAdresi = "Balgat";

        // C03_Hemsire.perIsim = "Ayse";
        // Non-static field 'perIsim' cannot be referenced from a static context


        // Baska class'daki static olmayan class uyelerine ulasmak icin
        // o class'dan bir obje olusturmalisiniz

        C03_Hemsire hemsire1 = new C03_Hemsire();
        hemsire1.perIsim = "Ayse";
        hemsire1.perAdres = "Sincan";

        // System.out.println(perIsim);
        System.out.println(hemsire1.perIsim); // Ayse


        C03_Hemsire hemsire2 = new C03_Hemsire();
        System.out.println(hemsire2.perIsim); // null

        hemsire2.perIsim = "Leyla";

        System.out.println(hemsire1.hastaneIsmi); // Yildiz

        hemsire2.hastaneIsmi = "Cankaya Hastanesi";

        System.out.println(hemsire1.hastaneIsmi); // Cankaya Hastanesi

    }
}
