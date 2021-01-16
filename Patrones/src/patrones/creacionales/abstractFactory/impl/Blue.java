/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.creacionales.abstractFactory.impl;

import patrones.creacionales.abstractFactory.inter.IColor;

/**
 *
 * @author jeffersonecheverry
 */
public class Blue implements IColor {

    @Override
    public String assignColor() {
        return "The color assigned is Blue";
    }
    
}
