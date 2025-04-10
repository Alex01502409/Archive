package youtube_course;

import java.util.ArrayList;

public class ArrayListCollection {

    // Колекції
    public static void main(String[] args) {

        ArrayList<Short> nums = new ArrayList<>();

        nums.add((short)56);
        short num1 = 45;
        nums.add(num1);
        nums.add(1, (short)13);
        nums.remove(1);
        nums.set(0, (short)90);
//        Short[] nummbers = (Short[]) nums.toArray();
//        nums.isEmpty();
//        nums.clear();

        for (short num : nums) { // (int i = 0; i < nums.size(); i++) перебір колекції
            System.out.println(num);
        }

    }
}

