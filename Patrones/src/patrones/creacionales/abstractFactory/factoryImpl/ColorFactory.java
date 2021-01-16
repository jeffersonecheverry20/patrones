/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory.factoryImpl;

import patrones.creacionales.abstractFactory.factoryInter.IFactories;
import patrones.creacionales.abstractFactory.impl.Blue;
import patrones.creacionales.abstractFactory.impl.Green;
import patrones.creacionales.abstractFactory.impl.Red;
import patrones.creacionales.abstractFactory.inter.IColor;
import patrones.creacionales.abstractFactory.inter.IShape;

/**
 *
 * @author jeffersonecheverry
 */
public class ColorFactory implements IFactories {

    @Override
    public IShape getShape(String shape) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IColor getColor(String color) {
        
        switch(color){
            case "Red":
                return new Red();
            case "Green":
                return new Green();
            case "Blue":
                return new Blue();
            default:
                break;
        }       
        return null;            
    }
    
}
