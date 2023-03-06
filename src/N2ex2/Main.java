package N2ex2;

//Modifica l'apartat anterior de manera que els
// arguments del mètode genèric siguin una llista d'arguments de variable indefinida.

import N2ex1.Persona;

import static N1ex2.GenericMethods.GenericMeth;

public class Main {

    public static void main(String[] args) {
        Persona per1 = new N2ex1.Persona("Ros","Ivan",41);
        Persona per2 = new Persona("Emma","Ros",12);
        Persona per3 = new Persona("Juan","Gómez",45);

        GenericMeth(per1,per2,per3);
    }
}
