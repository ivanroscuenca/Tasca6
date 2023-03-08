package N1ex1;

public class Main {

    public static void main(String[] args) {
String n1 ="Ivan";
String n2 = "Emma";
String n3 = "Jessica";

//Call to method

        NoGenericMethods gen1 = new NoGenericMethods(n3,n2,n1);
        NoGenericMethods gen2 = new NoGenericMethods(n1,n2,n3);
        NoGenericMethods gen3 = new NoGenericMethods(n2,n3,n1);
//print
        System.out.println(gen1 + "\n" + gen2 + "\n" + gen3 );

    }
}
