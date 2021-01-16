/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory.factoryInter;

import patrones.creacionales.abstractFactory.inter.IColor;
import patrones.creacionales.abstractFactory.inter.IShape;

/**
 *
 * @author jeffersonecheverry
 */
public interface IFactories {
    
    public IShape getShape(String shape);
    public IColor getColor(String color);
    
}
