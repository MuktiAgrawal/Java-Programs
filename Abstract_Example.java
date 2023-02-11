abstract class Shape { 
    abstract void draw();
}

class Circle extends Shape { 
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square extends Shape { 
    void draw() {
        System.out.println("Drawing Square");
    }
}

public class Abstract_Example {
    public static void main(String[] args) { 
        Shape s = new Square();
        s.draw();
    }
}
