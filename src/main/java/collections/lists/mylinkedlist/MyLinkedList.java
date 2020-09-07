package collections.lists.mylinkedlist;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MyLinkedList {
    private Node head;


    public int size() {
        if (head == null) {
            return 0;
        }
        int size = 0;
        Node curNode = head;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public boolean add(Object o) {
        if (head == null) {
            head = new Node(o, null);
        } else {
            Node curNode = head;

            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }

            curNode.setNext(new Node(o, null));
        }

        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        if (isCorrectIndex(index)){
            Node curNode = head;
            int curIndex = 0;

            while (curIndex != index) {

            }
        }
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        if (isCorrectIndex(index)) {
            Node removableNode;
            if (index == 0) {
                removableNode = head;
                head = head.getNext();
            } else {
                Node cureNode = head;
                int curIndex = 0;

                while (curIndex != index - 1) {
                    curIndex++;
                    cureNode = cureNode.getNext();
                }
                removableNode = cureNode.getNext();
                cureNode.setNext(removableNode.getNext());
                removableNode.setNext(null);
            }
            return removableNode;
        }
        throw new IndexOutOfBoundsException();
    }


    private boolean isCorrectIndex(int index) {
        if ((index >= 0) && (index < size())) {
            return true;
        }
        return false;
    }


    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyLinkedList{");

        if (head != null) {
            Node curNode = head;

            while (curNode.getNext() != null) {
                stringBuilder.append(curNode.getValue()).append(',');
                curNode = curNode.getNext();
            }
            stringBuilder.append(curNode.getValue());
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
