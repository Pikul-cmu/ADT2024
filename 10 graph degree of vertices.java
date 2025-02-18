import java.util.*;

class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // Undirected graph: add edge both ways
    }

    public int getDegree(String vertex) {
        return adjList.getOrDefault(vertex, new ArrayList<>()).size();
    }

    public void printDegrees() {
        for (String vertex : adjList.keySet()) {
            System.out.println("Degree of " + vertex + ": " + getDegree(vertex));
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");
        graph.addEdge("B", "C");
        graph.addEdge("B", "E");
        graph.addEdge("C", "F");
        graph.addEdge("D", "E");

        graph.printDegrees();
    }
}





	
	
	
