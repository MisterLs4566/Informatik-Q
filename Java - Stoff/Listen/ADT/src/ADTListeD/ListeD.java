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

        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }

        this.current = this.current.getPrevious();
        insertBehind(aElement);
        this.count ++;
        this.current = aElement;

    }

    // Einfügen eines Elements nach dem aktuellen Element
    public void insertBehind(ElementD aElement) {

        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }

        aElement.setNext(this.current.getNext());
        this.current.setNext(aElement);

        aElement.setPrevious(this.current);
        this.current = this.current.getNext();
        if(this.current.getNext() != null) {
            this.current.getNext().setPrevious(aElement);
        }
        this.count ++;

    }

    // Anfügen eines Elements an das Ende der Liste
    public void append(ElementD aElement) {

        if(this.root == null) {
            this.root = aElement;
            this.current = aElement;
            return;
        }
        while(this.current.getNext() != null) {
            this.current = this.current.getNext();
        }

        this.current.setNext(aElement);
        aElement.setPrevious(this.current);
        this.count ++;
        this.current = this.current.getNext();

    }

    // Löschen des aktuellen Elements
    public void delete() {

        if(this.root == null || this.current == root)
        {
            return;
        }

        if(this.current.getNext() == null) {
            this.current = this.current.getPrevious();
            this.current.setNext(null);
            return;
        }

        ElementD scout = this.current.getNext();
        this.current = this.current.getPrevious();
        scout.setPrevious(this.current);
        this.current.setNext(scout);

    }

    // geht zum ersten Element der Liste
    public void first() {
        this.current = root;
    }

    // geht zum nächsten Element der Liste
    public void next() {
        if(!isLast()) {
            this.current = this.current.getNext();
        }
    }

    // geht zum vorherigen Element der Liste
    public void previous() {
       if(this.current.getPrevious() != null) {
           this.current = this.current.getPrevious();
       }
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