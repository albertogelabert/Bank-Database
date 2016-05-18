
package banc2;

import java.util.ArrayList;

/**
 * @author Frederic
 */
public class Compte {
    
    //Variables
    ArrayList<Compte> Comptes = new ArrayList<>();
    private int codi;
    private String nom;
    private int saldo;    
    
    public Compte (int codi, String nom, int saldo) {
        this.codi = codi;
        this.nom = nom;
        this.saldo = saldo;
    }
    
    public Compte () {
    }
    
    //mètodes
    public void crear (String nom, int diners, int cod) {
        Compte c = new Compte(cod, nom, diners);
        Comptes.add(c);
    }
    
    public void baixa (int cod) {
        int i = 0;
        while (i < Comptes.size()) {
            if (Comptes.get(i).codi == cod) {
                Comptes.remove(i);
            } else {
                i++;
            }
        }
    }
    
    public void depositar (int cod, int diners) {
        int i = 0;
        while (i < Comptes.size()) {
            if (Comptes.get(i).codi == cod) {
                Comptes.get(i).saldo = Comptes.get(i).saldo+diners;
            } else {
                i++;
            }
        }
    }
    
    public void retirar (int cod, int diners) {
        int i = 0;
        while (i < Comptes.size()) {
            if (Comptes.get(i).codi == cod) {
                Comptes.get(i).saldo = Comptes.get(i).saldo-diners;
            } else {
                i++;
            }
        }
    }
    
    //consulta 1
    public int Saldo (int cod) {
        int diners = 0;
        for (int i = 0; i < Comptes.size(); i++) {
            if (Comptes.get(i).codi == cod) {
                diners = Comptes.get(i).saldo;
            }
        }
        return diners;
    }
    
    public String Propietari (int cod) {
        String prop = "";
        for (int i = 0; i < Comptes.size(); i++) {
            if (Comptes.get(i).codi == cod) {
                prop = Comptes.get(i).nom;
            }
        }
        return prop;
    }
    
    //consulta 2
    public int Codi (String nom) {
        int codi = 0;
        for (int i = 0; i < Comptes.size(); i++) {
            if (Comptes.get(i).nom.equalsIgnoreCase(nom) == true) {
                codi = Comptes.get(i).codi;
            }
        }
        return codi;
    }
    
    public int Saldo (String nom) {
        int saldo = 0;
        for (int i = 0; i < Comptes.size(); i++) {
            if (Comptes.get(i).nom.equalsIgnoreCase(nom) == true) {
                saldo = Comptes.get(i).saldo;
            }
        }
        return saldo;
    }
    
    public int getCod (Compte c) {
        int codi = c.codi;
        return codi;
    }
    
    public String getNom (Compte c) {
        String n = c.nom;
        return n;
    }
    
    public int getS (Compte c) {
        int s = c.saldo;
        return s;
    }
    
}
