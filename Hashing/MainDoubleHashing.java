public class MainDoubleHashing {
    public static void main(String[] args) {
        DoubleHashing doubleHashing=new DoubleHashing(13);
        doubleHashing.insertKeyInHashTable("The");
        doubleHashing.insertKeyInHashTable("quick");
        doubleHashing.insertKeyInHashTable("brown");
        doubleHashing.insertKeyInHashTable("fox");
        doubleHashing.insertKeyInHashTable("jumps");
        doubleHashing.insertKeyInHashTable("over");
        doubleHashing.displayHashTable();
    }
}
