package Classes;

import java.util.Scanner;

public class test {

    public static void main(String args) {
        final String NOMBRE_GRUPO1 = "GRUPO YUMA";

        Grupo g1 = Grupo(NOMBRE_GRUPO1);
        ingresoIntegrante(g1, "Adrian Tamashiro");
        ingresoIntegrante(g1, "Mariam Sleiman");
        ingresoIntegrante(g1, "Ignacio Gaillard");
        ingresoIntegrante(g1, "Martin Pimenta");
        ingresoIntegrante(g1, "Carlos Perez");

    }

    public void ingresoIntegrante(Grupo grupo, String nombre) {
        String integrante = grupo.buscarIntegrante(nombre);
        if (integrante == null) {
            grupo.agregarIntegrante(nombre);
            System.out.println(nombre + " fue asignado al grupo " + grupo.getNombre());
        } 
        
    }
}