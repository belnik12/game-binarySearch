package ru.belnik.binary;

public class ABC {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.binarySearch(69, 0, 99 );
    }

    public void binarySearch(int key, int low, int high) {
        int[] sortedArray = new int[100];
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = i + 1;
        }
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        System.out.println(index);
    }
}
