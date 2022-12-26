import java.util.ArrayList;
public class MainGraphArrayList {
    public static void main(String[] args) {
        ArrayList<GraphNodeArrayList> nodeList=new ArrayList<GraphNodeArrayList>();
        nodeList.add(new GraphNodeArrayList("A",0));
        nodeList.add(new GraphNodeArrayList("B",1));
        nodeList.add(new GraphNodeArrayList("C",2));
        nodeList.add(new GraphNodeArrayList("D",3));
        nodeList.add(new GraphNodeArrayList("E",4));
        GraphArrayList g=new GraphArrayList(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(0, 3);
        g.addUndirectedEdge(1, 4);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(3, 4);
        System.out.print(g.toString());
    }
}
