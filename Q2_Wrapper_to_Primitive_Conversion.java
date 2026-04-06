package Assignment_14;

public class Q2_Wrapper_to_Primitive_Conversion {
    public void wapperToPrimitive(){
        Double num1= 47.52;
        double num2 = 47.52;
        int num3 = (int)num2;
        System.out.println("Double :-"+num1);
        System.out.println("double:-"+num2);
        System.out.println("Integer :- "+num3);
    }

    public static void main(String[] args) {
        Q2_Wrapper_to_Primitive_Conversion q2 = new Q2_Wrapper_to_Primitive_Conversion();

        q2.wapperToPrimitive();
    }
}
