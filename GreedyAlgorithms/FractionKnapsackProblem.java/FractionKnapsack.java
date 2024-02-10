import java.util.*;
public class FractionKnapsack {
    static void knapSack(ArrayList<KnapsackItem> items,int capacity){
        Comparator<KnapsackItem> compareRatio=new Comparator<KnapsackItem>(){
            @Override
            public int compare(KnapsackItem o1,KnapsackItem o2){
                if(o2.getRatio()>o1.getRatio())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(items,compareRatio);
        int usedCapacity=0;
        double totalValue=0;
        for(KnapsackItem item:items){
            if(usedCapacity+item.getWeight()<=capacity){
                usedCapacity+=item.getWeight();
                System.out.println("Taken: "+item);
                totalValue=totalValue+item.getValue();
            }
            else{
                int usedWeight=capacity-usedCapacity;
                double value=item.getRatio()*usedWeight;
                System.out.println("Taken: item index= "+item.getIndex()+", obtained value="+value+", used weight="+usedWeight+", ratio= "+item.getRatio());
                usedCapacity+=usedWeight;
                totalValue=totalValue+value;
            }
            System.out.println("Total value="+totalValue);
            if(usedCapacity==capacity) break;
        }
    }
}
