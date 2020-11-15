/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author laura
 */
public class Arreglos {
    
    public boolean vacio(int datos[]){
        for (int dato : datos) {
            if(dato!=0){
                return false;
            }
        }
        return true;
    }
    
    public int suma(int datos[]) throws VacioException{
        
        int suma = 0;
        
        if(vacio(datos)) throw new VacioException("El arreglo esta vacio");
        
        for (int dato : datos) { 
            suma = suma + dato;
        }
        
        return suma;
    }
    
    public int mayor(int datos[]) throws VacioException{
        
        int mayor = 0;
        
        if(vacio(datos)) throw new VacioException("El arreglo esta vacio");
        
        for (int dato : datos) { 
            if(mayor > dato){
                mayor = dato;
            }
        }
        
        return mayor;
    }
    
    public int menor(int datos[]) throws VacioException{
        
        int menor = 0;
        
        if(vacio(datos)) throw new VacioException("El arreglo esta vacio");
        
        for (int dato : datos) { 
            if(menor < dato){
                menor = dato;
            }
        }
        
        return menor;
    }
    
    public int busca (int n, int datos[]) throws VacioException{
        
        int valor = 0;
        
        if(vacio(datos)) throw new VacioException("El arreglo esta vacio");
        
        for (int i = 0; i < datos.length; i++) {
            if(n == datos[i]){
                return i;
            }
        }
        
        return -1;
    }
    
    
}

