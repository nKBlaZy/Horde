/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horde;

/**
 *
 * @author nK_BlaZy
 */
public class Jeu {

    public static void main(String[] args) {
        System.out.println("Bienvenue dans Horde !!!");
        
        /* Créé la partie */
        Horde horde = Horde.nouvellePartie();
        
        /* Initialise la partie */
        horde.init();
        
        /* Lance la partie */
        horde.jouer();
        
    }
    
}
