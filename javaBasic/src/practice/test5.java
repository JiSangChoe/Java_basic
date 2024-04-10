package practice;

class Person {
    private String name;
    public Person(String val1) {
        name =val1;
    }
// 이 코드에는 두 가지 주요 문제가 있습니다.
// 1. get 메소드가 static으로 선언되어 있습니다. 그러나 name은 비정적 필드입니다. static 메소드는 클래스 수준에서 작동하므로 특정 인스턴스의 상태에 액세스할 수 없습니다. 이 문제를 해결하려면 get 메소드를 비정적으로 만들어야 합니다.
// 2. get 메소드가 현재 사용되지 않고 있습니다. 이 메소드를 사용하거나 필요하지 않은 경우 제거할 수 있습니다.

    // public static String get() {
    //     return name;  
    // }
    public void print() {
        System.out.println(name);
    }
}

public class test5 {
    public static void main(String[] args) {
        Person obj = new Person("Kim");
        obj.print();
    }
}
