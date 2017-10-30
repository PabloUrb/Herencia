package herencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import tipos.Unidad;
import tipos.Terran;
import tipos.Zerg;
import tipos.Protoss;

public class Herencia {

    static ArrayList<Unidad> unidades = new ArrayList<>();
    static ArrayList<Terran> terran = new ArrayList<>();
    static ArrayList<Zerg> zerg = new ArrayList<>();
    static ArrayList<Protoss> protoss = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String opcion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("hjol");
            opcion = br.readLine();
            String[] splits = splits(opcion);
            switch (splits[0]) {
                case "A": //altaEscuadron
                    altaEscuadron(splits);
                    break;
                case "R":
                    //registrar batalla
                    break;
                case "M":
                    //mejorarescuadron
                    break;
                case "C"://mostrar clasificia
                    mostrarClasificatoria();
                    break;
                case "S":
                    System.out.println("Hasta pronto!!");
                    break;
            }
        } while (!opcion.equals("S"));

    }

    public static String[] splits(String opcion) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] splits = opcion.split(" ");
        return splits;
    }

    public static void altaEscuadron(String[] new1) {
        String nombre = "";
        double ataque = 0.0;
        double defensa = 0.0;
        int variable1 = 0;
        int variable2 = 0;
        int victorias = 0;
        nombre = new1[2];
        ataque = Double.parseDouble(new1[3]);
        defensa = Double.parseDouble(new1[4]);
        variable1 = Integer.parseInt(new1[5]);
        variable2 = Integer.parseInt(new1[6]);
        switch (new1[1]) {
            case "terran":
                System.out.println(nombre+ataque+defensa+variable1+variable2);
                Terran terran = new Terran(nombre, victorias, ataque, defensa, variable1, variable2);
                unidades.add(terran);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            case "protos":
                Protoss protos = new Protoss(nombre, victorias, ataque, defensa, variable1);
                unidades.add(protos);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            case "zerg":
                Zerg zerg = new Zerg(nombre, victorias, ataque, defensa, variable1, variable2);
                unidades.add(zerg);
                System.out.println("<OK: Escuadrón registrado>");
                break;
            default:
                System.out.println("< ERROR 002: Especie incorrecta >");
                break;
        }
    }
    public static void mostrarClasificatoria(){
        int numero = 1;
        for (Unidad d : unidades) {
            for(Unidad a: unidades){
                if(unidades.getAmount().compareToIgnoreCase(unidades.getAmount())){
                    
                }
            }
//            if(numero<4){
//            System.out.println(numero + ":" + d);
//            numero++;
//            } 
        }
    }
}
