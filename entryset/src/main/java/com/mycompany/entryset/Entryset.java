package com.mycompany.entryset;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Entryset {
 
    public static void main(String[] args) {
        
        TreeMap<Integer,students> map = new TreeMap();
        students ogrenci = new students("asd", "qwr", 1,5 );
        students ogrenci2 = new students("asrrrrd", "qwr", 1,5 );
        
        map.put(1, ogrenci);
        map.put(2151, ogrenci2);
        
        
        Set<Entry<Integer, students>> set = map.entrySet();
        System.out.println(set);
        
        Iterator it = set.iterator();
        
        
        for(Map.Entry<Integer,students> entry : map.entrySet()){
            System.out.println(entry.getKey() + "değeri = " + entry.getValue().isim);
        }
        
        /*
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "in değeri = " + entry.getValue());
        }*/
        
        
        
        
        
        //Set<Integer,students> anahtardegerim = new Set<Integer,students>();
        
        
        /*
        
        for (Map.Entry<Integer,students>  entry : map.entrySet()) {
            System.out.println("key ->");
            
        }*/
    }
}
