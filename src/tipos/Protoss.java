/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

/**
 *
 * @author DAM
 */
public class Protoss extends Unidad {

    private int pilones;

    public Protoss(String nombre, int victorias, double ataque, double defensa, int pilones) {
        super(nombre, victorias, ataque, defensa);
        this.pilones = pilones;
    }

    public int getPilones() {
        return pilones;
    }

    public void setPilones(int pilones) {
        this.pilones = pilones;
    }
    
    double AtcProtoss (double atque){
        double AtcPilon = getAtaque() * (0.5 * this.ataque);
     return atque;   
    }
    double DefProtoss (double defensa){
       double DefPilon = getDefensa() * (0.5 * this.defensa);
        return defensa;
    }


}
