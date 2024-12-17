import java.util.*;

//Here it tells how to create a graph
//Using an adjacency list

public class graphconcept {
    static class Edge{
        int src;
        int dest;
        int wait;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wait=w;
        }
    }
    public static void main(String[] args){

        //Number vertex(v) size of array
        int V=5;
        //Create an adjacency list
        @SuppressWarnings("unchecked")
        List<Edge>[] graph=new ArrayList[V];

        //Initialize adjacency list for each vertex
        for (int i=0; i<V; i++){
            graph[i]=new ArrayList<>();
        }

        //0-vertex
        graph[0].add(new Edge(0,1,5));

        //1-vertex
        graph[0].add(new Edge(1,0,5));
        graph[0].add(new Edge(1,2,1));
        graph[0].add(new Edge(1,3,3));

        //2-vertex
        graph[0].add(new Edge(2,1,1));
        graph[0].add(new Edge(2,3,1));
        graph[0].add(new Edge(2,4,4));

        //3-vertex
        graph[0].add(new Edge(3,1,3));
        graph[0].add(new Edge(3,2,1));

        //4-vertex
        graph[0].add(new Edge(4,2,1));

        //find all neighbors
        //2's neighbors
        for(int i=0; i<graph[2].size(); i++){
            Edge e=graph[2].get(i);
            //Print all destination value that is the neighbors
            System.out.println("Vertex:"+e.dest+", Weight"+e.wait);
        }

        System.out.println("Graph constructed successfully!");

    }
}
