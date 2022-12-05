package ADTListeD;

public class ElementD {

    private String content;
    private ElementD next;
    private ElementD previous;

    public ElementD(String content) {
        this.content = content;
        this.next = null;
        this.previous = null;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ElementD getNext() {
        return next;
    }

    public void setNext(ElementD next) {
        this.next = next;
    }

    public ElementD getPrevious() {
        return previous;
    }

    public void setPrevious(ElementD previous) {
        this.previous = previous;
    }
}
