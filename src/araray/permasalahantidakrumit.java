/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araray;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class permasalahantidakrumit {
    public static void main(String[] args) {
        System.out.println("siapa yang duduk di meja ????");
        System.out.println();
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
       // System.out.println("-------------------------");
         String cari = JOptionPane.showInputDialog(null,"cari orang yang duduk dimeja");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                // if (meja[bar][kol].equals(cari)){
                    // JOptionPane.showMessageDialog(null,"orang yang duduk di meja" + cari + " ditemukan bernama " +meja[bar][kol]);
                 //}
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
        
       // String cari = JOptionPane.showInputDialog(null,"cari orang yang duduk dimeja");
        //for(int bar = 0; bar < meja.length; bar++){
          //  for(int kol = 0; kol < meja[bar].length; kol++){
            //    if (meja[bar][kol].equals(cari)){
              //      JOptionPane.showMessageDialog(null,"orang yang duduk di meja" + cari + " ditemukan bernama " +meja[bar][kol]);
                //}
                //System.out.format("| %s | \t", meja[bar][kol]);
            //}
            //System.out.println("");
        //}
    }
}