/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ima1;

/**
 *
 * @author hp
 */
public class ima6 {
    public static void main(String[] args){
        int e,f,g,h,i,j;
    int n=10;
    int ima=n-1;
    for(e=0;e<n;e++){
        for(f=0;f<ima;f++){
            System.out.print(" ");
        }
            for(g=0;g<=e;g++){
            System.out.print("6 ");
            }
            ima--;
            System.out.println();
    }
            ima=0;
                for(h=(n);h>0;h--){
                for(i=0;i<ima;i++){
                System.out.print(" ");
                }
                for(j=0;j<h;j++){
                System.out.print("6 ");
                }
            System.out.println();
            ima++;
}
    }
}

