package N1ex1;

public class Car  {

    private String nom;

    public Car(String nom) {
        this.nom = nom;
;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Car{" +
                "nom='" + nom + '\'' +
                '}';
    }
}


