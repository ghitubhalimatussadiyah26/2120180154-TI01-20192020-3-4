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
public class ima5 {
    public static void main(String[] args){
        int g,h,i;
        int n=10;
        int ima=n;
        for (g=(n);g>0;g--){
            for (h=0;h<ima;h++){
                System.out.print(" ");
            }
            for(i=0;i<g;i++){
                System.out.print("5 ");
            }
            System.out.println();
            ima++;
        }
    }
}
