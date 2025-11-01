package day07_accessModifier_encapsulation;

public class C03_EncapsulePazarlamaClass {

    // 1- satis bolumundeki personel rapor’un olusmasi icin gerekli bilgileri girebilmeli ancak sonuclari gorememeli.
    // 2- Rapor olusturulduktan sonra, izin verilen kullanicilar raporu gorebilmeli ancak veriler uzerinde degisiklik yapamamali.

    private int satisTutari; // deger atamasi(write) yapilsin ama goruntuleme(read) yapilamasin ==> setter
    private int toplamSatisTutari; // deger atamasi(write) yapilamasin ama goruntuleme(read) yapilabilsin ==> getter()

    // 1.asama : access modifier ile bu variable'lara erisimi engelleyelim.... (private yap)
    // 2.asama : gorevi analiz edip
    //              - write yetkisi istenen variablelar icin setter()
    //              - read yetkisi istenen variablelar icin getter() olusturun


    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
}
