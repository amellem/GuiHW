/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guihw;

/**
 *
 * @author Cloudaerius
 */
public class ConvertStringToDoubleStrategy {

    private String input;
    private double convertedString;

    public ConvertStringToDoubleStrategy() {
    }    
    
    public ConvertStringToDoubleStrategy(String input) {
        this.input = input;
    }
    
    public double convertString(String input){
        convertedString = Double.parseDouble(input);
        return convertedString;
    }

    @Override
    public String toString() {
        return " " + convertedString;
    }
    
    
}
