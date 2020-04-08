
public class newSorting {

    public void newSorting(int [] arr, int size){

        // base case
        // If the length of the array is less than or equal to the size given
        // then sort with quicksort method
        if(arr.length <= size){
            Quicksort(arr, 0 ,arr.length-1);
        }

        // If not, divide the array into halves and prepare it for mergeSortedHalves
        else{

            // 1. Sort the left half and recursively call newSorting on it

            // Create the left half using the middle as an endpoint
            int mid = arr.length/2;
            int [] left = new int [mid];

            // Now populate the left array
            for (int i = 0; i < left.length; i++){
                left[i] = arr[i];
            }

            // Finally, call recursively the method using the smaller array and size as parameters
            newSorting(left, size);

            // 2. Sort the left half and recursively call newSorting on it

            // Create the right half using one after the middle as the starting point
            int [] right = new int [arr.length-mid];

            // Populate the right away
            for (int i = 0; i < right.length; i++){
                right[i] = arr[i + left.length];
            }

            // Finally, call recursively the method using the smaller array and size as parameters
            newSorting(right,size);

            // 3. Have sorted left and sorted right, combine them
            mergeSortedHalves(arr,left,right);
        }
    }

    private void mergeSortedHalves(int[] a, int[] l, int[] r){

        // iterators for the left and right arrays and main array
        int liter = 0;
        int riter = 0;
        int i = 0;

        // populating the a array with out of bounds conditional
        while(i < a.length && liter < l.length && riter < r.length){

            // Conditional for lower element
            if(l[liter] < r[riter]){
                a[i] = l[liter];
                liter++;
                i++;
            }

            // Conditional for lower element
            else{
                a[i] = r[riter];
                riter++;
                i++;
            }
        }

        while(liter < l.length){
            a[i] = l[liter];
            liter++;
            i++;
        }
        while(riter < r.length){
            a[i] = r[riter];
            riter++;
            i++;
        }
    }

    // Helper method for newSorting method, necessary for base case
    private static void Quicksort(int[] numbers, int i, int k){
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

    // Helper method part of quicksort
    private static int Partition(int[] numbers,int low,int high){
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



