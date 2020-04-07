public class newSorting {
    int [] a = {1,2,3,4,5};
    int size = 4;

    public static void newSorting(int [] arr, int size){
       // base case
        if(arr.length < size || arr.length == size){
            Quicksort(arr, 0 ,arr.length);
        }
        else{

            // 1. Sort the left half and recursively call newSorting on it
            int mid = arr.length/2;
            int [] left = new int [mid];
            for (int i = 0; i < left.length; i++){
                left[i] = arr[i];
            }
            newSorting(left, size);

            // 2. Sort the left half and recursively call newSorting on it
            int [] right = new int [arr.length-mid];
            for (int i = (mid/2)+1; i < right.length; i++){
                right[i] = arr[i];
            }
            newSorting(right,size);

            // 3. have sorted left and sorted right, combine them
            mergeSortedHalves(arr,left,right);
        }
    }

    public static void mergeSortedHalves(int[] a, int[] l, int[] r){

        // iterators for the left and right arrays
        int liter = 0;
        int riter = 0;

        // populating the a array
        for(int i = 0; i < a.length; i++){

        }

    }



    public static void Quicksort(int[] numbers, int i, int k){
        // Base case: if one or zero elements, partition is already sorted
        if(i >= k){
            return;
        }

        // Partition the array.
        // Value j is the location of last element in low partition.
        int j = Partition(numbers, i , k);

        // Recursively sort low and high partitions
        Quicksort(numbers, i, j-1);
        Quicksort(numbers, j+1, k);
    }
    public static int Partition(int[] numbers,int low,int high){
        int pivot = numbers[high];
        int i = (low-1); // index of smaller element
        for (int j= low; j < high; j++){
            // If current element is smaller than the pivot
            if (numbers[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = numbers[i+1];
        numbers[i+1] = numbers[high];
        numbers[high] = temp;
        return i+1;
    }
}

