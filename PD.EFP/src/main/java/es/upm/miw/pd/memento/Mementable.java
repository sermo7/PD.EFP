package es.upm.miw.pd.memento;

public interface Mementable {

    public MementoCalculadora createMemento();

    public void restoreMemento(MementoCalculadora memento);
	
}
