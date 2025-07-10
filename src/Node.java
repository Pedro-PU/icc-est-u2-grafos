import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public List<Node> getNeighbors() {
        return neighbors;
    }
    public void addNeighbors(Node neighbor) {
        this.neighbors.add(neighbor);
    }

}