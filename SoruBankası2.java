package sorubankası2;


import java.io.IOException;
import java.util.Scanner;
public class SoruBankası2 {

    static int secim;
    static Scanner klavye = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        kolaySorular k = new kolaySorular();
        ortaSorular o = new ortaSorular();
        zorSorular z = new zorSorular();
       

        while (true) {
            System.out.println("----------Soru Bankası----------");
            System.out.println("1-Teste Başla");
            System.out.println("2-Soru Ekle");
            System.out.println("3-Soru Sil");
            System.out.println("4-Arayarak Soru Sil");
            System.out.println("5-Soruları Listele");
            System.out.println("6-Random Teste Başla");
            System.out.println("7-Sınav");
            System.out.println("8-Soruları Kayıt et (.dat olarak)");
            System.out.println("9-Çıkış");

            secim = klavye.nextInt();
            switch (secim) {

                case 1: {
                    System.out.println("Zorluk düzeyini seçiniz"
                            + "\n1-Kolay\n2-Orta\n3-Zor");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        k.testYap();
                        break;
                    } else if (secim == 2) {
                        o.testYap();
                        break;
                    } else if (secim == 3) {
                        z.testYap();
                        break;
                    }
                }
                case 2: {
                    System.out.println("Hangi düzeyde soru eklemek istiyorsunuz."
                            + "\n1-Kolay\n2-Orta\n3-Zor");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        System.out.println("Ne tür soru eklemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.testEkle();
                        } else if (secim == 2) {
                            k.boslukEkle();
                        } else if (secim == 3) {
                            k.dyEkle();
                        } else if (secim == 4) {
                            k.klasikEkle();
                        }
                        break;
                    } else if (secim == 2) {
                        System.out.println("Ne tür soru eklemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            o.testEkle();
                        } else if (secim == 2) {
                            o.boslukEkle();
                        } else if (secim == 3) {
                            o.dyEkle();
                        } else if (secim == 4) {
                            o.klasikEkle();
                        }

                        break;
                    } else if (secim == 3) {
                        System.out.println("Ne tür soru eklemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            z.testEkle();
                        } else if (secim == 2) {
                            z.boslukEkle();
                        } else if (secim == 3) {
                            z.dyEkle();
                        } else if (secim == 4) {
                            z.klasikEkle();
                        }

                        break;
                    }
                }
                case 3: {

                    System.out.println("Hangi düzey soruları silmek istiyorsunuz."
                            + "\n1-Kolay\n2-Orta\n3-Zor");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.testSil();
                        } else if (secim == 2) {
                            k.boslukSil();
                        } else if (secim == 3) {
                            k.dySil();
                        } else if (secim == 4) {
                            k.klasikSil();
                        }
                        break;
                    } else if (secim == 2) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            o.testSil();
                        } else if (secim == 2) {
                            o.boslukSil();
                        } else if (secim == 3) {
                            o.dySil();
                        } else if (secim == 4) {
                            o.klasikSil();
                        }
                        break;
                    } else if (secim == 3) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            z.testSil();
                        } else if (secim == 2) {
                            z.boslukSil();
                        } else if (secim == 3) {
                            z.dySil();
                        } else if (secim == 4) {
                            z.klasikSil();
                        }
                        break;
                    }
                }
                case 4: {
                    System.out.println("Hangi düzeyde soru aramak istiyorsunuz."
                            + "\n1-Kolay\n2-Orta\n3-Zor");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.testArayarakSil();
                        } else if (secim == 2) {
                            k.boslukArayarakSil();
                        } else if (secim == 3) {
                            k.dyArayarakSil();
                        } else if (secim == 4) {
                            k.klasikArayarakSil();
                        }
                        break;
                    } else if (secim == 2) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            o.testArayarakSil();
                        } else if (secim == 2) {
                            o.boslukArayarakSil();
                        } else if (secim == 3) {
                            o.dyArayarakSil();
                        } else if (secim == 4) {
                            o.klasikArayarakSil();
                        }
                        break;
                    } else if (secim == 3) {
                        System.out.println("Ne tür soru silmek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            o.testArayarakSil();
                        } else if (secim == 2) {
                            o.boslukArayarakSil();
                        } else if (secim == 3) {
                            o.dyArayarakSil();
                        } else if (secim == 4) {
                            o.klasikArayarakSil();
                        }
                        break;
                    }
                }
                case 5: {
                    System.out.println("Listelemek istediğiniz soruların düzeyini seçin."
                            + "\n1-Kolay\n2-Orta\n3-Zor\n");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        System.out.println("Ne tür soruları listelemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.testListele();
                        } else if (secim == 2) {
                            k.boslukListele();
                        } else if (secim == 3) {
                            k.dyListele();
                        } else if (secim == 4) {
                            k.klasikListele();
                        }
                        break;
                    } else if (secim == 2) {
                        System.out.println("Ne tür soruları listelemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            o.testListele();
                        } else if (secim == 2) {
                            o.boslukListele();
                        } else if (secim == 3) {
                            o.dyListele();
                        } else if (secim == 4) {
                            o.klasikListele();
                        }
                        break;
                    } else if (secim == 3) {
                        System.out.println("Ne tür soruları listelemek istiyorsunuz"
                                + "\n1-Test"
                                + "\n2-Bosluk Doldurma"
                                + "\n3-Doğru Yanlış"
                                + "\n4-Klasik Soru");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            z.testListele();
                        } else if (secim == 2) {
                            z.boslukListele();
                        } else if (secim == 3) {
                            z.dyListele();
                        } else if (secim == 4) {
                            z.klasikListele();
                        }
                        break;
                    }
                }

                case 6: {
                    System.out.println("Karma test bölümü"
                            + "\nHer soru 12 puandır test toplam 108 puandır "
                            + "\nBaşarılar...\n");
                    k.testRandom();
                    o.testRandom();
                    z.testRandom();
                    System.out.println("Puanınız=" + (Sorular.puan));
                    break;
                }
                case 7: {
                    System.out.println("-------Sınav Bölümü------");
                    System.out.println("Sınav türünü seçiniz"
                            + "\n1-Test"
                            + "\n2-Klasik"
                            + "\n3-Karışık");
                    secim = klavye.nextInt();
                    if (secim == 1) {
                        System.out.println("Testin zorluk derecesi ne olsun?"
                                + "\n1-Kolay"
                                + "\n2-Orta"
                                + "\n3-Zor"
                                + "\n4-Karışık");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.testYap();
                        } else if (secim == 2) {
                            o.testYap();
                        } else if (secim == 3) {
                            z.testYap();
                        } else if (secim == 4) {
                            k.testRandom();
                            o.testRandom();
                            z.testRandom();
                            System.out.println("Puanınız="+(Sorular.puan));
                        }
                        break;
                    } else if (secim == 2) {
                        System.out.println("Klasik soruların zorluk derecesi ne olsun?"
                                + "\n1-Kolay"
                                + "\n2-Orta"
                                + "\n3-Zor");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.klasikSınav();
                        } else if (secim == 2) {
                            o.klasikSınav();
                        } else if (secim == 3) {
                            z.klasikSınav();
                        } break;
                    } else if (secim == 3) {
                        System.out.println("Soruların zorluk derecesi ne olsun?"
                                + "\n1-Kolay"
                                + "\n2-Orta"
                                + "\n3-Zor");
                        secim = klavye.nextInt();
                        if (secim == 1) {
                            k.sınav();
                        } else if (secim == 2) {
                            o.sınav();
                        } else if (secim == 3) {
                            z.sınav();
                        }
                        break;
                    }
                }

                case 8: {
                    System.out.println("Soru bankasındaki hangi tür soruları kayıt etmek istiyorsunuz"
                            + "\n1-Kolay Sorular"
                            + "\n2-Orta Sorular"
                            + "\n3-Zor Sorular");
                    secim=klavye.nextInt();
                    if(secim==1){
                   k.kayıt();}
                    else if(secim==2){
                   o.kayıt();}
                    else if(secim==3){
                   z.kayıt();}
                     break;  
                }
                
                case 9:{
                System.exit(0);}

            }

        }
    }

}
