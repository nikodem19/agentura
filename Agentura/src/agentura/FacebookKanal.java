/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentura;

/**
 *
 * @author 4a_babirad_n
 */
public class FacebookKanal extends MarketingovyKanal {

    @Override
    public void posliSpravu(String sprava) {
        super.posliSpravu(sprava+" z "+this); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "FacebookKanal";
    }

    

    
}
