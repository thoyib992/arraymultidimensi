/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package araray;

/**
 *
 * @author pc
 */
public class matriks {
    public static void main(String[] args) {
        System.out.println("MEN CETAK MATRIKS A DAN  B");
        
        
        int matriksA[][]={{7,9,5},{1,5,0},{4,1,2}};
        int matriksB[][]={{5,7,3},{0,4,6},{3,4,5}};
        System.out.println("matriks A");
        for(int i=0;i<matriksA.length;i++){
            for (int j=0 ; j<matriksA[0].length ; j++){
                System.out.print(matriksA [i][j]
                        +"  ");
            }
            System.out.println();
        }
        
           
            System.out.println("matriks B");
            for(int i=0; i<matriksB.length;i++){
            for (int j=0 ; j<matriksB [0].length ; j++){
                System.out.print(matriksB[i][j]+"  ");
            }
            System.out.println();
            }
            
            
                System.out.println("pengurangan");
                
                int matriksC[][]=new int [matriksA.length][matriksA[0].length];
                System.out.println();
                System.out.println("hasil pengurangan");
                System.out.println();
                for (int m=0;m<matriksC.length;m++){
                    for(int n=0;n<matriksC[0].length;n++){
                        matriksC [m][n] =matriksA [m][n]-matriksB [m][n];
                        System.out.print(matriksC [m][n]+"\t");
                    }
                    System.out.println();
                }
                System.out.println("penjumlahan");
                System.out.println();
                System.out.println("hasil penjum lahan");
                System.out.println();
               for (int m=0;m<matriksC.length;m++){
                    for(int n=0;n<matriksC[0].length;n++){
                        matriksC [m][n] =matriksA [m][n]+matriksB [m][n];
                        System.out.print(matriksC [m][n]+"\t");
                    }
                    System.out.println();
                
                }
               
               System.out.println("perkalian matriks");
               System.out.println();
               System.out.println("hasil perkalian");
               System.out.println();
               for (int i=0;i<matriksC.length;i++){
                   for (int j=0;j<matriksC[0].length;j++){
                       matriksC [i][j]= matriksA[i][j]*matriksB[i][j];
                       System.out.print(matriksC [i][j]+"\t");
                   }
                   System.out.println(" ");
               }
        }
    }

