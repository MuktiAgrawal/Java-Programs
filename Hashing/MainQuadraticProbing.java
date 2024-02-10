public class MainQuadraticProbing {
    public static void main(String[] args) {
        QuadraticProbing quadraticProbing=new QuadraticProbing(13);
        quadraticProbing.insertInHashTable("The");
        quadraticProbing.insertInHashTable("quick");
        quadraticProbing.insertInHashTable("brown");
        quadraticProbing.insertInHashTable("fox");
        quadraticProbing.insertInHashTable("jumps");
        quadraticProbing.insertInHashTable("over");
        quadraticProbing.displayHashTable();

    }
}
