package N1ex2;

import N2ex2.Persona;

import java.util.ArrayList;

public class GenericMethods {

    //Mètode static genèric que accepta 3 arguments
    public static <T> void GenericMeth(T itemT, T itemU, T itemK){

        System.out.println(itemT + ", " + itemU+", "+ itemK ) ;
    }

}

