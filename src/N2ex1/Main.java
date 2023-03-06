package N1ex2;
//Crea una classe anomenada Persona amb els atributs nom, cognom i edat.
// Després crea una classe anomenada GenericMethods amb un mètode genèric que accepti
// tres arguments de tipus genèric. Aquest mètode només ha d’imprimir per pantalla els arguments que ha rebut.
// Al main() de la classe principal, crida el mètode genèric amb diferents tipus de paràmetres.
//Exemple: un objecte de la classe Persona, un String i un tipus primitiu.
//D’aquesta manera has comprovat que se li pot passar qualsevol tipus de paràmetre i en qualsevol ordre.
import static N1ex2.GenericMethods.GenericMeth;

public class Main {

    public static void main(String[] args) {
        Persona per1 = new Persona("Ivan","Ros",41);
        Persona per2 = new Persona("Emma","Ros",12);
        GenericMeth("Hola", 1,per1);
        GenericMeth(1,per2 ,"Adeu");
        
    }
}
