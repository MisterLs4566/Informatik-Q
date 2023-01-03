package Listen;

public class Liste {
    private Element root;
    private Element current;
    private int count;

    public Liste() {
        this.count = 0;
        this.root = null;
        this.current = null;
    }

    public String toString() {
        String zeichenkette = "";
        Element element = this.root;

        if(this.count == 0) {
            zeichenkette = "leer";
            return zeichenkette;
        } else if(count == 1) {
            zeichenkette += element.getContent();
            return zeichenkette;
        } else {
            while(element != null) {
                zeichenkette += element.getContent() + " , ";
                element = element.getNext();
            }

            return zeichenkette;
        }
    }

    public void firstElement() {
        this.current = this.root;
    }

    public void previousELement() {
        Element scout;
        scout = this.root;

        while(scout.getNext() != this.current) {
            scout = scout.getNext();
        }

        this.current = scout;
    }

    public void insertBefore(Element element) {
        if(this.count == 0) {
            this.root = element;
            this.current = this.root;
            this.count = 1;
            return;
        } else{
            previousELement();
            insertBehind(element);
            this.count++;
        }
    }

    public void insertBehind(Element element) {
        if(this.count == 0) {
            this.root = element;
            this.current = this.root;
            this.count = 1;
            return;
        } else {
            Element scout = this.current.getNext();
            this.current.setNext(element);
            element.setNext(scout);
            this.count++;
        }

        /*CODE*/
    }

    public void append(Element element) {
        if(this.count == 0) {
            this.root = element;
            this.current = element;
            this.count = 1;
            return;
        } else {
            this.current = this.root;

            while(this.current.getNext() != null) {
                this.current = this.current.getNext();
            }

            this.current.setNext(element);
            this.count++;
        }
    }

    public void deleteElement() {
        if(this.count == 0) {
            return;
        }


        Element scout = this.root;
        if(this.current == this.root) {
            this.root = null;
            this.current = this.root;
            this.count = 0;
        } else {
            while(scout.getNext() != this.current) {
                scout = scout.getNext();
            }

            scout.setNext(this.current.getNext());
            this.count--;
        }
    }

    public int getCount() {
        return this.count;
    }
}
