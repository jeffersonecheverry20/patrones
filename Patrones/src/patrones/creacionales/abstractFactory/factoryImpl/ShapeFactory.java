/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory.factoryImpl;

import patrones.creacionales.abstractFactory.factoryInter.IFactories;
import patrones.creacionales.abstractFactory.impl.Circle;
import patrones.creacionales.abstractFactory.impl.Rectangle;
import patrones.creacionales.abstractFactory.impl.Square;
import patrones.creacionales.abstractFactory.inter.IColor;
import patrones.creacionales.abstractFactory.inter.IShape;

/**
 *
 * @author jeffersonecheverry
 */
public class ShapeFactory implements IFactories{

    @Override
    public IShape getShape(String shape) {
        
        switch(shape){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
            default:
                break;
        }
        return null;
    }

    @Override
    public IColor getColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
