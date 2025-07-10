import java.util.List;
import java.util.ArrayList;
public class Graph {
    private List<Node> nodes;
    public Graph() {
        this.nodes = new ArrayList<>();
    }
    public Node addNode(int value){
        Node node = new Node(value);
        this.nodes.add(node);
        return node;
    }
    public void addEdge(Node src, Node dest) {
        
    }
    public void printGraph() {
        
    }
    public void getDFS(Node startNode){

    }
    private void getDFSUtil(Node node, boolean[] visited){

    }
    public void getBFS(Node startNode){

    }
    public int[][] getAdjacencyMatrix(){

        return new int[0][0];
    }
    public void printAdjacencyMatrix(){

    }
}
