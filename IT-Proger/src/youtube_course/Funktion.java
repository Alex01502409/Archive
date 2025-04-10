package youtube_course;

public class Funktion {

    // Функції
    public static void main(String[] args) {
        int[] nums1 = {6, 7, 4, 7};
        summa(nums1);

        int[] nums2 = {6, 7, 4, 7, 6};
       summa(nums2);
    }

    public static void summa(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        System.out.println("Summa of all elements: " + sum);
    }

}