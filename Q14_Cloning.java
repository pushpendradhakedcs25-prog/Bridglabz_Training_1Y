package Assigment_10;

class Test implements Cloneable {
    int x = 10;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Q14_Cloning {
    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
        Test t2 = (Test)t1.clone();
        System.out.println(t2.x);
    }
}