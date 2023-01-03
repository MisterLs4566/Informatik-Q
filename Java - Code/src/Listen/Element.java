package Listen;

public class Element {
    private Element next;
    private String content;

    public Element(String content) {
        this.next = null;
        this.content = content;
    }

    public Element getNext() {
        if(this.next != null) {
            return this.next;
        }

        return null;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
