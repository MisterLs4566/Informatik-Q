package ADTStack;

public class ListeD extends AbstractListeD{

    public ListeD () {
        super();
    }

    @Override
    public void insertBefore(ElementD aElement) {
        super.insertBefore(aElement);
    }

    @Override
    public void insertBehind(ElementD aElement) {
        super.insertBehind(aElement);
    }

    @Override
    public void append(ElementD aElement) {
        super.append(aElement);
    }

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public boolean isLast() {
        return super.isLast();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public ElementD getCurrent() {
        return super.getCurrent();
    }
}
