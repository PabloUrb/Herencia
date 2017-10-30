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

public class Terran extends Unidad{
    private int edificios;
    private int tecnologias;
    public Terran(String nombre, int victorias ,double ataque, double defensa, int edificios, int tecnologias){
        super(nombre, victorias, ataque, defensa);
        this.edificios = edificios;
        this.tecnologias = tecnologias;
    }

    public int getEdificios() {
        return edificios;
    }

    public void setEdificios(int edificios) {
        this.edificios = edificios;
    }

    public int getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(int tecnologias) {
        this.tecnologias = tecnologias;
    }
    
    public double defTerran(double defensa){
        double defEdificios = getDefensa() * (0.25 * this.edificios);
        return defensa;
    }
    
    public double AtcTerran(double ataque){
        double atcNuevaArma = getAtaque() * (0.5 * this.tecnologias);
        return ataque;
    }
    
}
