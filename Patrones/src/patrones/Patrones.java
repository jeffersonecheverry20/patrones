/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import patrones.creacionales.abstractFactory.FactoryProductor;
import patrones.creacionales.abstractFactory.factoryInter.IFactories;
import patrones.creacionales.abstractFactory.inter.IColor;
import patrones.creacionales.abstractFactory.inter.IShape;
import patrones.creacionales.factory.ConnectionFactory;
import patrones.creacionales.factory.inter.IConnection;
import patrones.creacionales.singleton.Singleton;

/**
 *
 * @author jeffersonecheverry
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Patron Singleton
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
        
        // Patron Factory
        ConnectionFactory factory = new ConnectionFactory();
        
        IConnection mySQL = factory.getConnection("MYSQL");
        System.out.println(mySQL.connect());
        System.out.println(mySQL.disconnect());
        
        IConnection postgres = factory.getConnection("POSTGRE");
        System.out.println(postgres.connect());
        System.out.println(postgres.disconnect());
        
        //Abstract Factory
        IFactories shapeFactory = FactoryProductor.getFactory("Shape");
        IShape circle = shapeFactory.getShape("Circle");
        
        IFactories colorFactory = FactoryProductor.getFactory("Color");
        IColor colorGreen = colorFactory.getColor("Green");
        
        System.out.println(circle.buildShape()+" and "+colorGreen.assignColor());
        
    }
    
}
