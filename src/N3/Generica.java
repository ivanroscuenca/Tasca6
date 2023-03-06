package N3;

public class Generica {
    //2 métodos Genericos
    public static <T extends Telefon> void trucar(T itemT){

        Telefon.Trucar(); ;
    }

    public static <T extends SmartPhone> void ferFotos(T itemT){

       SmartPhone.ferFotos() ;
    }


}
