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
public class Punkt2d {
    public int x;
    public int y;
    
    public Punkt2d(){
        x=0;
        y=0;
    }
    public Punkt2d(int x, int y){
        this.x=x;
        this.y=y;
                
    }
    public int gx(){
        return x;
    }
    public int gy(){
        return y;
    }
    
          public Punkt2d losowanie(){
                  Random random = new Random();
                  int a = random.nextInt(21)-10;
                  int b = random.nextInt(21)-10;
                  Punkt2d d = new Punkt2d(a,b);
              return d;
          }
              public String toString(){
                   return x + "," + y;
              }
              
              
          }
    

