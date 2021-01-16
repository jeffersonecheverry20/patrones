/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory;

import patrones.creacionales.abstractFactory.factoryImpl.ColorFactory;
import patrones.creacionales.abstractFactory.factoryImpl.ShapeFactory;
import patrones.creacionales.abstractFactory.factoryInter.IFactories;

/**
 *
 * @author jeffersonecheverry
 */
public class FactoryProductor {
    
    public static IFactories getFactory(String factory) {
        
        switch(factory) {
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
            default:
                break;
        }
        
        return null;
    }
    
}
