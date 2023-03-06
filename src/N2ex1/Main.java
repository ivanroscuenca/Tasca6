package N2ex1;
//Modifica l'exercici anterior de manera que un dels arguments del mètode genèric no sigui genèric.

import static N1ex2.GenericMethods.GenericMeth;

public class Main {

    public static void main(String[] args) {
        Persona per1 = new Persona("Ros","Ivan",41);
        Persona per2 = new Persona("Emma","Ros",12);
        Persona per3 = new Persona("Juan","Gómez",45);

        GenericMeth("Hola", 1,per1);
        GenericMeth(1,per2 ,"Adeu");
        GenericMeth(per3,3 ,"Adiós");
    }
}
