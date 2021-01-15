/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.singleton;

/**
 *
 * @author jeffersonecheverry
 */
public class Singleton {
    
    private static Singleton singleton;
    
    private Singleton(){}
        
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }   
        return singleton;
    }
    
    
}
