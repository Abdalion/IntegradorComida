package abdalion.me.integradorcomida;

import java.util.ArrayList;

/**
 * Created by Egon on 16/10/2016.
 */

public class Receta {

    private String nombre;
    private String descripcion;
    private String pasos;

    public Receta(String nombre, String ingredientes, String pasos) {
        this.nombre = nombre;
        this.descripcion = ingredientes;
        this.pasos = pasos;
    }

    public static ArrayList<Receta> obtenerListaDeRecetas() {
        ArrayList<Receta> arrayList = new ArrayList<>();
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos","1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "1- Meter todo al horno"));
        arrayList.add(new Receta("Colita de cuadril", "Una colita de cuadril", "1- All to the horno"));
        arrayList.add(new Receta("Arroz con leche", "Arroz, azucar, canela y leche", "Hervir arroz, agregar lo demas"));
        arrayList.add(new Receta("Pastel de carne", "Carne, papa", "Todo al horno"));

        return arrayList;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPasos() {
        return pasos;
    }
}
