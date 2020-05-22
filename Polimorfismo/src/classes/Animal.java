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
public abstract class Animal {
    private int weight = 0;
    
    public void setWeigh(int weight){
        this.weight = weight;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String say() {
        return "nope";
    } 
    
    /**
     *
     * @return
     */
    public abstract String ordenar();
}
