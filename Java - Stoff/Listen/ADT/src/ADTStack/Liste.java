package ADTStack;

public class Liste extends AbstractListe {

    private Element root;
    private Element current;
    private int count;

    public Liste() {
        super();
    }

    @Override
    public void insertBefore(Element aElement) {
        super.insertBefore(aElement);
    }

    @Override
    public void insertBehind(Element aElement) {
        super.insertBehind(aElement);
    }

    @Override
    public void append(Element aElement) {
        super.append(aElement);
    }

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public Element getCurrent() {
        return super.getCurrent();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean isLast() {
        return super.isLast();
    }
}
