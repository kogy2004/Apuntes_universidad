package com.mycompany.list600;

public class List {

    private Node head;

    public List() {
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Object data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node n = new Node(data);
            n.setLink(head);
            head = n;
        }
    }

    public Node Last() {
        Node aux = head;

        while (aux != null && aux.getLink() != null) {
            aux = aux.getLink();
        }

        return aux;
    }

    public void addLast(Object data) {
        if (isEmpty()) {
            head = new Node(data);
        } else {
            Node last = Last();
            Node n = new Node(data);
            last.setLink(n);
        }
    }

    public Node addPos(int pos, Object data) {
        if (pos == 1) {
            addFirst(data);
        } else {
            if (pos == size() + 1) {
                addLast(data);
            } else {
                int count = 1;
                Node aux = head;
                while (aux != null && count < pos) {
                    count++;
                    aux = aux.getLink();
                }
                Node n = new Node(data);
                n.setLink(aux);
                Node pre = previous(aux);
                pre.setLink(n);
            }
        }
        return null;
    }

    public Node previous(Node search) {
        Node aux = head;
        Node pre = null;

        while (aux != null && aux != search) {
            pre = aux;
            aux = aux.getLink();
        }
        return pre;
    }

    public boolean deleteFirst() {
        if (!isEmpty()) {
            head = head.getLink();
            return true;
        }
        return false;
    }

    public boolean deleteLast() {
        if (!isEmpty()) {
            Node last = Last();
            Node pre = previous(last);
            if (pre != null) {
                pre.setLink(null);
            } else {
                head = null;
                return true;
            }
        }
        return false;
    }

    public boolean deletePos(int pos) {
        if (!isEmpty()) {
            if (pos == 1) {
                return deleteFirst();
            } else {
                if (pos == size()) {
                    return deleteLast();
                } else {
                    int count = 1;
                    Node aux = head;
                    while (aux != null && count < pos) {
                        count++;
                        aux = aux.getLink();
                    }
                    Node pre = previous(aux);
                    pre.setLink(aux.getLink());
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        Node aux = head;
        int count = 0;
        while (aux != null) {
            count++;
            aux = aux.getLink();
        }
        return count;
    }

    @Override
    public String toString() {
        String text = " ";
        Node aux = head;

        while (aux != null) {
            text = text + aux.getData() + " - ";
            aux = aux.getLink();
        }

        return text;
    }

}
