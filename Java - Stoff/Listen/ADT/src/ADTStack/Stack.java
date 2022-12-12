package ADTStack;

public class Stack extends Liste{
    private Element root;
    private Element current;
    private int count;

    public Stack() {
        super();
    }

    public void push(Element aElement) {
        /*this.current = this.root;
        this.root = aElement;
        this.root.setNext(this.current);*/

        first();
        insertBefore(aElement);
    }

    public void pop(Element aElement) {
        //this.current = root.getNext();
        //this.root = this.current;
        //aElement.setNext(null);
    }
}
