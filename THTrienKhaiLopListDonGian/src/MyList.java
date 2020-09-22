import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    ArrayList<E> myArray = new ArrayList<E>();

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

//    tang size cua mang len gap doi:
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

//    add 1 phan tu e vao cuoi danh sach
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

//    tra ve vi tri i trong danh sach:
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ",Size" + i);
        }
        return (E) elements[i];
    }


}
