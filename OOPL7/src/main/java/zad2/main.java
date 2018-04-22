/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
        Punkt2d[] tab2D = new Punkt2d[100];
        punkt3d[] tab3D = new punkt3d[100];

        for(int i = 0; i<100;i++){
            tab2D[i] = new Punkt2d().losowanie();
            tab3D[i] = new punkt3d().losowanie();
        }
        for(int i=0;i<100;i++){
            if (tab2D[i].gx() == tab3D[i].gx() && tab2D[i].gy() == tab3D[i].gy())
            {
            System.out.println(tab2D[i].toString()+" | "+tab3D[i].toString());
            }}
        
        
    

    
    }
}
