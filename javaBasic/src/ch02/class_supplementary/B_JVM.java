package class_supplementary;

class Class {

    int variable1;
    double variable2;

    void method1 () {

    }

    static void method2 (int basic) {
        basic++;
    }

    static void method2 (Ref instance) {
        instance.number++;
    }
    
    static int method3 () {
        int result = 10;
        return result;
    }

    static Ref method4 () {
        Ref result = new Ref();
        return result;
    }

}

class Ref {
    int number;
}

public class B_JVM {
    public static void main(String[] args) {
        
        int localVariable;
        localVariable = 99;

        Class refVariable;
        refVariable = new Class();

        refVariable.variable1 = 55;

        System.out.println(refVariable.variable1);

        int[] array;
        array = new int[5];

        array[0] = 123;
        System.out.println(array[2]);



        int number = 0;
        Class.method2(number);

        Ref instance = new Ref();
        instance.number = 0;
        Class.method2(instance);
        // instacne.number ???????

        int integer;
        integer = Class.method3();
        // integer

        Ref refInstance = instance;
        refInstance = Class.method4();

    }    
}
