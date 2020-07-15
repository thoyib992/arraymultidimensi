/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araray;

import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Araray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("array 1 dimensi");
        int bilangan[]={0,1,2,3,4,5,6};
        for(int i=0;i<bilangan.length;i++){
            System.out.println(i);
        }
         System.out.println("array 2 dimensi");
        int matrik[][]={{01,04},{02,03}};
        for(int i=0;i<matrik.length;i++){
            for(int j=0;j<matrik[0].length;j++){
                System.out.print(matrik[i][j]+"  ");
            }
            System.out.println("");
        }
        
        
        String nim[][]={{"01","fauzan"},{"02","thoyib"},{"03","sobat"}};
                for(int i=0;i<nim.length;i++){
            for(int j=0;j<nim[0].length;j++){
                System.out.print(nim[i][j]+"  ");
            }
            System.out.println("");
        }
          String cari = JOptionPane.showInputDialog(null,"cari mahasiswa berdasrakan nim ");
                   for(int i=0;i<nim.length;i++){
            for(int j=0;j<nim[0].length;j++){
                if(nim[i][j].equals(cari)){
                    JOptionPane.showMessageDialog(null, "masasiswa dngan nim" + cari + "ditemukan bernama " + nim [i][j+1]);
                }
                System.out.print(nim[i][j]+"  ");
            }
            System.out.println("");
        }
    }
    
}
