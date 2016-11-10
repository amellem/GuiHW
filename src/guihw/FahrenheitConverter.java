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
public class FahrenheitConverter implements ConverterService{
    
    @Override
    public double getConvertDegrees(double degrees){
        return (degrees - 32)/1.8;
    }
}
