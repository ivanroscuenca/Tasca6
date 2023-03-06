package N1ex1;

public class NoGenericMethods {

//    Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del
//    mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per
//    a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al
//    constructor.
    public static void main(String[] args) {

        Car car1 = new Car("Seat", "red", 1500 );
        Car car2 = new Car(1800, "blue", "Volkswagen");
        Car car3 = new Car("Fiat", 1600,"white");

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());;
    }
}