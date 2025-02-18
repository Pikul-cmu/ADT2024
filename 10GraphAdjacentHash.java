import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Graph {
    private HashMap<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addEdge(String u, String v) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u); // For an undirected graph
    }

    public boolean areAdjacent(String u, String v) {
        return adjList.containsKey(u) && adjList.get(u).contains(v);
    }

    public boolean isIncident(String vertex, String edgeStart, String edgeEnd) {
        return (vertex.equals(edgeStart) || vertex.equals(edgeEnd)) && areAdjacent(edgeStart, edgeEnd);
    }

    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");

        graph.printGraph();

        System.out.println("Are A and B adjacent? " + graph.areAdjacent("A", "B")); // true
        System.out.println("Is A incident to edge (A, B)? " + graph.isIncident("A", "A", "B")); // true
    }
}
