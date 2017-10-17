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
    public Terran(String nombre, int edificios, int tecnologias, int victorias, double ataque, double defensa){
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
    
}
