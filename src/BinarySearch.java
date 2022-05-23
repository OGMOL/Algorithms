public class BinarySearch {
    public static int iterativeSearch(int[] arrayToSearch, int element) {
        int lowIndex = 0;
        int highIndex = arrayToSearch.length-1;

        // Holds the position in array for given element
        // Initial negative integer set to be returned if no match was found on array
        int elementPos = -1;

        // If lowIndex less than highIndex, there's still elements in the array
        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) / 2;
            if (element == arrayToSearch[midIndex]) {
                elementPos = midIndex;
                break;
            } else if (element < arrayToSearch[midIndex]) {
                highIndex = midIndex-1;
            } else if (element > arrayToSearch[midIndex]) {
                lowIndex = midIndex+1;
            }
        }
        return elementPos;
    }
}

// O(log n)
//Collections.binarySearch()
