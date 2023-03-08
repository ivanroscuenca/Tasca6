package N1ex1;

import org.w3c.dom.ls.LSOutput;

public class NoGenericMethods {

//    Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del
//    mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per
//    a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al
//    constructor.
    Car Car1;
    Car car2;
    Car car3;

    public String NoGenericMethods(Car car1, Car car2, Car car3) {
        this.Car1 = car1;
        this.car2 = car2;
        this.car3 = car3;

        return car1.getNom()+car2.getNom()+car3.getNom();
    }
}