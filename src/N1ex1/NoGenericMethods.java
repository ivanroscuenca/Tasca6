package N1ex1;

import org.w3c.dom.ls.LSOutput;

public class NoGenericMethods {

    //    Crea una classe anomenada NoGenericMethods que emmagatzemi tres objectes del
//    mateix tipus, juntament amb els mètodes per a emmagatzemar i extreure aquests objectes i un constructor per
//    a inicialitzar els tres. Comprova que els arguments es poden posar en qualsevol posició en la crida al
//    constructor.

    private String n1;
    private String n2;
    private String n3;

    public NoGenericMethods(String n1, String n2, String n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }

    public String getN3() {
        return n3;
    }

    public void setN3(String n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "n1='" + n1 + '\'' +
                ", n2='" + n2 + '\'' +
                ", n3='" + n3 + '\'' +
                '}';
    }
}

