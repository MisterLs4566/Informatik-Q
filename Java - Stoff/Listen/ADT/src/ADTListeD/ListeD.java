package ADTListeD;

// Implementierung einer linearen doppelt verketteten Liste
public class ListeD {

    private ElementD root;
    private ElementD current;
    private int count = 0;

    public ListeD() {
        this.root = null;
        this.current = null;
        this.count = 0;
    }

    // Einfügen eines Elements vor dem aktuellen Element
    public void insertBefore(ElementD aElement) {
    }

    // Einfügen eines Elements nach dem aktuellen Element
    public void insertBehind(ElementD aElement) {
    }

    // Anfügen eines Elements an das Ende der Liste
    public void append(ElementD aElement) {
    }

    // Löschen des aktuellen Elements
    public void delete() {
    }

    // geht zum ersten Element der Liste
    public void first() {
    }

    // geht zum nächsten Element der Liste
    public void next() {
    }

    // geht zum vorherigen Element der Liste
    public void previous() {
    }

    // Test, ob Liste leer ist
    public boolean isEmpty() {
        return root == null;
    }

    // Test, ob aktuelles Element letztes Element der Liste ist
    public boolean isLast() {
        return current.getNext() == null;
    }

    public int getCount() {
        return count;
    }

    // gibt das aktuelle Element zurück
    public ElementD getCurrent() {
        return current;
    }
}