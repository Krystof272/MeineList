import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedListIterator implements Iterator<Integer> {
    private int aktualniIndex;
    private MujSpojovySeznam mujSpojovySeznam;

    public LinkedListIterator(MujSpojovySeznam mujSpojovySeznam) {
        this.aktualniIndex = 0;
        this.mujSpojovySeznam = mujSpojovySeznam;
    }

    @Override
    public boolean hasNext() {
        return aktualniIndex < mujSpojovySeznam.count();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        aktualniIndex++;
        return mujSpojovySeznam.getIndex(aktualniIndex - 1);
    }
}
