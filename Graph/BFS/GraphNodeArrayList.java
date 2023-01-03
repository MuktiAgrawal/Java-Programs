import java.util.ArrayList;
public class GraphNodeArrayList {
    public int index;
    public String name;
    public ArrayList<GraphNodeArrayList> neighbors=new ArrayList<GraphNodeArrayList>(); 
    public boolean isVisited=false;
    public GraphNodeArrayList(String name,int index){
        this.name=name;
        this.index=index;
    }
}
