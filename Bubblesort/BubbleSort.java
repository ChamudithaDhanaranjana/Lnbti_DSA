class Bubblesort{

    // implement Bubblesort
    void Bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    // print an array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        Bubblesort bs = new Bubblesort();
        int arr[] = { 22, 16, 7, 8, 10, 12 };
        System.out.print("Before sorting : ");
        bs.printArray(arr);
        bs.Bubblesort(arr);
        System.out.print("After sorting : ");
        bs.printArray(arr);
    }
}