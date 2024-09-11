public class FindDuplicateNumber {

    public static int findDuplicate(int[] arr) {
        // Phase 1: Detect the cycle
        int tortoise = arr[0];
        int hare = arr[0];
        
        do {
            tortoise = arr[tortoise];        // Move tortoise by 1 step
            hare = arr[arr[hare]];           // Move hare by 2 steps
        } while (tortoise != hare);
        
        // Phase 2: Find the entry point of the cycle (duplicate number)
        tortoise = arr[0];  // Move tortoise to the start
        
        while (tortoise != hare) {
            tortoise = arr[tortoise];  // Move both pointers by 1 step
            hare = arr[hare];
        }
        
        return hare;  // The duplicate number
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 4, 2};  // Example array
        System.out.println("Duplicate Number: " + findDuplicate(arr));
    }
}
