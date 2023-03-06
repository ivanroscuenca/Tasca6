package N1ex1;

public class Car <T,U,K> {

    private T tItem;
    private U uItem;
    private K kItem;

    public Car(T tItem, U uItem, K kItem) {
        this.tItem = tItem;
        this.uItem = uItem;
        this.kItem = kItem;
    }

    public T gettItem() {
        return tItem;
    }

    public void settItem(T tItem) {
        this.tItem = tItem;
    }

    public U getuItem() {
        return uItem;
    }

    public void setuItem(U uItem) {
        this.uItem = uItem;
    }

    public K getkItem() {
        return kItem;
    }

    public void setkItem(K kItem) {
        this.kItem = kItem;
    }

    @Override
    public String toString() {
        return "Car{" +
                "tItem=" + tItem +
                ", uItem=" + uItem +
                ", kItem=" + kItem +
                '}';
    }
}


