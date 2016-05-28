package es.upm.miw.pd.memento;

public class MementoCalculadora {

    private int total;

    public MementoCalculadora(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int totalCalculadora) {
        this.total = totalCalculadora;
    }

}
