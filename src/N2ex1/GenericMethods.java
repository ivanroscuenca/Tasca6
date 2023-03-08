package N2ex1;

public class GenericMethods {
    private int age;
    //Mètode static genèric que accepta 3 arguments
    public static <T> void GenericMeth(T itemA, T itemB, int itemC){

        System.out.println(itemA + ", " + itemB+", "+ itemC ) ;
    }

}

