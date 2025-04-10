package youtube_course;

import java.util.LinkedList;

public class LinkedListClass {

    // Колекція LinkedList
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<>();
        numbers.add(5.5f);
        numbers.add(15.523f);
        numbers.add(8.427f);

//        numbers.removeFirst();
        for (float num : numbers)
            System.out.println(num);

    }
}
