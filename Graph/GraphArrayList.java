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
}
