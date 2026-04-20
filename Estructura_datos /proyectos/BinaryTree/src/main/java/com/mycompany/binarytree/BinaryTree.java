package com.mycompany.binarytree;

import com.mycompany.binarytreeg600.List;
import javax.swing.JOptionPane;

public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void Add(Object data) {
        if (isEmpty()) {
            root = new BinaryNode(data);
        } else {
            Add(data, root);
        }
    }

    private void Add(Object data, BinaryNode aux) {
        String mside[] = {"Left", "Right"};

        String side = (String) JOptionPane.showInputDialog(null, "selected side of " + aux.getData() + ":", "", 1, null, mside, mside[0]);

        if (side.equals("Left")) {
            if (aux.getLeft() == null) {
                aux.setLeft(new BinaryNode(data));
            } else {
                Add(data, aux.getLeft());
            }
        } else {
            if (aux.getRight() == null) {
                aux.setRight(new BinaryNode(data));
            } else {
                Add(data, aux.getRight());
            }
        }
    }

    public String PreOrder() {
        return PreOrder(root);
    }

    private String PreOrder(BinaryNode aux) {
        if (aux != null) {
            return aux.getData() + " " + PreOrder(aux.getLeft()) + PreOrder(aux.getRight());

        }
        return " ";
    }

    public String InOrder() {
        return InOrder(root);
    }

    private String InOrder(BinaryNode aux) {
        if (aux != null) {
            return InOrder(aux.getLeft()) + aux.getData() + " " + InOrder(aux.getRight());

        }
        return " ";
    }

    public String PostOrder() {
        return PostOrder(root);
    }

    private String PostOrder(BinaryNode aux) {
        if (aux != null) {
            return PostOrder(aux.getLeft()) + PostOrder(aux.getRight()) + aux.getData() + " ";

        }
        return " ";
    }

    public int Size() {
        return Size(root);
    }

    private int Size(BinaryNode aux) {
        if (aux != null) {
            return 1 + Size(aux.getLeft()) + Size(aux.getRight());
        }
        return 0;
    }

    public boolean Search(String value) {
        return Search(value, root);
    }

    private boolean Search(String value, BinaryNode aux) {
        if (aux != null) {
            if (aux.getData().equals(value)) {
                return true;
            } else {
                return Search(value, aux.getLeft()) || Search(value, aux.getRight());
            }
        }
        return false;
    }

    public BinaryNode SearchNode(String value) {
        return SearchNode(value, root);
    }

    private BinaryNode SearchNode(String value, BinaryNode aux) {
        if (aux != null) {
            if (aux.getData().equals(value)) {
                return aux;
            } else {
                BinaryNode search = SearchNode(value, aux.getLeft());
                if (search == null) {
                    search = SearchNode(value, aux.getRight());
                }
                return search;
            }
        }
        return null;
    }

    public BinaryNode getFather(String value) {
        if (!isEmpty()) {
            if (root.getData().equals(value)) {
                return null;
            } else {
                return getFather(value, root);
            }
        }
        return null;
    }

    private BinaryNode getFather(String value, BinaryNode aux) {
        if (aux != null) {
            if ((aux.getLeft() != null && aux.getLeft().getData().equals(value)) || (aux.getRight() != null && aux.getRight().getData().equals(value))) {
                return aux;
            } else {
                BinaryNode father = getFather(value, aux.getLeft());
                if (father == null) {
                    father = getFather(value, aux.getRight());
                }
                return father;
            }
        }
        return null;
    }

    public List Path(String value) {
        BinaryNode search = SearchNode(value);
        if (search != null) {
            return Path(search, new List());
        }
        return null;
    }

    private List Path(BinaryNode aux, List list) {

        if (aux != null) {
            list.AddFirst(aux.getData());
            Path(getFather((String) aux.getData(), root), list);
        }
        return list;
    }

    public boolean Delete(String value) {
        //buscamos el elemento en el arbol
        BinaryNode delete = SearchNode(value);
        if (delete != null) {
            //verificamos si es una hoja
            if (delete.getLeft() == null && delete.getRight() == null) {
                Delete0(delete);
            } else {
                //verificamos si tiene un hijo
                if (delete.getLeft() == null || delete.getRight() == null) {
                    Delete1(delete);
                } else {
                    Delete2(delete);
                }
            }
            return true;
        }
        return false;
    }

    private void Delete0(BinaryNode delete) {
        BinaryNode father = getFather((String) delete.getData());
        if (father == null) {
            root = null;
        } else {
            if (father.getLeft() == delete) {
                father.setLeft(null);
            } else {
                father.setRight(null);
            }
        }
    }

    private void Delete1(BinaryNode delete) {
        BinaryNode father = getFather((String) delete.getData());
        //si no tiene padre
        if (father == null) {
            if (delete.getLeft() != null) {
                root = delete.getLeft();
            } else {
                root = delete.getRight();
            }
        } else //tiene padre
        {
            if (father.getLeft() == delete) {
                //donde esta el hijo
                if (delete.getLeft() != null) {
                    father.setLeft(delete.getLeft());
                } else {
                    father.setLeft(delete.getRight());
                }
            } else {
                if (delete.getLeft() != null) {
                    father.setRight(delete.getLeft());
                } else {
                    father.setRight(delete.getRight());
                }
            }
        }

    }

    private void Delete2(BinaryNode delete) {
        BinaryNode left = MoreLeft(delete);
        Delete((String) left.getData());
        delete.setData(left.getData());
    }

    private BinaryNode MoreLeft(BinaryNode aux) {
        if (aux.getLeft() != null) {
            return MoreLeft(aux.getLeft());
        }

        return aux;
    }

}
