import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyArrayList<E> extends MyAbstractList implements MyList {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];

    public MyArrayList() {
    }

    public MyArrayList(E[] object) {
        for (int i = 0; i < object.length; i++) {
            add(object[i]);
        }
    }

    @Override
    public void add(Object o) {
        super.add(o);
    }

    @Override
    public void add(int index, Object o) {

    }

//    @Override
//    public void add(int index, Object o) {
//
//    }

//    @Override
//    public void add(int index, E e) {
//
//    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object o) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
