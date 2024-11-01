public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 = solution.mergeTwoLists(list1, list2);
        System.out.print("Example 1 merged list: ");
        printList(result1);

        // Example 2: list1 = [], list2 = []
        list1 = null;
        list2 = null;
        ListNode result2 = solution.mergeTwoLists(list1, list2);
        System.out.print("Example 2 merged list: ");
        printList(result2);

        // Example 3: list1 = [], list2 = [0]
        list1 = null;
        list2 = new ListNode(0);
        ListNode result3 = solution.mergeTwoLists(list1, list2);
        System.out.print("Example 3 merged list: ");
        printList(result3);
    }

    // Utility method to print a linked list
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
