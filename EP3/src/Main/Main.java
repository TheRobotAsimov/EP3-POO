/*
    EP3: Librerias Graficas

    Integrantes:
        - Burgos Gorostieta Mario David         	BGMO220610
        - García Mendoza Isaías        			GMIO220060

    Fecha de Entrega: 18/07/2024
*/


package Main;

import Controlador.Conector;
import Controlador.ContactoControlador;
import Vista.Pantalla;


public class Main {
    public static void main(String[] args) {
        ContactoControlador controlador = new ContactoControlador();
        
        Pantalla p = new Pantalla(controlador);
        p.setVisible(true);
    }
}
