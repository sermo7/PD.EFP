package es.upm.miw.pd.memento;

public class CalculadoraMementable extends Calculator implements Mementable{

    public CalculadoraMementable() {
        super();
    }

    @Override
    public MementoCalculadora createMemento() {
        return new MementoCalculadora(super.getTotal());
    }

    @Override
    public void restoreMemento(MementoCalculadora mementoCalculadora) {
        super.setTotal(mementoCalculadora.getTotal());
    }

}
