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
                    
                    
                    // Jika GameOver, game over dideteksi dari looping ke-6 yang tidak memunculkan input
                    // jawaban, tetapi langsung memberikan nilai ke CekGameOver,
                    if(GameOver>0){
                        break;
                    }
                    // Level 5 adalah Level Maksimal
                    if(Level==5){ // Jika sudah Mencapai Level 5, langsung di break/otomatis Exit
                        break;
                    }
                    else{
                    ArrayNilai[StarNilaiO]=VarNilai; // Membuat Array Nilai   
                    System.out.println("Ketik 'next' dan tekan enter untuk lanjut ke Level berikutnya atau ketik 'exit' untuk keluar : ");
                    nextLevel=input1.nextLine(); // inputan next level atau exit
                    Level++; // Level bertambah setelah input Next Level
                    
                    }
                   
                }
                while(!"exit".equals(nextLevel));
              
            // ------------------- END OF SCRIPT GAME TEBAK
            } // Stop Looping Nama Pemain
            // Ngolah Nilai
            for(int rO=0; rO<5; rO++){ // membuat array nilai pada tiap level, untuk kemudian dijumlahkan
                VariabelNilai=VariabelNilai+ArrayNilai[rO];  
            }
            score.add(VariabelNilai); // Menambahkan Nilai Akhir pada masing masing peserta
            // SCORE SEMENTARA          
        }        
        while(!"y".equals(Y));
        int jumPemain=player.size(); // Mengambil jumlah Rercord dalam array, dan untuk menghilangkan y paling belakang pada loop dikurangi 1 (-1)
        System.out.println("SCORE AKHIR");
        System.out.println("=================================");
        int l;
        for(l=0;l<jumPemain-1;l++){
            System.out.println(player.get(l) + " : " + score.get(l)); // Menampilkan Skore di Akhir permainan
        }
    }
}
