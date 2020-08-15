package collections.lists.hwmyarraylist;

public class MyArrayList {
    public final static int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int realSize;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }


    public boolean isEmpty() {
        if (realSize == 0) return true; return false;
    }


    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    public boolean add(Object o) {
        if (realSize < array.length) {
            Object[] resArray = new Object[array.length / 2 * 3 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }
        array[realSize++] = o;
        return true;
    }


    public boolean remove(Object o) {
        if (contains(o)) {
            int removeElemIndex = 0;

            for (removeElemIndex = 0; removeElemIndex < realSize; removeElemIndex++) {
                if (array[removeElemIndex].equals(o)) {
                    break;
                }
            }

            for (int i = removeElemIndex; i < realSize - 1; i++) {
                array[i] = array[i + 1];
            }

            array[realSize - 1] = null;
            realSize--;
            return true;
        }
        return false;
    }


    public void clear() {
        if (realSize == 0) {
            System.out.println("Список пуст! ");
        } else {
            for (int i = 0; i < realSize; i++) {
                array[i] = null;
            }
        }
        realSize = 0;
        System.out.println("Список очищен! ");

    }


    public Object get(int index) {
        if ((index >= realSize) && (index >= 0)) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }


    public Object set(int index, Object element) {
        if ((index >= realSize) && (index >= 0)) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = element;
        return array[index];
    }


    public void add(int index, Object element) {
        if ((index >= realSize) && (index >= 0)) {
            throw new IndexOutOfBoundsException();
        }
        if (realSize < array.length) {
            Object[] resArray = new Object[array.length / 2 * 3 + 1];
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
        }

        array[index] = element;

        for (int i = index; i < realSize - 1; i++) {
            array[i] = array[i + 1];
        }
        realSize++;
    }


    public Object remove(int index) {
        if ((index >= realSize) && (index >= 0)) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = index; i < realSize - 1; i++) {
            array[i] = array[i + 1];
        }

        array[realSize - 1] = null;
        realSize--;
        return true;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == o) {
                return i;
            }

        }
        return -1;
    }
}

