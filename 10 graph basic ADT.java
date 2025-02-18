import java.util.*;

class Graph {
    private Map<String, List<String>> adjList;

    // Create an empty graph
    public Graph() {
        adjList = new HashMap<>();
    }

    // Insert a vertex (without edges)
    public void insertVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    // Insert an edge between v1 and v2
    public void insertEdge(String v1, String v2) {
        adjList.putIfAbsent(v1, new ArrayList<>());
        adjList.putIfAbsent(v2, new ArrayList<>());
        adjList.get(v1).add(v2);
        adjList.get(v2).add(v1); // For undirected graph
    }

    // Delete a vertex and all its edges
    public void deleteVertex(String v) {
        if (adjList.containsKey(v)) {
            for (String neighbor : adjList.get(v)) {
                adjList.get(neighbor).remove(v);
            }
            adjList.remove(v);
        }
    }

    // Delete an edge between v1 and v2
    public void deleteEdge(String v1, String v2) {
        if (adjList.containsKey(v1)) {
            adjList.get(v1).remove(v2);
        }
        if (adjList.containsKey(v2)) {
            adjList.get(v2).remove(v1);
        }
    }

    // Check if the graph is empty
    public boolean isEmpty() {
        return adjList.isEmpty();
    }

    // Return a list of adjacent vertices
    public List<String> adjacent(String v) {
        return adjList.getOrDefault(v, new ArrayList<>());
    }

    // Print the adjacency list
    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        // Create vertices
        graph.insertVertex("A");
        graph.insertVertex("B");
        graph.insertVertex("C");
        graph.insertVertex("D");

        // Insert edges
        graph.insertEdge("A", "B");
        graph.insertEdge("A", "C");
        graph.insertEdge("B", "D");

        System.out.println("Graph after insertion:");
        graph.printGraph();

        // Check adjacency
        System.out.println("Adjacent to A: " + graph.adjacent("A"));

        // Delete edge
        graph.deleteEdge("A", "B");
        System.out.println("Graph after deleting edge (A, B):");
        graph.printGraph();

        // Delete vertex
        graph.deleteVertex("C");
        System.out.println("Graph after deleting vertex C:");
        graph.printGraph();

        // Check if empty
        System.out.println("Is graph empty? " + graph.isEmpty());
    }
}




	
	
	
