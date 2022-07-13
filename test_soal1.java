/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class test_soal1 {
     public static void main(String[] args)
     {
         
        int[] data1 = {1, 1, 1, 2, 2, 4, 1, 1};
 
        int[] tabelFrekuensi = new int[255];
 
        for (int i=0; i<data1.length; i++) {
            tabelFrekuensi[i] = 0;
        }
 
        for (int i=0; i<data1.length; i++) {
            tabelFrekuensi[data1[i]]++;
        }
 
        int nilaiModus = 0;
        for (int i=0; i<data1.length; i++) {
            if (tabelFrekuensi[i] > nilaiModus) {
                nilaiModus = i;
            }
        }
        System.out.println("Total Data Paling Banyak Keluar Adalah " + nilaiModus + " Dengan Jumlah " + tabelFrekuensi[nilaiModus] + " kali");
     }
       static {

        int[] data2 = {2, 1, 2, 2, 2, 8, 1, 1};
 
        int[] tabelFrekuensi = new int[255];
 
        for (int i=0; i<data2.length; i++) {
            tabelFrekuensi[i] = 0;
        }
 
        for (int i=0; i<data2.length; i++) {
            tabelFrekuensi[data2[i]]++;
        }
 
        int nilaiModus = 0;
        for (int i=0; i<data2.length; i++) {
            if (tabelFrekuensi[i] > nilaiModus) {
                nilaiModus = i;
            }
        }

        System.out.println("Total Data Paling Banyak Keluar Adalah " + nilaiModus + " Dengan Jumlah " + tabelFrekuensi[nilaiModus] + " kali");
    }
     static {
     int[] data3 = {3, 3, 3, 3, 2, 4, 1, 1};
 
        int[] tabelFrekuensi = new int[255];

        for (int i=0; i<data3.length; i++) {
            tabelFrekuensi[i] = 0;
        }

        for (int i=0; i<data3.length; i++) {
            tabelFrekuensi[data3[i]]++;
        }

        int nilaiModus = 0;
        for (int i=0; i<data3.length; i++) {
            if (tabelFrekuensi[i] > nilaiModus) {
                nilaiModus = i;
            }
        }

        System.out.println("Total Data Paling Banyak Keluar Adalah " + nilaiModus + " Dengan Jumlah " + tabelFrekuensi[nilaiModus] + " kali");
     }
     {
     
     }
}
