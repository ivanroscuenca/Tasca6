package N2ex2;

import java.util.ArrayList;

public class GenericMetodos{

    //Modifica l'apartat anterior de manera que els
// arguments del mètode genèric siguin una llista d'arguments de variable indefinida.

//Metode generic , desde T... fins les vegades que vulguem, varArgs es un array
    public static<T> void genericMetodo(T...varArgs) {
        for(T t : varArgs){
            System.out.println(t);
        }
    }
}

