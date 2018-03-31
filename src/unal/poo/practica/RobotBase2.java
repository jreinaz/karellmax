/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import java.util.Scanner;
import becker.robots.Thing;
import becker.robots.City;
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
public class RobotBase2 {
           //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static Thing thing; 
        public static ArrayList <Persona> personas = new ArrayList(); 
        public static City objetos;
        public static Robot estudiante;
        public static int x;
        public static int y; 
      
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\karell\\src\\unal\\poo\\practica\\Field2.txt");
	    objetos.showThingCounts(true);
            estudiante = new Robot(objetos,10,2,Direction.NORTH,0);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            Scanner sih = new Scanner(System.in);
           
           
            muchapeople(sih,personas);
            estudiante.turnLeft();
            estudiante.turnLeft();
            //Persona p1 =  new Persona(objetos,thing,4,9,2);
            Ascensor.random(objetos, estudiante, personas);
            
           
/*            Persona persona2 = new Persona(objetos,thing,0,10,3);
            Persona persona3 = new Persona(objetos,thing,0,10,4);
            Persona persona4 = new Persona(objetos,thing,0,10,5);
            Persona persona5 = new Persona(objetos,thing,0,10,6);
         
            estudiante.pickThing(persona.getThing());
            persona2.caminar(objetos,persona2,10,2); 
            persona3.caminar(objetos,persona3,10,3);
            persona4.caminar(objetos,persona4,10,4);
            persona5.caminar(objetos,persona5,10,5);
            estudiante.pickThing(persona2.getThing());
            persona3.caminar(objetos,persona3,10,2);
            persona4.caminar(objetos,persona4,10,3);
            persona5.caminar(objetos,persona5,10,4);
            estudiante.pickThing(persona3.getThing());
            persona4.caminar(objetos,persona4,10,2);
            persona5.caminar(objetos,persona5,10,3);
            estudiante.pickThing(persona4.getThing());
            persona5.caminar(objetos,persona5,10,2);
            estudiante.pickThing(persona5.getThing());
            
             ascensormove(persona.getPisodestino());
            ascensormove(persona2.getPisodestino());
            ascensormove(persona3.getPisodestino());
            ascensormove(persona4.getPisodestino());
            ascensormove(persona5.getPisodestino());*/
            
            //estudiante.pickThing();
            //creacionFuncion(8);
            //muchrot(3);
            // Persona.remover(persona.getThing());
            //estudiante.move();
            //estudiante.move();
            //persona.caminar(objetos,persona,2,3);
            
            /*persona.setX(2);
            persona.setY(3);
            persona.setThing(Persona.create(objetos, persona.getThing(),persona.getX(),persona.getY()));
            */
            //muchrot(4);
          
           /* Persona.remover(persona.getThing());
            Persona.create(objetos,persona.getThing(),4,5);
            */
           /* persona.caminar(objetos,persona,4,5);
            persona.caminar(objetos,persona,4,3);
            persona.caminar(objetos,persona,4,2);
            muchrot(2);
            creacionFuncion(2);
            estudiante.turnLeft();
            creacionFuncion(2);
            estudiante.pickThing(persona.getThing());
            estudiante.turnLeft();
            estudiante.move();
            System.out.println(estudiante.canPickThing());
            creacionFuncion(2);
            System.out.println(estudiante.canPickThing());*/
            
            
            
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.

           /* System.out.println(persona.getX());
            System.out.println(persona.getY());*/
            //ponercosas(10);
            //movimiento1();

            
            //Especifica el numero de Thing que tiene en robot en el bolso
            //int numeroThings = estudiante.countThingsInBackpack();
            
            //Poner Thing, se debe validar que tenga things en el bolso
            //estudiante.putThing();
                       
            //Si el frente esta libre de Wall
            //estudiante.frontIsClear();
            
            //Invocando una funcion
         
            
            //Toman un Thing
            //estudiante.pickThing();
            
            
	}
        
        /*public Thing move(Thing t1,int a, int b){
       
        }*/

        /*public static void caminar(City city,Persona persona,int a, int b){
        persona.setX(a);
        persona.setY(b);
        Persona.remover(persona.getThing());
        persona.setThing(Persona.create(objetos, persona.getThing(),persona.getX(),persona.getY()));
        }*/
        
        public static void ascensormove(int n){
        creacionFuncion(n);
        }
        
        public static void preguntapiso(Scanner sih, Persona persona){
        int n = sih.nextInt();
        persona.setPisodestino(n);
        }
        
        public static void remove(Thing t1){
        t1.setCanBeCarried(false);
        t1.setIcon(null);
        }
         
      
       
        
        public static Thing create(Thing x,int a,int b){
        x = new Thing(objetos,a,b);
        return x;
        }
        
        public static void moved(Thing t1,int a , int b){
        t1.setCanBeCarried(false);
        t1.setIcon(null);
        t1 = new Thing(objetos,a,b);
        }
        
        public static void mover(int n){
        for(int i=n;i>=0;i--){
        Thing t1 = create(thing,10,i);
        remove(t1);
        }
        }
        
    /**
     *
     * @param x
     * @param a
     * @param b
     * @return
     */
    public static Thing move(Thing x, int a, int b){
            x.setCanBeCarried(false);
            x.setIcon(null);
            x = new Thing(objetos,a,b);
            x.setCanBeCarried(true);
            return x;
        }
        
        public static void entrarthing(Thing t1,int a){
        for(int i=3;i<=a+2;i++){
           t1 = new Thing(objetos,10,i);
        }
        }
        
        public static void erasething(Thing t1){
            t1.setIcon(null);
        } 
       
        public static void ponercosas(int cosas){
         for(int i=0;i<cosas;i++){
             estudiante.move(); 
             estudiante.putThing();
         }
        
        }
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < parametroEntrada; i++) 
                estudiante.move();
        }
        public static void muchpicking(int a){
           for(int i=0;i<a;i++){
               estudiante.pickThing();
           };
        };
        
        public static void muchrot(int a){
           for(int i=0;i<a;i++){
               estudiante.turnLeft();
           };
        };
        
        public static void giro(int a){
          for(int i=0;i<a;i++){
          muchrot(2);
          estudiante.move();
          muchrot(3);
          creacionFuncion(3);
          muchrot(3);
          creacionFuncion(3);
          muchrot(3);
          creacionFuncion(3);
          muchrot(3);
          creacionFuncion(2);
          muchrot(2);
          };  
        };
        
        public static void movimiento1(){
             muchrot(3);
             estudiante.move();
             estudiante.turnLeft();
             estudiante.move();
             estudiante.turnLeft();
             estudiante.move();
             boolean puedeTomar = estudiante.canPickThing();
             if(puedeTomar == true)
             estudiante.pickThing();
             muchrot(2);
             estudiante.move();
             muchrot(3);
             estudiante.move();
             muchrot(3);
             estudiante.move();
             muchrot(3);
        }
      
       
       
          
      public static void muchapeople(Scanner sih,ArrayList <Persona> personas){
          
          System.out.println("crear mas personas presione numeros diferentes de cero");
          System.out.println("dejar de crar personas 0");
           int l = sih.nextInt();
          int count = 0;
          do{
              
             System.out.println("columna");
             int y = sih.nextInt();
             System.out.println("columna entre 3 y 7");
             if(y<3 || y>7){
                  y = sih.nextInt();
             }
             System.out.println("ingresar fila");
             int x = sih.nextInt();
             System.out.println("ingresar fila que este entre 1 y 10");
             if(x<1 || x>10){
                  x = sih.nextInt();
             }
             System.out.println("ingresar destino");
             int d = sih.nextInt();
             if(d>10 || d<1){
                 System.out.println("ingresar destino emtre 1 y 10");
                  d = sih.nextInt();
             }
             personas.add(count,crearpersona(objetos,thing,d,x,y));
             System.out.println("crear mas personas presione numeros diferentes de cero");
             System.out.println("dejar de crar personas 0");
             l = sih.nextInt();
              count = count + 1;
          }while(l != 0);
      }  
        
     /*  public static Persona createpeople(Thing thing,int d,int x, int y){
       Persona personagenerica = new Persona(objetos,thing,d,x,y);
            return personagenerica;       
   }
   */
        public static Persona crearpersona(City city, Thing thing,int d, int x, int y){
        Persona p = new Persona(city,thing,d,x,y);
        return p;
        }   
   
  
    
       
}
