import java.util.List;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

public Class Main() {
    public static void main(String args[]) {
        //List practice, also, ArrayList is a list instance.
        List<Integer> practiceList = new ArrayList<Integer>();

        practiceList.add(5);
        practiceList.add(9);
        practiceList.add(1);
        practiceList.add(3);
        practiceList.add(10);
        practiceList.add(15);

        System.out.println(practiceList.get(0));
        practiceList.set(0, 15);
        System.out.println(practiceList.get(0));
        practiceList.remove(0);

        Map<String, Integer> mapPractice = new HashMap<String, Integer>();
        mapPractice.put("Hello", 5);
        mapPractice.put("World", 10);

        System.out.println(mapPractice.get("Hello"));
    }
}