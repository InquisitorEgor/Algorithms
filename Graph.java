package seven;

public interface Graph {
    void addVertex(String label);

    boolean addEdge(String startLabel, String endLabel);

    void display();

    int getSize();

    void dfs(String startLabel);

    void bfs(String startLabel);
}
