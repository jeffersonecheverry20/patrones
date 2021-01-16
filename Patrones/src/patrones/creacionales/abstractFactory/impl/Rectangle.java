/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory.impl;

import patrones.creacionales.abstractFactory.inter.IShape;

/**
 *
 * @author jeffersonecheverry
 */
public class Rectangle implements IShape {

    @Override
    public String buildShape() {
        return "My shape is Rectangle";
    }
    
}
