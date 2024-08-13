package Day_12;

import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {

        KthLargest kl = new KthLargest(3,new int[]  {4,5,8,2});
        System.out.println(kl.add(3));
        System.out.println(kl.add(5));
        System.out.println(kl.add(10));
        System.out.println(kl.add(9));
        System.out.println(kl.add(4));
    }
    public static class KthLargest {
        private int k;
        private PriorityQueue<Integer> pq;
        public KthLargest( int k, int[] nums){
            this.k = k;
            pq = new PriorityQueue<>(k);
            for (int num : nums) {
                pq.offer(num);
                if (pq.size() > k)
                    pq.poll();
            }
        }

        public int add ( int val){
            pq.offer(val);
            if (pq.size() > k) pq.poll();
            return pq.peek();
        }
    }
}
