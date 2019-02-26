/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanasopcional;

/**
 *
 * @author MARTA
 */
public class campovacio extends Exception{

    @Override
    public String getMessage() {
       
        return"campo vacio en equipo";
    }

}
