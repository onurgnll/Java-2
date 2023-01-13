package com.mycompany.koleksiyonlar.alistirma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class KoleksiyonlarAlistirma {

    public static void randomKick(ArrayList listname){
        
        Random random = new Random();
        int a = random.nextInt(listname.size());
        System.out.println( "\""+listname.get(a)+"\"" + " Oyuncusu Sunucudan Atıldı");
        
        listname.remove(a);
    }
    
    public static void diziyeEkle(ArrayList listname, String willadd ,int capacity) {
        if (listname.size() < capacity){
            listname.add(willadd);
        }
        else{
            System.out.println("\""+ willadd + "\"" + " Adlı Oyuncu iceriye alınamadı Sunucu dolu ! \nSunucudaki Oyuncu Sayısı = " + listname.size());
        } 
    }
    
    public static void sirayaEkle(Queue kuyruk, String eklenecek){
        
        kuyruk.add(eklenecek);
        System.out.println(eklenecek + " Kisisi Siraya eklendi");
    }
    
    
    public static void main(String[] args) {
        
        
        int maxcapacity =5;
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <String> icerdekiler = new ArrayList<String>(5);
        
        Queue<String> sira = new LinkedList<String>();
        
        
        diziyeEkle(icerdekiler,"Atakan",maxcapacity);
        diziyeEkle(icerdekiler,"Onur",maxcapacity);
        diziyeEkle(icerdekiler,"Aslı",maxcapacity);
        diziyeEkle(icerdekiler,"Duygu",maxcapacity);
        diziyeEkle(icerdekiler,"Yaşar",maxcapacity);
        diziyeEkle(icerdekiler,"Orkun",maxcapacity);
        
        System.out.println(icerdekiler);
        
        randomKick(icerdekiler);
        diziyeEkle(icerdekiler, "Şura", maxcapacity);
        
        int a = 1;
        String islemler = """
                          1.İçerdeki Oyuncuları Görüntüle
                          2.Sırayı Görüntüle
                          3.Random oyuncu at
                          4.içeriye kişi ekle
                          """;
        
        sira.add("cafer");
        sira.add("mahmut");
        sira.add("keloğlan");
        
        
        while (a != 0){
            
            
            System.out.println(islemler);
            System.out.println("Yapmak istediğiniz işlemi seçiniz");
            
            int islem = scanner.nextInt();
            
            switch (islem) {
                case 1:
                    System.out.println(icerdekiler);
                    break;
                    
                case 2:
                    System.out.println(sira);
                    break;
                case 3:
                    randomKick(icerdekiler);
                    if (sira.size() != 0)
                        diziyeEkle(icerdekiler, sira.remove(), maxcapacity);
                    break;
                case 4:
                    String eklenecek = scanner.nextLine();
                    diziyeEkle(icerdekiler, eklenecek, 5);
                    break;
                default:
                    break;
            }
            
            
            
        }
        
        
        
        
        
        
    }
    
}
