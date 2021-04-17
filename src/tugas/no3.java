/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Kihrmwn
 */
public class no3 {
    public static void main(String[] args) {
        int[] data = {25,7,9,13,3};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=0; i<data.length-1; i++){
            int indeksKecil = i;
            for (int j=i+1; j<data.length; j++){
                if (data[j]<data[indeksKecil]){
                    indeksKecil = j;
                }
            }
            int temp = data[i];
            data[i] = data[indeksKecil];
            data[indeksKecil] = temp;
        }
        System.out.println("\nsorted by Kiki :");
        System.out.println("=== Selection Sort ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
