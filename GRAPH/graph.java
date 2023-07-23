package GRAPH;

import java.util.*;


class graph_implementaion {
    private LinkedList<Integer> adjacency[];

    public graph_implementaion(int v) {
        adjacency = new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<Integer>();
        }
    }

    public void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);


    }
    public void bfs(int source){
        boolean visited_node[]=new boolean[adjacency.length];//array for visited node
        int parent_node[]=new int[adjacency.length];
        Queue<Integer> q=new LinkedList<>();
q.add(source);
        visited_node[source]=true;
        parent_node[source]=-1;

        while(!q.isEmpty()){
            int p=q.poll();
            System.out.print(p+" ");
            for(int i:adjacency[p]){
                if(visited_node[i]!=true){
                    visited_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }

            }
        }
    }
}

public class graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of vertics and edges");
        int v = sc.nextInt();
        int e = sc.nextInt();

        graph_implementaion g = new graph_implementaion(v);
        System.out.println("Enter Edges:");
        for (int i = 0; i < e; i++) {
            int s = sc.nextInt();
            int d = sc.nextInt();
            g.insertedge(s, d);


        }
        System.out.println("Enter the source:");
        int source=sc.nextInt();
        g.bfs(source);
    }
}
