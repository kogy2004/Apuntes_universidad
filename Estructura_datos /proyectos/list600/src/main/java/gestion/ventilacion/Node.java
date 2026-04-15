package gestion.ventilacion;



public class Node {

    private Equipament data;
    private Node link;

    public Node(Equipament data) {
        this.data = data;
    }

    public Equipament getData() {
        return data;
    }

    public void setData(Equipament data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
