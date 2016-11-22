package com.blogspot.melanydesirima.app12141365;

/**
 * UTS Java Semester 5
 * TI Malam - 12141365
 * @author Desi Rima Melany
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TebakAngka {
public static void main(String[] args) {
    ArrayList <String> player = new ArrayList<>();
    ArrayList <Integer> score = new ArrayList<>();
    Scanner input1 = new Scanner(System.in);
    Scanner input2= new Scanner(System.in);
    Random acakAngka=new Random();
        
        String Y;
        do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter : ");
            Y=input1.nextLine();
            player.add(Y);
                
            
        }        
        while(!"y".equals(Y));
        
    }
}
