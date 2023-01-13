package com.mycompany.telefonrehberi;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;






public class TelefonRehberi {
    
    public static void kisileriYazdir(TreeMap rehber){
        
        Set s = rehber.entrySet();
        
        Iterator it = s.iterator();
        /*
        for (Object object : rehber.entrySet()) {
            Object key = object.getKey();
            Object value = object.getValue();
            
        }
        
        
        JOptionPane.showMessageDialog(null, );*/
    }
    public static void kisiEkle(TreeMap rehber){
        String isim = JOptionPane.showInputDialog("Kişi ismini giriniz");
        String soyisim = JOptionPane.showInputDialog("Kişi soyismini giriniz");
        String numara = JOptionPane.showInputDialog("Kişi telefonunu giriniz");
        
        
        rehber.put(numara,new KisiOlustur(isim, soyisim, numara));
        
    }
    public static void kisiSil(TreeMap rehber){
        
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
    
        TreeMap rehber = new TreeMap();
        
        int a = 1;
        while (a != 0){
            
            String islem = JOptionPane.showInputDialog(null, "Rehber Uygulamasına Hoşgeldin Yapmak istediğin işlemi seç"
                    + "\n   1. Kişileri Görüntüle"
                    + "\n   2. Kişi ekle"
                    + "\n   3. Kişi sil"
                    + "\n   4. Kişi ara (numara ile)"
                    + "\n   5. Çık"
                    + "" , "Rehber" , JOptionPane.PLAIN_MESSAGE);
            
            
            switch (islem) {
                case "1":
                    kisileriYazdir(rehber);
                    System.out.println("as");
                    break;
                case "2":
                    kisiEkle(rehber);
                    System.out.println("sa");
                    break;
                case "3":
                    
                    break;
                case "4":
                    
                    break;
                case "5":
                    
                    break;
                default:
                    break;
            }
            
            
        }
        
        
        
        
    }
}
