package week21_01_28_2023.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test2 {

    // get the Male spartans
    public static void main(String[] args) {
        List<Map<String ,Object>> result =new ArrayList<>();
        for (Map<String, Object> spartan : Spartans.getSpartans()) {
            if (spartan.get("gender").toString().equalsIgnoreCase("male")){
                result.add(spartan);
            }

        }
        System.out.println(result);
        System.out.println(result.size());
    }
}
