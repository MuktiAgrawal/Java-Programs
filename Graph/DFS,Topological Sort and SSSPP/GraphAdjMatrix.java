import java.util.*;
public class GraphAdjMatrix {
    ArrayList<GraphNode> nodeList=new ArrayList<GraphNode>();
    int [][] adjacencyMatrix;
    public GraphAdjMatrix(ArrayList<GraphNode> nodeList){
        this.nodeList=nodeList;
        adjacencyMatrix=new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i,int j){
        adjacencyMatrix[i][j]=1;
        adjacencyMatrix[j][i]=1;
    }

    public String toString(){
        StringBuilder s=new StringBuilder();
        s.append("   ");
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+" ");
        }
        s.append("\n");
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+": ");
            for(int j:adjacencyMatrix[i]){
                s.append((j)+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    // get neighbors
    public ArrayList<GraphNode> getNeighbors(GraphNode node){
        ArrayList<GraphNode> neighbors=new ArrayList<GraphNode>();
        int nodeIndex=node.index;
        for(int i=0;i<adjacencyMatrix.length;i++){
            if(adjacencyMatrix[nodeIndex][i]==1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }

    public void dfsVisit(GraphNode node){
        Stack<GraphNode> stack=new Stack<>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNode currentNode=stack.pop();
            currentNode.isVisited=true;
            System.out.print(currentNode.name+" ");
            ArrayList<GraphNode> neighbors=new ArrayList<GraphNode>();
            neighbors=getNeighbors(currentNode);
            for(GraphNode neighbor:neighbors){
                if(!neighbor.isVisited){
                    stack.push(neighbor);
                    neighbor.isVisited=true;
                }
            }
        }
    }

    public void dfs(){
        for(GraphNode node:nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }
    
    public void addDirectedEdge(int i,int j){
        adjacencyMatrix[i][j]=1;
    }

    public void topologicalVisit(GraphNode node, Stack<GraphNode> stack){
        ArrayList<GraphNode> neighbors=getNeighbors(node);
        for(GraphNode neighbor:neighbors){
            if(!neighbor.isVisited){
                topologicalVisit(neighbor, stack);
            }
        }
        node.isVisited=true;
        stack.push(node);
    }

    public void topologicalSort(){
        Stack<GraphNode> stack=new Stack<>();
        for(GraphNode node:nodeList){
            if(!node.isVisited){
                topologicalVisit(node, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().name+" ");
        }
    }

    public static void pathPrint(GraphNode node){
        if(node.parent!=null){
            pathPrint(node.parent);
        }
        System.out.print(node.name+" ");
    }

    public void BFSforSSSPP(GraphNode node){
        LinkedList<GraphNode> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currNode=queue.remove(0);
            currNode.isVisited=true;
            System.out.print("Printing path for node "+currNode.name+": ");
            pathPrint(currNode);
            System.out.println();
            ArrayList<GraphNode> neighbors=getNeighbors(currNode);
            for(GraphNode neighbor:neighbors){
                if(!neighbor.isVisited){
                    neighbor.isVisited=true;
                    queue.add(neighbor);
                    neighbor.parent=currNode;
                }
            }
        }
    }
}
