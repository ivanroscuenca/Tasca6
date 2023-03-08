package N1ex2;

import N2ex2.Persona;

import java.util.ArrayList;

public class GenericMethods {

    //Mètode static genèric que accepta 3 arguments
    public static <T,U,K> void GenericMeth(T itemT, U itemU, K itemK){

        System.out.println(itemT + ", " + itemU+", "+ itemK ) ;
    }

}

