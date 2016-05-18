
package banc2;

/**
 * @author Frederic
 */

public class Banc2 { 

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Objectes inicials
        Compte c1 = new Compte(46, "fede", 23423534);
        Compte c2 = new Compte(1, "alberto", 3454645);
        Compte c3 = new Compte();
        c3.Comptes.add(c1);
        c3.Comptes.add(c2);
        
        Finestra f = new Finestra();
        f.setVisible(true);
    }
    
}
