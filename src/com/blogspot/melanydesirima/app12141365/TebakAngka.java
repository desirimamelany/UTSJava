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
                
            int VariabelNilai = 0;
            int VarNilai=0;
            int GameOver=0;
            int ArrayNilai[]= new int[6];

            if(!("y").equals(Y)){  
                String nextLevel; 
                int Level=1; 
                System.out.println("Selamat Datang " + Y);
                
                do{
                    int Kesempatan, Ang, NilaiLevel;
                    System.out.println("# Level " + Level);
                    int StarNilaiO=Level-1;    
                    NilaiLevel=Level*100;
                    System.out.println("Silahkan tebak angka antara 1 s/d " + NilaiLevel);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int AngKaAcak=acakAngka.nextInt(NilaiLevel); 
                    
                    for(Kesempatan=0;Kesempatan<=5;Kesempatan++){
                        if(Kesempatan==5){
                            System.out.println("GAMEOVER! Anda Gagal");
                            GameOver++;
                        }
                        else{  
                            System.out.println("Tebakan Anda ? " + AngKaAcak);
                            int Tebakan=input2.nextInt();
                            int Kurang=4-Kesempatan;
                            if(Tebakan==AngKaAcak){
                                
                                switch (Kesempatan) {
                                    case 0:
                                        VarNilai=Level*100;
                                        break;
                                    case 1:
                                        VarNilai=Level*70;
                                        break;
                                    case 2:
                                        VarNilai=Level*50; 
                                        break;
                                    case 3:
                                        VarNilai=Level*30;
                                        break;
                                    default:
                                        VarNilai=0;
                                        break;
                                }
                                
                                int NeTebak=Kesempatan+1;
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + NeTebak + " kali tebakan. Sekor anda adalah " + VarNilai);
                                break;

                            }
                            else{
                                if(Tebakan>AngKaAcak){
                                    System.out.println("Tebakan Anda terlalu Besar! Anda mempunyai kesempatan " + Kurang + " kali lagi" ); // Jika Tebakan lebih besar dari angka random
                                }
                                else{

                                    System.out.println("Tebakan Anda terlalu Kecil! Anda mempunyai kesempatan " + Kurang + " kali lagi" ); // Jika tebakan lebih kecil dari angka random
                                }
                            }
                        }
                    }

                    if(GameOver>0){
                        break;
                    }

                    if(Level==5){ 
                        break;
                    }
                    else{
                    ArrayNilai[StarNilaiO]=VarNilai; 
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau ketik 'exit' untuk keluar : ");
                    nextLevel=input1.nextLine(); 
                    Level++;      
                    }                   
                }
                while(!"exit".equals(nextLevel));
            } 
            for(int rO=0; rO<5; rO++){ 
                VariabelNilai=VariabelNilai+ArrayNilai[rO];  
            }
            score.add(VariabelNilai);                      
        }        
        while(!"y".equals(Y));
        int jumPemain=player.size(); 
        System.out.println("SCORE AKHIR");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(player.get(l) + " : " + score.get(l)); 
        }
    }
}
