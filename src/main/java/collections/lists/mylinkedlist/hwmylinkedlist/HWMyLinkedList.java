package collections.lists.mylinkedlist.hwmylinkedlist;

import collections.lists.mylinkedlist.Node;
import jdk.nashorn.api.scripting.ScriptUtils;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.swing.plaf.IconUIResource;
import javax.xml.validation.SchemaFactoryConfigurationError;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class HWMyLinkedList {
    private NodeHW head;


    public int size() {
        if (head == null) {
            return 0;
        }

        int size = 0;
        NodeHW curNode = head;
        while (curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Object o) {
        if (head == null) {
            return false;
        }

        NodeHW curNode = head;
        if (curNode.getValue().equals(o)) {
            return true;
        }

        while (curNode.getNext() != null) {
            if (curNode.getNext().getValue().equals(o)) {
                return true;
            }
            curNode = curNode.getNext();
        }
        return false;
    }


    public boolean add(Object o) {
        if (head == null) {
            head = new NodeHW(o, null);
        } else {
            NodeHW curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(new NodeHW(o, null));
        }
        return true;
    }

    public boolean remove(Object o) {
        if (head != null) {
            NodeHW removeElement = head;
            if (removeElement.getValue().equals(o)) {
                head = head.getNext();
            } else {
                NodeHW curRemoveNode = head;
                while (curRemoveNode.getNext() != null) {
                    if (curRemoveNode.getNext().getValue().equals(o)) {
                        break;
                    }
                    curRemoveNode = curRemoveNode.getNext();
                }
                removeElement = curRemoveNode.getNext();
                curRemoveNode.setNext(removeElement.getNext());
                removeElement.setNext(null);
            }
        }
        return true;
    }

    public void clear() {
        if (head != null) {
            head = null;
        }
    }

    public Object get(int index) {
        if (isCorrectIndex(index)) {
            NodeHW curNode = head;
            int curIndex = 0;

            while (curIndex != index) {
                curIndex++;
                curNode = curNode.getNext();
            }
            return curNode.getValue();
        }
        return null;
    }

    public Object set(int index, Object element) {
        if (isCorrectIndex(index)) {
            NodeHW curNode = head;
            int curIndex = 0;

            while (curIndex != index) {
                curIndex++;
                curNode = curNode.getNext();
            }

            Object setElem = curNode.getValue();
            curNode.setValue(element);
            return setElem;
        }
        throw new IndexOutOfBoundsException();
    }


    public void add(int index, Object element) {
        if (isCorrectIndex(index)) {
            NodeHW curNode = head;
            NodeHW prevNode = head;
            int curIndex = 0;
            if (index == 0) {
                head = new NodeHW(element, curNode);
            } else {
                while (curIndex != index) {
                    curIndex++;
                    prevNode = curNode;
                    curNode = curNode.getNext();
                }
                prevNode.setNext(new NodeHW(element, curNode.getNext()));
            }

        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public Object remove(int index) {
        if (isCorrectIndex(index)) {
            NodeHW removableNode;
            if (index == 0) {
                removableNode = head;
                head = head.getNext();
            } else {
                NodeHW curNode = head;
                int curIndex = 0;

                while (curIndex != index - 1) {
                    curIndex++;
                    curNode = curNode.getNext();
                }
                removableNode = curNode.getNext();
                curNode.setNext(removableNode.getNext());
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
        if (head != null) {
            NodeHW curNode = head;
            int curIndex = 0;
            while (curNode != null) {
                if (curNode.getValue().equals(o)) {
                    return curIndex;
                }
                curNode = curNode.getNext();
                curIndex++;
            }
        }
        return -1;
    }


    public int lastIndexOf(Object o) {
        if (head != null) {
            NodeHW curNode = head;
            int curIndex = 0;
            int index = 0;
            while (curNode != null) {
                if (curNode.getValue().equals(o)) {
                    curIndex = index;
                }
                index++;
                curNode = curNode.getNext();
            }

            return curIndex;
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("HWMyLinkedList{ ");

        if (head != null) {
            NodeHW curNode = head;

            while (curNode.getNext() != null) {
                stringBuilder.append(curNode.getValue()).append(',');
                curNode = curNode.getNext();
            }
            stringBuilder.append(curNode.getValue());
        }
        stringBuilder.append(" }");

        return stringBuilder.toString();
    }
}
