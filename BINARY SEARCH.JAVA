import java.util.*;
class Hard {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        int left = 0, right = a.length - 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int search = sc.nextInt();
        boolean found = false;
        while (left <= right) {
            int mid = left + (right - left) / 2; 
            if (a[mid] == search) {
                System.out.println("Found at index: " + mid);
                found = true;
                break;
            } else if (a[mid] < search) {
                left = mid + 1; 
            } else {
                right = mid - 1;            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
