import java.util.*;
public class Graph {
    ArrayList<GraphNodeArrayList> nodeList=new ArrayList<GraphNodeArrayList>();

    public Graph(ArrayList<GraphNodeArrayList> nodeList){
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

    void dfsVisit(GraphNodeArrayList node){
        Stack<GraphNodeArrayList> stack=new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNodeArrayList currentNode=stack.pop();
            currentNode.isVisited=true;
            System.out.print(currentNode.name+" ");
            for(GraphNodeArrayList neighbor:currentNode.neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited=true;
                }
            }
        }
    }
    void dfs(){
        for(GraphNodeArrayList node:nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
    // Topological sort
    public void addDirectedEdge(int i,int j){
        GraphNodeArrayList first=nodeList.get(i);
        GraphNodeArrayList second=nodeList.get(j);
        first.neighbors.add(second);
    }

    void topologicalVisit(GraphNodeArrayList node,Stack<GraphNodeArrayList> stack){
        for(GraphNodeArrayList neighbor:node.neighbors){
            if(!neighbor.isVisited)
                topologicalVisit(neighbor, stack);
        }
        node.isVisited=true;
        stack.push(node);
    }

    void topologicalSort(){
        Stack<GraphNodeArrayList> stack=new Stack<>();
        for(GraphNodeArrayList node:nodeList){
            if(!node.isVisited){
                topologicalVisit(node, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
    }

    public static void pathPrint(GraphNodeArrayList node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }
    public void BFSforSSSPP(GraphNodeArrayList node){
        LinkedList<GraphNodeArrayList> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNodeArrayList currNode=queue.remove(0);
            currNode.isVisited=true;
            System.out.print("Printing path for node "+currNode.name+": ");
            pathPrint(currNode);
            System.out.println();
            for(GraphNodeArrayList neighbor:currNode.neighbors){
                if(!neighbor.isVisited){
                    neighbor.isVisited=true;
                    queue.add(neighbor);
                    neighbor.parent=currNode;
                }
            }
        }
    }
}
