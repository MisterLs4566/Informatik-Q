package ADTListe;

// Implementierung einer linearen einfach verketteten Liste
public class Liste {

    private Element root;
    private Element current;
    private int count = 0;

    public Liste() {

        this.root = null;
        this.current = null;
        this.count = 0;

    }

    // Einfügen eines Elements vor dem aktuellen Element
    public void insertBefore(Element aElement) {
        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }
        previous();
        this.insertBehind(aElement);
        this.current = aElement;

    }

    // Einfügen eines Elements nach dem aktuellen Element
    public void insertBehind(Element aElement) {

        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }
        aElement.setNext(this.current.getNext());
        this.current.setNext(aElement);
        this.current = aElement;

    }

    // Anfügen eines Elements an das Ende der Liste
    public void append(Element aElement) {

        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }
        while(this.current.getNext() != null) {
            this.current = this.current.getNext();
        }

        this.current.setNext(aElement);
        this.current = aElement;

    }

    // Löschen des aktuellen Elements
    public void delete() {

        if(this.root == null) {
            return;
        }

        Element scout = this.current.getNext();
        previous();
        this.current.setNext(scout);

    }

    // geht zum ersten Element der Liste
    public void first() {
        this.current = this.root;
    }

    // geht zum nächsten Element der Liste
    public void next() {

        if(!isLast()) {
            this.current = this.current.getNext();
        }

    }

    // geht zum vorherigen Element der Liste
    public void previous() {

        if(root == this.current) {
            return;
        }

        Element scout = root;

        while(scout.getNext() != this.current) {
            scout = scout.getNext();
        }

        this.current = scout;

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

        return this.count;

    }

    // gibt das aktuelle Element zurück
    public Element getCurrent() {

        return this.current;

    }
}