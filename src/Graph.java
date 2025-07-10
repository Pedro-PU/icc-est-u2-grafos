import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Graph {
    
    private Set<Node> nodes;
    
    public Graph(){
        this.nodes = new HashSet<>();
    }
    public Node addNode(int value){
        Node node = new Node(value);
        this.nodes.add(node);
        return node;
    }
    public void addEdge(Node src, Node dest) {
        src.addNeighbors(dest);
        dest.addNeighbors(src);
    }
    public void addEdgeUni(Node src, Node dest) {
        src.addNeighbors(dest);
    }
    public void printGraph() {
        for(Node node: nodes) {
            System.out.print("Vertex " + node.getValue() + ":");
            
            for(Node neighbor: node.getNeighbors()) {
                System.out.print(" -> " + neighbor.getValue());
            }
            
            System.out.println();
        }
    }
    public void dfs(Node start){

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
