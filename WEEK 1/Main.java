public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,6,7,4,8,9};
        ABC obj = new ABC();
        obj.findSecondLargest(arr);
    }
}
class ABC{
    public void findSecondLargest(int[] arnum){
       int largest= Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;
        for (int i : arnum) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i != largest) {
                secondLargest = i;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("NO second");
        } else {
            System.out.println("The second largest is " + secondLargest);
        }


    }
    }