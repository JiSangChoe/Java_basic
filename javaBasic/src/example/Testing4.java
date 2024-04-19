package example;

class Parent {
    String name = "Parent";
    public Parent() {
        System.out.print("P; " + this.name);
    }
    public Parent(String name) {
        this.name = name;
        System.out.print("P(String) :" + this.name);
    }
}
class Child extends Parent {
    int num;
    public Child(String name, int num){
        super(name);
        this.num = num;
    }
    void info() {
        System.out.print(num);
    }
}

public class Testing4 {
    public static void main(String[] args) {
        Child c = new Child("Soojebi", 2021);
        c.info();
    }
}
