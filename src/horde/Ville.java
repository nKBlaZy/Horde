/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horde;

import java.util.ArrayList;

/**
 *
 * @author nK_BlaZy
 */
public class Ville extends Case {

    private boolean porteOuverte;
    private int nbPlanches, nbMetal, nbBoissons, nbRation;
    
    public Ville() {
        super(12, 12);
        
        this.nbPlanches = 0;
        this.nbMetal = 0;
        this.nbBoissons = 0;
        this.nbRation = 50;
        
        this.porteOuverte = false;
    }
    
    public String affichageSimple() {
        return "   VILLE   ";
    }
}
