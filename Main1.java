package seven;

public class Main1 {
    public static void main(String[] args) {


        Graph graph = new GraphImpl(10);
        graph.addVertex("М");
        graph.addVertex("Т");
        graph.addVertex("Р");
        graph.addVertex("К");
        graph.addVertex("Д");
        graph.addVertex("Е");
        graph.addEdge("М", "Т");
        graph.addEdge("М", "Р");
        graph.addEdge("Р", "К");
        graph.addEdge("К", "Д");
        graph.addEdge("Т", "Е");

        graph.bfs("М");
        graph.dfs("М");
    }
}
