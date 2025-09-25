/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo_semana6_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Ejemplo_semana6_2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner sc = new Scanner(System.in);
        
        List<Persona> listaPersonas = new ArrayList();
        
        int opMenu = 0;
        do {
            System.out.println("#################################");
            System.out.println("#####   Seleccione Opcion  ######");
            System.out.println("#################################");
            System.out.println("1. Crear Persona");
            System.out.println("2. Buscar una Persona");
            System.out.println("3. Listar todas las Personas");
            System.out.println("4. Editar una Personas");
            System.out.println("5. Eliminar persona");
            System.out.println("6. Salir");
            
            opMenu = Integer.parseInt(sc.nextLine());
            
            
            switch(opMenu){
                case 1:
                    
                    System.out.println("Ingrese el rut de la persona: ");
                    String rut = sc.nextLine();
                    System.out.println("Ingrese Nombre de la Persona: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese edad de la Persona: ");
                    int edad = Integer.parseInt(sc.nextLine());
                    Persona persona = new Persona(edad, rut, nombre);
                    listaPersonas.add(persona);
                    
                    
                    break;
                case 2:
                    boolean encontrado = false;
                    System.out.println("Ingrese el rut de la persona: ");
                    String rutBuscado = sc.nextLine();
                    for (Persona listaPersona : listaPersonas){
                        if (listaPersona.getRut().equals(rutBuscado));
                            System.out.println(listaPersona.toString());
                            encontrado = true;
                    }
                    
                    if (!encontrado){
                        System.out.println("no se encontro nada");
                    }
                    
                    break;
                case 3:
                    
                    for (Persona personaListada : listaPersonas){
                        System.out.println(personaListada.toString());
                    }
                    
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            
        }while (opMenu != 6);
        
    }
}
