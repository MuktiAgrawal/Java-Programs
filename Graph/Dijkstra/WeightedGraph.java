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
    public static void pathPrint(WeightedNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }
}
