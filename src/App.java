public class App {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph();
        Node n0 = graph.addNode(0);
        Node n5 = graph.addNode(5);
        Node n1 = graph.addNode(1);
        Node n3 = graph.addNode(3);
        Node n2 = graph.addNode(2);
        Node n4 = graph.addNode(4);
        Node n9 = graph.addNode(9);
        Node n7 = graph.addNode(7);
        Node n8 = graph.addNode(8);
        graph.addEdge(n0, n5);
        graph.addEdge(n0, n3);
        graph.addEdge(n0, n1);
        graph.addEdge(n1, n2);
        graph.addEdge(n1, n4);
        graph.addEdge(n1, n8);
        graph.addEdge(n3, n2);
        graph.addEdge(n3, n4);
        graph.addEdge(n3, n7);
        graph.addEdge(n3, n9);
        graph.addEdge(n7, n8);
        graph.printGraph();
    }

}
