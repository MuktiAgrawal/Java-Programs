import java.util.*;
public class WeightedGraph {
    ArrayList<WeightedNode> nodeList=new ArrayList<WeightedNode>();

    public WeightedGraph(ArrayList<WeightedNode> nodeList){
        this.nodeList=nodeList;
    }

    void dijkstra(WeightedNode node){
        PriorityQueue<WeightedNode> queue=new PriorityQueue<WeightedNode>();
        node.distance=0;
        queue.addAll(nodeList);
        while(!queue.isEmpty()){
            WeightedNode currentNode=queue.remove();
            for(WeightedNode neighbor:currentNode.neighbors){
                if(queue.contains(neighbor)){
                    if(neighbor.distance>currentNode.distance+currentNode.weightMap.get(neighbor)){
                        neighbor.distance=currentNode.distance+currentNode.weightMap.get(neighbor);
                        neighbor.parent=currentNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for(WeightedNode nodeTocheck:nodeList){
            System.out.print("Node "+nodeTocheck+", distance: "+nodeTocheck.distance+", Path: ");
            pathPrint(nodeTocheck);
            System.out.println();
        }
    }
    
    // Path Print
    public static void pathPrint(WeightedNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    // Add Weighted Edge
    public void addWeightedEdge(int i,int j,int d){
        WeightedNode first=nodeList.get(i);
        WeightedNode second=nodeList.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second,d);
    }

    
    // Bellman Ford Algorithm
    void bellmanFord(WeightedNode sourceNode){
        sourceNode.distance=0;
        for(int i=0;i<nodeList.size();i++){
            for(WeightedNode currentNode:nodeList){
                for(WeightedNode neighbor:currentNode.neighbors){
                    if(neighbor.distance>currentNode.distance+currentNode.weightMap.get(neighbor)){
                        neighbor.distance=currentNode.distance+currentNode.weightMap.get(neighbor);
                        neighbor.parent=currentNode;
                    }
                }
            }
        }
        System.out.println("Checking for Negative Cycle...");
        for(WeightedNode currentNode:nodeList){
            for(WeightedNode neighbor:currentNode.neighbors){
                if(neighbor.distance>currentNode.distance+currentNode.weightMap.get(neighbor)){
                    System.out.println("Negative cycle found \n");
                    System.out.println("Vertex name: "+neighbor.name);
                    System.out.println("Old cost: "+neighbor.distance);
                    int newDistance=currentNode.distance+currentNode.weightMap.get(neighbor);
                    System.out.println("New cost: "+newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative Cycle not found");
        
        for(WeightedNode nodeTocheck:nodeList){
            System.out.print("Node "+nodeTocheck+", distance: "+nodeTocheck.distance+", Path: ");
            pathPrint(nodeTocheck);
            System.out.println();
        }
    }
    
    void floydWarshall(){
        int size=nodeList.size();
        int[][] V=new int[size][size];

        // Initializing the matrix V
        for(int i=0;i<size;i++){
            WeightedNode first=nodeList.get(i);
            for(int j=0;j<size;j++){
                WeightedNode second=nodeList.get(j);
                if(i==j){
                    V[i][j]=0;
                }
                else if(first.weightMap.containsKey(second)){
                    V[i][j]=first.weightMap.get(second);
                }
                else{
                    // Divide by 10 to avoid arithmetic overflow
                    V[i][j]=Integer.MAX_VALUE/10;
                }
            }
        }

        // Updating the minimum distance between i and j via k if it is smaller than V[i][j]
        for(int k=0;k<size;k++){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(V[i][j]>V[i][k]+V[k][j]){
                        V[i][j]=V[i][k]+V[k][j];
                    }
                }
            }
        }

        // Printing the matrix
        for(int i=0;i<size;i++){
            System.out.println("Printing distance list for node "+nodeList.get(i)+":");
            for(int j=0;j<size;j++){
                System.out.print(V[i][j]+" ");
            }
            System.out.println();
        }
    }
}