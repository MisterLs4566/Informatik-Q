package ADTStack;

// Implementierung einer linearen doppelt verketteten Liste
public abstract class AbstractListeD {

    private ElementD root;
    private ElementD current;
    private int count = 0;

    public AbstractListeD() {
        this.root = null;
        this.current = null;
        this.count = 0;
    }

    // Einfügen eines Elements vor dem aktuellen Element
    public void insertBefore(ElementD aElement) {

        if (current == root) {
            // als erstes Element in die Liste einfügen
            root = aElement;
        } else {
            // Zeiger neu ausrichten
            aElement.setPrevious(current.getPrevious());
            aElement.getPrevious().setNext(aElement);
        }

        // Zeiger current ausrichten
        if (current != null) {
            current.setPrevious(aElement);
        }
        aElement.setNext(current);
        current = aElement;
        count++;
    }

    // Einfügen eines Elements nach dem aktuellen Element
    public void insertBehind(ElementD aElement) {

        if (isEmpty()) {
            // als erstes (einziges) Element in die Liste einfügen
            root = aElement;
        } else {
            // Zeiger neu ausrichten
            aElement.setNext(current.getNext());
            aElement.setPrevious(current);
            if (current.getNext() != null) {
                current.getNext().setPrevious(aElement);
            }
            current.setNext(aElement);
        }

        // Zeiger current ausrichten
        current = aElement;
        count++;
    }

    // Anfügen eines Elements an das Ende der Liste
    public void append(ElementD aElement) {

        if (isEmpty()) {
            // als erstes Element in die Liste einfügen
            root = aElement;
        } else {
            // zum letzten Element gehen
            while (current.getNext() != null) {
                current = current.getNext();
            }

            // Element einfügen
            current.setNext(aElement);
            aElement.setPrevious(current);
        }

        current = aElement;
        count++;
    }

    // Löschen des aktuellen Elements
    public void delete() {
        if (!isEmpty()) {
            if (current == root) {
                // erstes Element wird gelöscht
                root = root.getNext();
                if (root != null) {
                    root.setPrevious(null);
                }
            } else {
                // irgendein Element löschen
                if (!isLast())
                    current.getNext().setPrevious(current.getPrevious());
                current.getPrevious().setNext(current.getNext());
            }
        }

        // Zeiger current ausrichten
        current = root;
        count--;
    }

    // geht zum ersten Element der Liste
    public void first() {
        current = root;
    }

    // geht zum nächsten Element der Liste
    public void next() {
        if (!isLast()) {
            current = current.getNext();
        }
    }

    // geht zum vorherigen Element der Liste
    public void previous() {
        if (current.getPrevious() != null) {
            current = current.getPrevious();
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