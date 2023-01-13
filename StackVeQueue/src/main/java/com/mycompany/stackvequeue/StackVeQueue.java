
package com.mycompany.stackvequeue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackVeQueue {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack();
        
        Scanner scanner = new Scanner(System.in);
        
        String kelime = scanner.nextLine();
        
        for(int i = 0 ; i < kelime.length() ; i++){
            stack.push(kelime.charAt(i));
        }
        
        /*
        System.out.println(stack);
        
        for(Character s : stack){
            System.out.print(s);
        }*/
        
        Queue<Integer> que = new PriorityQueue();
        que.offer(15);
        que.offer(25);
        que.offer(10);
        que.offer(5);
        
        System.out.println(que);
        
        
        
        
        
    }
}
