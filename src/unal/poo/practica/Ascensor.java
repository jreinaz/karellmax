/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.Robot;
import becker.robots.City;
import java.util.Scanner;
import java.util.ArrayList;
import becker.robots.Direction;
import becker.robots.icons.Icon;
import java.awt.Color;
import unal.poo.practica.Persona;
import unal.poo.practica.Ascensor;
import becker.robots.Thing;
import static unal.poo.practica.Persona.caminar2;
import static unal.poo.practica.RobotBase2.estudiante;
/**
 *
 * @author Sebastian
 */
public class Ascensor {
    
    private static City objetos;
    private static Robot estudiante;
    private static Thing thing; 
    private int x;
    private int y;
    private ArrayList<Persona> personas;   
    
    

    public Ascensor(int x, int y) {
        this.x = x;
        this.y = y;
        this.personas = new ArrayList<>();
    }

    public static City getObjetos() {
        return objetos;
    }

    public static void setObjetos(City objetos) {
        Ascensor.objetos = objetos;
    }
    
    
    public static Robot getEstudiante() {
        return estudiante;
    }

    public static void setEstudiante(Robot estudiante) {
        Ascensor.estudiante = estudiante;
    }

    public static Thing getThing() {
        return thing;
    }

    public static void setThing(Thing thing) {
        Ascensor.thing = thing;
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

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    
   /* public void cuandocaminar(){
     
       for(int i= 0;i<5;i++){
     personas.get(i).caminar(personas.get(i).getCity(),personas.get(i),(personas.get(i).setX(personas.get(i).getX()-1)),(personas.get(i).setY(y)));
     }
         
    }*/
          
    
   public static int maximo(int a , int b){
   if(a>b){
   return a;
   }else{
   return b;
   }
   }

 public static int maximo(int[] a, int n){
   if(n==1){
  return a[n-1];
  }else{
  return maximo(maximo(a,n-1),a[n-1]);
  }
  }
       
public static int maximoreal(ArrayList<Persona>personas,int opcion)  {
if(arrtam(personas,opcion)==0){
return 6;
}else{
return maximo(getmismopiso(personas,opcion),arrtam(personas,opcion))+1;
}
}
   
 public static int arrtam (ArrayList<Persona>personas,int opcion){
   int x = 0;
   for(int i=0;i< personas.size();i++){
   if(personas.get(i).getX() == opcion){
   for(int j=1;j< personas.size();j++){
   if(personas.get(j).getX()== opcion){
   x++;
   }
   }
   }
   }
   return x;
   }    
    
    public static int [] getmismopiso (ArrayList<Persona>personas,int opcion){
   int x = 0;
   int a[];
   for(int i=0;i< personas.size();i++){
   if(personas.get(i).getX() == opcion){
   for(int j=1;j< personas.size();j++){
   if(personas.get(j).getX()== opcion){
   x++;
   }
   }
   }
   }
   a = new int[x];
   for(int j=0;j<x;j++){
   for(int i=1;i<personas.size();i++){
   if(personas.get(i).getX()== opcion){
   a[j] = personas.get(i).getY();
   }
   }
   }
 return a;
 }    
     
    /* for(int l=0;l<personas.size();l++){
        for(int i=0;i<personas.size();i++){
            
            if(personas.get(i).getX() == opcion ){
                 for(int j= 0; i<personas.size();i++){
                    
                    if(personas.get(j).getX() == opcion ){
                        if (personas.get(i).getY()<= personas.get(j).getY()){
                           x = personas.get(j).getY();
                        }else{
                           x = personas.get(i).getY();
                     }
                   }
                 }  
                }
              }
     }
     if (x == 0 ){
     x = 3;
     return x;
     }else{
     return x+1;
     }*/
  

    
    public void escanear(){
       
    }
    
    


     public static void cuandocaminar(City objetos,ArrayList<Persona>personas,int opcion,Robot estudiante){
        int y = 2;
         for(int i=0;i<personas.size();i++){
            if(personas.get(i).getY()>2){
            if(personas.get(i).getX() == opcion ){
          Persona.caminar2(objetos,personas,i,personas.get(i).getX(),personas.get(i).getY()-1);
           
          }
         }
        }
        
        }
     
     public static void baja(City objetos,ArrayList<Persona>personas,int opcion, int x,Robot estudiante){
       
         for(int i= 0; i<personas.size();i++){
             if(personas.get(i).getPisodestino() == opcion  && personas.get(i).getY()== estudiante.getAvenue()){
               estudiante.putThing(personas.get(i).getThing());
               System.out.println(" x: " + x);
              caminar2(objetos,personas,i,opcion,x);
            personas.get(i).setPisodestino(10);     
             }
             
          }
            

     
      };

    
 
     
public static void random(City objetos,Robot estudiante,ArrayList<Persona> personas){
     
    
    int  opcion;
    do{
      int x = estudiante.getAvenue(); 
      int y = estudiante.getStreet();
      opcion = 11 - y; 
        
       switch(opcion){
           
           case 1: 
                
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                  opcion = y;
                  
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
                   
              while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
                 
               
               
               if(estudiante.frontIsClear() == true){
               estudiante.move();
               }else{
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.move();
               }
                System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
                random(objetos,estudiante,personas);
                
           case 2:
               opcion = y;
                 
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
              
                 
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
                estudiante.move();
                System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
                 
                random(objetos,estudiante,personas);
           case 3:
               opcion = y;
              
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                 
                 
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
           
                estudiante.move();
                System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack()); 
                random(objetos,estudiante,personas);
           case 4:
               opcion = y;
            
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
               
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
               System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
                estudiante.move();
                random(objetos,estudiante,personas);
           case 5:
               opcion = y;
               
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
                  
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
                estudiante.move();
                random(objetos,estudiante,personas);
           case 6:
               opcion = y;
               
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
              
               
               
                estudiante.move();
                random(objetos,estudiante,personas);
           case 7:
               opcion = y;

                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
              while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
                estudiante.move();
                random(objetos,estudiante,personas);
           case 8:
               opcion = y;
                 
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
               
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
              
                System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
                estudiante.move();
                random(objetos,estudiante,personas);
           case 9:   
               opcion = y;
         
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
               
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
                estudiante.move();
                random(objetos,estudiante,personas);
              
                case 10:
               opcion = y;
               
                  baja(objetos,personas,opcion,maximoreal(personas,opcion),estudiante);
                  
                    
               while(estudiante.countThingsInBackpack() != 5 ){                  
                opcion = y;    
               if(estudiante.countThingsInBackpack()<5){
                   
               cuandocaminar(objetos,personas,opcion,estudiante);
               if( estudiante.canPickThing()){
                 estudiante.pickThing();
                
                      }else{
                            break; 
                        }
                    }
                 }
               
               
               if(estudiante.frontIsClear() == true){
               System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());    
               estudiante.move();
               }else{
                   estudiante.turnLeft();
                   estudiante.turnLeft();
                   estudiante.move();
               }
               System.out.println("Personas en el elevador  "+estudiante.countThingsInBackpack());
               random(objetos,estudiante,personas);
               
       }
        
    
  
}while(opcion != 11);
                }

  
}
