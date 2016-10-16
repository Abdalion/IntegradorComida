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
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos", "1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "Meter todo al horno"));
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos", "1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "Meter todo al horno"));
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos", "1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "Meter todo al horno"));
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos", "1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "Meter todo al horno"));
        arrayList.add(new Receta("Pollo al spiedo", "2 bananas y 3 pollos", "1- Pelar el pollo 2- Salar las bananas"));
        arrayList.add(new Receta("Salmon rosado", "50g de manteca, Filet de salmon, ajo", "Meter todo al horno"));

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
