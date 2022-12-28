import java.util.*;
public class GraphArrayList {
    ArrayList<GraphNodeArrayList> nodeList=new ArrayList<GraphNodeArrayList>();

    public GraphArrayList(ArrayList<GraphNodeArrayList> nodeList){
        this.nodeList=nodeList;
    }

    public void addUndirectedEdge(int i,int j){
        GraphNodeArrayList first=nodeList.get(i);
        GraphNodeArrayList second=nodeList.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }
    // For printing Graph
    public String toString(){
        StringBuilder s=new StringBuilder();
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+": ");
            for(int j=0;j<nodeList.get(i).neighbors.size();j++){
                if(j==nodeList.get(i).neighbors.size()-1){
                    s.append(nodeList.get(i).neighbors.get(j).name);
                }
                else{
                    s.append(nodeList.get(i).neighbors.get(j).name+" -> ");
                }
            }
            s.append("\n");
        }
        return s.toString();
    }

    // BFS internal
    void bfsVisit(GraphNodeArrayList node){
        LinkedList<GraphNodeArrayList> queue=new LinkedList<GraphNodeArrayList>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNodeArrayList currentNode=queue.remove(0);
            System.out.print(currentNode.name+" ");
            currentNode.isVisited=true;
            for(GraphNodeArrayList neighbor:currentNode.neighbors){
                if(!neighbor.isVisited){
                    queue.add(neighbor);
                    neighbor.isVisited=true;
                }
            }
        }
    }

    // bfs method
    void bfs(){
        for(GraphNodeArrayList node:nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }
}
