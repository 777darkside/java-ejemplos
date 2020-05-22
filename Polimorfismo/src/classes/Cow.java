/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author David
 */
public class Cow extends Animal {
    public String dice() {
        return "muuu";
    }
    
    @Override
    public String ordenar() {
        return "se está ordeñando";
    }
}
