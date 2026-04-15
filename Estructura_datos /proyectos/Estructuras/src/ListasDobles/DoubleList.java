package ListasDobles;

public class DoubleList {

    private DoubleNode head, last;

    public DoubleList() {
    }

    public boolean isEmpty() {
        return head == null && last == null;
    }

    public void AddFirst(Object data) {
        if (isEmpty()) {

            head = new DoubleNode(data);
            last = head;

        } else {

            DoubleNode n = new DoubleNode(data);
            n.setNext(head);
            head.setPrevious(n);
            head = n;

        }

    }

    public void AddLast(Object data) {

        if (isEmpty()) {

            head = new DoubleNode(data);
            last = head;

        } else {
            DoubleNode n = new DoubleNode(data);
            last.setNext(n);
            n.setPrevious(last);
            last = n;
        }
    }

    public void Add(Object data) {

        DoubleNode aux = head;
        while (aux != null && ((String) aux.getData()).compareTo((String) data) < 0) {
            aux = aux.getNext();
        }

        if (aux == null) {
            AddLast(data);
        } else {
            if (aux.getPrevious() == null) {
                AddFirst(data);
            } else {
                DoubleNode n = new DoubleNode(data);
                n.setPrevious(aux.getPrevious());
                n.setNext(aux);
                aux.getPrevious().setNext(n);
                aux.setPrevious(n);
            }
        }
    }

    public boolean DeleteFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            if (head == null) {
                last = null;
            } else {
                head.setPrevious(null);
            }
            return true;
        }
        return false;
    }

    public boolean DeleteLast() {
        if (!isEmpty()) {
            last = last.getPrevious();
            if (last == null) {
                head = null;
            } else {
                last.setNext(null);
            }
            return true;
        }
        return false;
    }

    public boolean Delete(Object data) {

        DoubleNode aux = last;
        while (aux != null && !aux.getData().equals(data)) {
            aux = aux.getPrevious();
        }

        if (aux != null) {
            if (aux.getPrevious() == null) {
                DeleteFirst();
            } else {
                if (aux.getNext() == null) {
                    DeleteLast();
                } else {
                    aux.getPrevious().setNext(aux.getNext());
                    aux.getNext().setPrevious(aux.getPrevious());
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String text = "";
        DoubleNode aux = head;
        while (aux != null) {
            text = text + aux.getData() + " - ";
            aux = aux.getNext();
        }
        return text;
    }

    public String toStringInv() {
        String text = "";
        DoubleNode aux = last;
        while (aux != null) {
            text = text + aux.getData() + " - ";
            aux = aux.getPrevious();
        }
        return text;
    }

}
