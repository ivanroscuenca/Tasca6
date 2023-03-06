package N1ex2;

public class GenericMethods {

    //Mètode static genèric que accepta 3 arguments
    public static <T,U,K> void GenericMeth(T itemT, U itemU, K itemK){

        System.out.println(itemT + ", " + itemU+", "+ itemK ) ;
    }

}

