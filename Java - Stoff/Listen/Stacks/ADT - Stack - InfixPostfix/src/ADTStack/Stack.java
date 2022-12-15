package ADTStack;

public class Stack extends AbstractListeD{

    public Stack() {
        super();
    }

    public void push(ElementD aElement) {
        super.insertBefore(aElement);
    }

    public ElementD pop() {
        ElementD e = getCurrent();
        super.delete();
        return e;
    }

    public ElementD peek() {
        return super.getCurrent();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public String toString() {
        String s = "";
        if (isEmpty()) return "";
        while (getCurrent().getNext() != null) {
            s = s + " " + getCurrent().getContent();
            next();
        }
        first();
        return s;
    }
}
