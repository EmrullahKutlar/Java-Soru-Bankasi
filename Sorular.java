package sorubankası2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sorular {

    static int puan = 0;
    static String secim;
    static String soru;
    static String cevap;

    Scanner klavye = new Scanner(System.in);
    ArrayList<String> test = new ArrayList<String>();
    ArrayList<String> testSiklar = new ArrayList<String>();
    ArrayList<String> testCevap = new ArrayList<String>();
    /*---------------------------------------------------------------*/
    ArrayList<String> boslukDoldurma = new ArrayList<String>();
    ArrayList<String> boslukCevap = new ArrayList<String>();
    /*---------------------------------------------------------------*/
    ArrayList<String> dogruYanlıs = new ArrayList<String>();
    ArrayList<String> dyCevap = new ArrayList<String>();
    /*---------------------------------------------------------------*/
    ArrayList<String> klasikSoru = new ArrayList<String>();
    // ArrayList<String> klasikCevap = new ArrayList<String>();
    ArrayList<String> verilenCevap = new ArrayList<String>();

    public void testYap() {
        if (test.isEmpty()) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            int testpuanı = 0;
            System.out.println("\nHer soru 10 puandır başarılar\n");
            for (int i = 0; i < test.size(); i++) {
                System.out.println(test.get(i));
                System.out.println(testSiklar.get(i));
                String giris = klavye.nextLine();
                if (giris.equalsIgnoreCase(testCevap.get(i))) {
                    testpuanı+=10;
                    System.out.println("DOĞRU..\n");
                } else {
                    System.out.println("Yanlış cevap verdiniz.Doğru Cevap= " + testCevap.get(i) + "\n");
                }
            }
            System.out.println("Puanınız= " + testpuanı);
        }
    }

    public void testEkle() {
        boolean döndür = true;
        while (döndür) {
            String yeniSoru;
            String yeniCevap;
            String yeniSıklar;
            System.out.println("Eklemek istediğiniz soruyu giriniz");
            yeniSoru = klavye.nextLine();
            System.out.println("\nSorunun şıklarını giriniz");
            System.out.println("Örneğin: A)20 B)30 C)40 D)50\n");
            yeniSıklar = klavye.nextLine();
            System.out.println("\nSorunun cevabını Giriniz:");
            yeniCevap = klavye.nextLine();
            test.add(yeniSoru);
            testSiklar.add(yeniSıklar);
            testCevap.add(yeniCevap);
            System.out.println("----------Soru Başarıyla Eklendi---------- \n");
            System.out.println("Yeniden soru eklemek istermisiniz?  E/H");
            secim = klavye.nextLine();
            if (secim.equalsIgnoreCase("H")) {
                break;
            } else if (secim.equalsIgnoreCase("E")) {
                döndür = true;
            }
        }

    }

    public void testListele() {
        if (test.size() == 0) {
            System.out.println("Test sorusu yok.Lütfen önce soru giriniz.");
        } else {
            System.out.println("\n--------SORULAR--------");
            int i = 1;
            for (String sorular : test) {
                System.out.println(i + "=" + sorular);
                ++i;
            }
        }
    }

    public void testSil() {

        testListele();
        System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
        int numara = klavye.nextInt();
        if (numara <= test.size()) {
            test.remove(numara - 1);
            testCevap.remove(numara - 1);
            testSiklar.remove(numara - 1);
            System.out.println("\n-------Soru Başarıyla Silindi-------\n");

        } else if (numara > test.size()) {
            System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
        }

    }

    public void testArayarakSil() {
        System.out.println("Aranacak soruyu veya şıkları giriniz");
        String secim3 = klavye.nextLine();
        if (test.contains(secim3) || testSiklar.contains(secim3)) {
            System.out.println("\nAradığınız soru vardır"
                    + "\n-------Sorular lilsteleniyor-----");
            testListele();
            System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
            int numara = klavye.nextInt();
            if (numara <= test.size()) {
                test.remove(numara - 1);
                testCevap.remove(numara - 1);
                testSiklar.remove(numara - 1);
                System.out.println("\n-------Soru Başarıyla Silindi-------\n");

            } else if (numara > test.size()) {
                System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
            }
        } else {
            System.out.println("aradığınız kelimeleri içeren soru bulunmamaktadır.");
        }

    }

    public void testRandom() {
        String cevap;
        for (int i = 0; i < 3; i++) {
            int randomindex = ThreadLocalRandom.current().nextInt(test.size());
            System.out.println(test.get(randomindex));
            System.out.println(testSiklar.get(randomindex));

            cevap = klavye.nextLine();
            if (cevap.equalsIgnoreCase(testCevap.get(randomindex))) {
                System.out.println("DOĞRU...\n");
                puan += 12;
            } else {
                System.out.println("Yanlış cevap verdiniz.Doğru Cevap= " + testCevap.get(randomindex) + "\n");
            }
        }
        
    }

    public void boslukEkle() {
        boolean döndür = true;
        while (döndür) {
            String yeniSoru;
            String yeniCevap;
            System.out.println("Eklemek istediğiniz soruyu giriniz (Bosluk kısmında nokta kullanınız)");
            yeniSoru = klavye.nextLine();
            System.out.println("\nSorunun cevabını Giriniz:");
            yeniCevap = klavye.nextLine();
            boslukDoldurma.add(yeniSoru);
            boslukCevap.add(yeniCevap);
            System.out.println("----------Soru Başarıyla Eklendi---------- \n");
            System.out.println("Yeniden soru eklemek istermisiniz?  E/H");
            secim = klavye.nextLine();
            if (secim.equalsIgnoreCase("H")) {
                break;
            } else if (secim.equalsIgnoreCase("E")) {
                döndür = true;
            }
        }

    }

    public void boslukSınav() {
        int testpuanı = 0;
        if (boslukDoldurma.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            for (int i = 0; i < boslukDoldurma.size(); i++) {
                System.out.println(boslukDoldurma.get(i));
                String giris = klavye.nextLine();
                if (giris.equalsIgnoreCase(boslukCevap.get(i))) {
                    testpuanı += 10;
                    System.out.println("DOĞRU..\n");
                } else {
                    System.out.println("Yanlış cevap verdiniz.Doğru Cevap= " + testCevap.get(i) + "\n");
                }
            }
            System.out.println("Puanınız= " + testpuanı);
        }
    }

    public void boslukListele() {
        if (boslukDoldurma.size() == 0) {
            System.out.println("Boşluk doldurma sorusu yok.Lütfen önce soru giriniz.");
        } else {
            System.out.println("\n--------SORULAR--------");
            int i = 1;
            for (String sorular : boslukDoldurma) {
                System.out.println(i + "=" + sorular);
                ++i;
            }
        }
    }

    public void boslukSil() {
        if (boslukDoldurma.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            boslukListele();
            System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
            int numara = klavye.nextInt();
            if (numara <= boslukDoldurma.size()) {
                boslukDoldurma.remove(numara - 1);
                boslukDoldurma.remove(numara - 1);
                System.out.println("\n-------Soru Başarıyla Silindi-------\n");

            } else if (numara > boslukDoldurma.size()) {
                System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
            }
        }
    }

    public void boslukArayarakSil() {
        if (boslukDoldurma.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            System.out.println("Aranacak soruyu veya cevabı giriniz");
            String secim3 = klavye.nextLine();
            if (boslukDoldurma.contains(secim3) || boslukCevap.contains(secim3)) {
                System.out.println("\nAradığınız soru vardır"
                        + "\n-------Sorular lilsteleniyor-----");
                testListele();
                System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
                int numara = klavye.nextInt();
                if (numara <= boslukDoldurma.size()) {
                    boslukDoldurma.remove(numara - 1);
                    boslukCevap.remove(numara - 1);
                    System.out.println("\n-------Soru Başarıyla Silindi-------\n");
                } else if (numara > test.size()) {
                    System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
                }
            } else {
                System.out.println("aradığınız kelimeleri içeren soru bulunmamaktadır.");
            }
        }
    }

    public void dyEkle() {
        boolean döndür = true;
        while (döndür) {
            String yeniSoru;
            String yeniCevap;
            System.out.println("Eklemek istediğiniz soruyu giriniz.");
            yeniSoru = klavye.nextLine();
            System.out.println("\nSorunun cevabını Giriniz:");
            yeniCevap = klavye.nextLine();
            dogruYanlıs.add(yeniSoru);
            dyCevap.add(yeniCevap);
            System.out.println("----------Soru Başarıyla Eklendi---------- \n");
            System.out.println("Yeniden soru eklemek istermisiniz?  E/H");
            secim = klavye.nextLine();
            if (secim.equalsIgnoreCase("H")) {
                break;
            } else if (secim.equalsIgnoreCase("E")) {
                döndür = true;
            }
        }
    }

    public void dySınav() {
        int testpuanı = 0;
        if (dogruYanlıs.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            for (int i = 0; i < dogruYanlıs.size(); i++) {
                System.out.println(dogruYanlıs.get(i));
                String giris = klavye.nextLine();
                if (giris.equalsIgnoreCase(dyCevap.get(i))) {
                    testpuanı += 10;
                    System.out.println("DOĞRU..\n");
                } else {
                    System.out.println("Yanlış cevap verdiniz.Doğru Cevap= " + testCevap.get(i) + "\n");
                }
            }
            System.out.println("Puanınız= " + testpuanı);
        }
    }

    public void dyListele() {
        if (dogruYanlıs.size() == 0) {
            System.out.println("Doğru Yanlış sorusu yok.Lütfen önce soru giriniz.");
        } else {
            System.out.println("\n--------SORULAR--------");
            int i = 1;
            for (String sorular : dogruYanlıs) {
                System.out.println(i + "=" + sorular);
                ++i;
            }
        }
    }

    public void dySil() {
        if (boslukDoldurma.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            testListele();
            System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
            int numara = klavye.nextInt();
            if (numara <= dogruYanlıs.size()) {
                dogruYanlıs.remove(numara - 1);
                dyCevap.remove(numara - 1);
                System.out.println("\n-------Soru Başarıyla Silindi-------\n");

            } else if (numara > dogruYanlıs.size()) {
                System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
            }
        }
    }

    public void dyArayarakSil() {
        if (dogruYanlıs.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            System.out.println("Aranacak soruyu veya cevabı giriniz");
            String secim3 = klavye.nextLine();
            if (dogruYanlıs.contains(secim3) || dyCevap.contains(secim3)) {
                System.out.println("\nAradığınız soru vardır"
                        + "\n-------Sorular lilsteleniyor-----");
                testListele();
                System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
                int numara = klavye.nextInt();
                if (numara <= dogruYanlıs.size()) {
                    dogruYanlıs.remove(numara - 1);
                    dyCevap.remove(numara - 1);
                    System.out.println("\n-------Soru Başarıyla Silindi-------\n");
                } else if (numara > dogruYanlıs.size()) {
                    System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
                }
            } else {
                System.out.println("aradığınız kelimeleri içeren soru bulunmamaktadır.");
            }
        }
    }

    public void klasikEkle() {
        boolean döndür = true;
        while (döndür) {
            String yeniSoru;
            System.out.println("Eklemek istediğiniz soruyu giriniz");
            yeniSoru = klavye.nextLine();
            klasikSoru.add(yeniSoru);
            System.out.println("----------Soru Başarıyla Eklendi---------- ");
            System.out.println("\nYeniden soru eklemek istermisiniz?  E/H");
            secim = klavye.nextLine();
            if (secim.equalsIgnoreCase("H")) {
                break;
            } else if (secim.equalsIgnoreCase("E")) {
                döndür = true;
            }
        }
    }

    public void klasikListele() {
        if (klasikSoru.size() == 0) {
            System.out.println("Klasik soru yok.Lütfen önce soru giriniz.");
        } else {
            System.out.println("\n--------SORULAR--------");
            int i = 1;
            for (String sorular : klasikSoru) {
                System.out.println(i + "=" + sorular);
                ++i;
            }
        }
    }

    public void klasikSil() {
        if (klasikSoru.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            testListele();
            System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
            int numara = klavye.nextInt();
            if (numara <= klasikSoru.size()) {
                klasikSoru.remove(numara - 1);
                System.out.println("\n-------Soru Başarıyla Silindi-------");

            } else if (numara > dogruYanlıs.size()) {
                System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
            }
        }
    }

    public void klasikArayarakSil() {
        if (klasikSoru.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            System.out.println("Aranacak soruyu giriniz");
            String secim3 = klavye.nextLine();
            if (klasikSoru.contains(secim3)) {
                System.out.println("\nAradığınız soru vardır"
                        + "\n-------Sorular lilsteleniyor-----");
                testListele();
                System.out.println("Silmek istediğiniz sorunun numarasını yazınız");
                int numara = klavye.nextInt();
                if (numara <= klasikSoru.size()) {
                    klasikSoru.remove(numara - 1);
                    System.out.println("\n-------Soru Başarıyla Silindi-------\n");
                } else if (numara > klasikSoru.size()) {
                    System.out.println("\n-------Soru silinemedi.Yanlış numara tuşladınız.--------\n");
                }
            } else {
                System.out.println("aradığınız kelimeleri içeren soru bulunmamaktadır.");
            }
        }
    }

    public void klasikSınav() throws IOException {

        FileWriter fWriter = null;
        BufferedWriter writer = null;
        System.out.println("Sınavın kayıt edileciği dosyasının ismi ne olsun.");
        String dosya;
        dosya = klavye.nextLine();
        try {
            fWriter = new FileWriter(dosya + ".txt");
            writer = new BufferedWriter(fWriter);
        } catch (Exception e) {
        }

        if (klasikSoru.size() == 0) {
            System.out.println("Lütfen önce soru ekleyin");
        } else {
            System.out.println("----Klasik soru bölümü----");
            for (int i = 0; i < klasikSoru.size(); i++) {
                System.out.println("\n" + klasikSoru.get(i));
                cevap = klavye.nextLine();
                verilenCevap.add(cevap);
                writer.write("Soru: " + klasikSoru.get(i));
                writer.newLine();
                writer.write("Verilen Cevap: " + verilenCevap.get(i));
                writer.newLine();
                writer.write("-------------------------------------------------");
                writer.newLine();
            }
            writer.close();
            verilenCevap.clear();
        }
    }

    public void sınav() throws IOException {
         
        BufferedWriter writer = null;
        System.out.println("Sınavın kayıt edileciği txt dosyasının ismi ne olsun.");
        String dosya;
        dosya = klavye.nextLine();
        try {
          FileWriter  fWriter = new FileWriter(dosya + ".txt");
        writer = new BufferedWriter(fWriter);
        } catch (Exception e) {
        }
        for (int i = 0; i < 4; i++) {
            int randomindex = (int) (Math.random() * (test.size() - 0)) + 0;
                System.out.println(test.get(randomindex));
                System.out.println(testSiklar.get(randomindex));
                cevap = klavye.nextLine();
                verilenCevap.add(cevap);
                writer.write("Soru: " + test.get(randomindex));
                writer.newLine();
                writer.write("Doğru Cevap: " + testCevap.get(randomindex));
                writer.newLine();
                writer.write("Verilen Cevap: " + cevap);
                writer.newLine();
                writer.write("-------------------------------------------------");
                writer.newLine();
        }
       
        for (int i = 0; i < 2; i++) {
            
           int randomindex = (int) (Math.random() * (dogruYanlıs.size() - 0)) + 0;
         
                System.out.println(dogruYanlıs.get(randomindex));
                cevap = klavye.nextLine();
                verilenCevap.add(cevap);
                writer.write("Soru: " + dogruYanlıs.get(randomindex));
                writer.newLine();
                writer.write("Doğru Cevap: " + dyCevap.get(randomindex));
                writer.newLine();
                writer.write("Verilen Cevap: " + cevap);
                writer.newLine();
                writer.write("-------------------------------------------------");
                writer.newLine();
        }
      
        for (int i = 0; i < 2; i++) {
            int randomindex = (int) (Math.random() * (boslukDoldurma.size() - 0)) + 0;
                System.out.println(boslukDoldurma.get(randomindex));
                cevap = klavye.nextLine();
                verilenCevap.add(cevap);
                writer.write("Soru: " + boslukDoldurma.get(randomindex));
                writer.newLine();
                writer.write("Doğru Cevap: " + boslukCevap.get(randomindex));
                writer.newLine();
                writer.write("Verilen Cevap: " + cevap);
                writer.newLine();
                writer.write("-------------------------------------------------");
                writer.newLine();
        }
   
        for (int i = 0; i < 2; i++) {
            int randomindex = (int) (Math.random() * (klasikSoru.size() - 0)) + 0;
                System.out.println(klasikSoru.get(randomindex));
                cevap = klavye.nextLine();
                verilenCevap.add(cevap);
                writer.write("Soru: " + klasikSoru.get(randomindex));
                writer.newLine();
                writer.write("Verilen Cevap: " + cevap);
                writer.newLine();
                writer.write("-------------------------------------------------");
                writer.newLine();
        }
        writer.close();
        System.out.println("Sınav başarıyla kayıt edildi");
        verilenCevap.clear();

    }
    public void kayıt() throws ClassNotFoundException{
        System.out.println("Dosyanın adı ne olsun");
        String dosya;
        dosya=klavye.nextLine();
        try {
            FileOutputStream output = new FileOutputStream(dosya+".dat");
            ObjectOutputStream object = new ObjectOutputStream(output);
            for(int i=0;i<test.size();i++){
            object.writeObject(test.get(i));
            object.writeObject(testSiklar.get(i));
            object.writeObject(testSiklar.get(i));}
            for(int i=0;i<boslukDoldurma.size();i++){
            object.writeObject(boslukDoldurma.get(i));
            object.writeObject(boslukCevap.get(i));}
            for(int i=0;i<dogruYanlıs.size();i++){
            object.writeObject(dogruYanlıs.get(i));
            object.writeObject(dyCevap.get(i));}
            for(int i=0;i<klasikSoru.size();i++){
            object.writeObject(klasikSoru.get(i));}
            
            System.out.println("\nSorular başarı ile kayıt edildi");
            output.close();
            object.close();
            
        } catch (IOException e) {
            System.out.println("Hata oluştu");
        }
    }

}
