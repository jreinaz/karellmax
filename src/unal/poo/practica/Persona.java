/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.Thing;
import becker.robots.City;
import java.util.Scanner;

import java.util.ArrayList;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.icons.Icon;
import java.awt.Color;
import unal.poo.practica.Persona;
import unal.poo.practica.Ascensor;
/**
 *
 * @author Sebastian
 */
public class Persona {
    private City city;
    private Thing thing;
    private int actualpiso;
    private int pisodestino;
    private int x;
    private int y;

    public Persona(City city, Thing thing, int pisodestino, int x, int y) {
        this.thing = new Thing(city,x,y);
        this.actualpiso = y;
        this.pisodestino = pisodestino;
        this.x = x;
        this.y = y;
             
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Thing getThing() {
        return thing;
    }

    public void setThing(Thing thing) {
        this.thing = thing;
    }

    public int getActualpiso() {
        return actualpiso;
    }

    public void setActualpiso(int actualpiso) {
        this.actualpiso = actualpiso;
    }

    public int getPisodestino() {
        return pisodestino;
    }

    public void setPisodestino(int pisodestino) {
        this.pisodestino = pisodestino;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
     public static void remover(Thing x){
        x.setCanBeCarried(false);
        x.setIcon(null);
     }
     
     public static Thing create(City city,Thing x,int a,int b){
        x = new Thing(city,a,b);
        return x;
     }
    
        public static void caminar(City city,Persona persona,int a, int b){
        persona.setX(a);
        persona.setY(b);
        Persona.remover(persona.getThing());
        persona.setThing(Persona.create(city, persona.getThing(),persona.getX(),persona.getY()));
        }

     public static void remover2(ArrayList<Persona>personas,int n){
        personas.get(n).getThing().setCanBeCarried(false);
        personas.get(n).getThing().setIcon(null);
     }
     
    
     
  
          public static void caminar2(City city,ArrayList<Persona>personas,int n,int a, int b){
            personas.get(n).setX(a);
            personas.get(n).setY(b);
            Persona.remover2(personas, n);
           personas.get(n).setThing(Persona.create(city, personas.get(n).getThing(), a, b));
        }
     /*public static void cuandocaminar(City city, ArrayList <Persona> personas ){
       for(int i = 0;i< 1 ;i++){
          int x = personas.get(i).getX();
          int y = personas.get(i).getY();
          int n = i;
         personas.get(i).caminar2( city ,personas,n,x,y);
       }
      }*/
           
     
}
