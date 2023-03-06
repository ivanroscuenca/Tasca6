package N2ex1;

public class GenericMethods {
    private int age;
    //Mètode static genèric que accepta 3 arguments
    public static <T,U> void GenericMeth(T itemT, U itemU, int age){

        System.out.println(itemT + ", " + itemU+", "+ age) ;
    }

}

