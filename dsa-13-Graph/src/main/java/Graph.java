import java.util.ArrayList;
import java.util.List;

public class Graph {
// I need representation ways to go. for the relationships I have two different ways to go
//I can use matrix or list

    // first create List
    List<List<Vertex>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        //construct Adjacency List
        // create empty arraylists fro each AdjList element
        for (int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }// I have created empty list, I am going to fill list with edges


        //add vertices connected to current vertex
        for (Edge edge : edges) {
            adjList.get(edge.from).add(new Vertex(edge.to, edge.weight));
        }// this will add every, with the from field and from that field
    }

    public static void printGraph(Graph graph) {
        int fromVertex = 0;
        System.out.println("Printing the relationships on the graph....");
        while (fromVertex<graph.adjList.size()){
            for (Vertex v: graph.adjList.get(fromVertex)) {
                System.out.println("Vertex" + fromVertex+" ==>"+ v.value + " (" + v.weight+ ")\t");
            }
            System.out.println();
            fromVertex++;
        }
    }

}
