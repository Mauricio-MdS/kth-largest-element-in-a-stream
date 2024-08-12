import java.util.*;

class KthLargest {

    int k;
    PriorityQueue<Integer> numbers;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        numbers = new PriorityQueue<>(k);

        for (int n : nums) {
            add(n);
        }
    }

    public int add(int val) {
        if (numbers.size() < k) numbers.add(val);
        else if (val > numbers.peek()){
            numbers.poll();
            numbers.add(val);
        }
        return numbers.peek();
    }
}