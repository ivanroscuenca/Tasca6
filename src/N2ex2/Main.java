package N2ex2;

//Modifica l'apartat anterior de manera que els
// arguments del mètode genèric siguin una llista d'arguments de variable indefinida.

import static N2ex2.GenericMetodos.genericMetodo;

public class Main {

    public static void main(String[] args) {
        Persona per1 = new Persona("Ros","Ivan",41);
        Persona per2 = new Persona("Emma","Ros",12);
        Persona per3 = new Persona("Juan","Gómez",45);


        genericMetodo(per1,per2,per3);
        //accepta tots els tipus
        genericMetodo(12,34,56);
    }
}
