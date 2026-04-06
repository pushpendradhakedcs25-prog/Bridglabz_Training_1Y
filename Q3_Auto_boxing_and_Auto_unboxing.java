package Assignment_14;

import java.util.ArrayList;
import java.util.List;

public class Q3_Auto_boxing_and_Auto_unboxing {
    public void autoUnBoxing(){
        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Addition of list :- "+list);
        int sum=0;
        for(Integer num : list){
            sum+=num;
        }
        System.out.println("sum :-"+sum);

    }
}
