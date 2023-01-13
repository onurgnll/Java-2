/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Onur
 */
public class Collections {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> map = new TreeMap();
        
        String kelime = scanner.nextLine();
        int i;
        for (i = 0 ; i < kelime.length() ; i ++)
        {
            char c = kelime.charAt(i);
            
            if(map.containsKey(c)){
                map.replace(c, map.get(c) + 1);
            }
            else{
                map.put(c, 1);
            }
            
        }
        
        
        System.out.println(map);
    }
}
