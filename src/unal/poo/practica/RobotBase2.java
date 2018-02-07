/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author Sebastian
 */
public class RobotBase2 {
           //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("C:\\Users\\Sebastian\\Documents\\NetBeansProjects\\karell\\src\\unal\\poo\\practica\\Field2.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.

             
           
            movimiento1();
           
            
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
}
