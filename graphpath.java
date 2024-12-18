import java.beans.Visibility;
import java.util.*;


//In this question print all possible path from source to destination

public class graphpath {

    static class edge{
        int src;
        int dest;
        int wt;

        edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void  creategraph(ArrayList<edge> graph[]){

        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<edge>(); 
        }

        //vertex 0
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        //vertex 1
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        //vertex 2
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        //vertex 3
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));


        //Vertex 4
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        //Vertex 5
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 6, 1));

        //Vertex 6
        graph[6].add(new edge(6, 5, 1));
       
    }

    public static void dfs(ArrayList<edge>[] graph,int curr,boolean[] vis){  //O(V+E)

        //visit
        System.out.println(curr+" ");
        vis[curr]=true;

        for (int i = 0; i < graph[curr].size(); i++) {

            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph, e.dest, vis);
            }
            
        }
    }
    
    //Use the modified DFS
    public static void allPath(){
        
    }

    

    //Has path problem  O(V+E)
    public static boolean hasPath(ArrayList<edge>[] graph,int src,int dest,boolean vis[]){

       if(src==dest){
        return true;
       }

       vis[src]=true;

       for(int i=0; i<graph[src].size(); i++){
        edge e=graph[src].get(i);

        //e.dest=neighbour
        if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
            return true;
         }
       }
        return false;
    }

    public static void main(String[] args) {


        /*
         Use this graph for question
             1-----3
            /      | \
           0       |   5---6
            \      | /
             2-----4
         */

        /*decler array tha is ArrayList<edge>  */
        ArrayList<edge> graph[]=new ArrayList[7];
        boolean[] vis=new boolean[7];

        //Call the graphcreate method
        creategraph(graph);
        // dfs(graph, 0, vis);
        // boolean hn=hasPath(graph, 0, 5, vis);
        
    }
    
}


