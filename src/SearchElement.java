public class SearchElement {

    public static void main(String[] args) {
        search(new int[] {1, 2, 3, 4, 5}, 3);
    }

    /*
    Create a function that searches for the
    index of a given item in an array. If the
    item is present, it should return the index,
    otherwise, it should return -1.
    */
    public static int search(int arr[], int item) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
