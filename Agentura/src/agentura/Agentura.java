/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 4a_babirad_n
 */
public class Agentura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agentura ag = new Agentura();
        System.out.println("to string metoda" + ag);
        MarketingovyKanal mk = new MarketingovyKanal();
        ag.broadcast("Broadcast sprava");
    }
    
    
    private final List<MarketingovyKanal> zoznamKanalov = new ArrayList();
    public void addKanal(MarketingovyKanal mk) {
        zoznamKanalov.add(mk);
    }
    
    public void broadcast(String sprava) {
        for (MarketingovyKanal kanal : zoznamKanalov) {
            kanal.posliSpravu(sprava);
        }
    }
    
    @Override
    public String toString() {
        return "Agentura{" + '}';
    }

}
