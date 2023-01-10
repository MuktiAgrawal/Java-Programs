import java.util.ArrayList;
public class MainGraphArrayList {
    public static void main(String[] args) {
        ArrayList<GraphNodeArrayList> nodeList=new ArrayList<GraphNodeArrayList>();
        // nodeList.add(new GraphNodeArrayList("A",0));
        // nodeList.add(new GraphNodeArrayList("B",1));
        // nodeList.add(new GraphNodeArrayList("C",2));
        // nodeList.add(new GraphNodeArrayList("D",3));
        // nodeList.add(new GraphNodeArrayList("E",4));

        nodeList.add(new GraphNodeArrayList("A", 0));
        nodeList.add(new GraphNodeArrayList("B", 1));
        nodeList.add(new GraphNodeArrayList("C", 2));
        nodeList.add(new GraphNodeArrayList("D", 3));
        nodeList.add(new GraphNodeArrayList("E", 4));
        nodeList.add(new GraphNodeArrayList("F", 5));
        nodeList.add(new GraphNodeArrayList("G", 6));
        // nodeList.add(new GraphNodeArrayList("H", 7));

        Graph g=new Graph(nodeList);
        g.addUndirectedEdge(0, 1);
        g.addUndirectedEdge(0, 2);
        g.addUndirectedEdge(1, 3);
        g.addUndirectedEdge(1, 6);
        g.addUndirectedEdge(2, 3);
        g.addUndirectedEdge(2, 4);
        g.addUndirectedEdge(3, 5);
        g.addUndirectedEdge(4, 5);
        g.addUndirectedEdge(5, 6);
        System.out.print(g.toString());
        // g.dfs();
        // g.topologicalSort();
        g.BFSforSSSPP(nodeList.get(1));
    }
}
