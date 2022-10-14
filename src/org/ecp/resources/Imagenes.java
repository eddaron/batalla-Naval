/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ecp.resources;

/**
 *
 * @author Edson
 */
import java.awt.*;
public class Imagenes {
    public Image cargar(String sRuta){
        return Toolkit.getDefaultToolkit().createImage((getClass().getResource(sRuta)));
    }
}