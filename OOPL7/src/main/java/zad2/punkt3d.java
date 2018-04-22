/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2;

import java.util.Random;

/**
 *
 * @author HP
 */
public class punkt3d extends Punkt2d{
    private int z;
    
    
    public punkt3d(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public punkt3d() {
    }
   
     public int gz(){
        return z;
    }
    
   
    @Override
    public punkt3d losowanie(){
    Random random = new Random();
    int a = random.nextInt(21)-10;
    int b = random.nextInt(21)-10;
    int c = random.nextInt(21)-10;              
    punkt3d d = new punkt3d(a,b,c);
              return d;
    }
    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }




}
    








