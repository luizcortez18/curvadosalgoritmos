package Ordenacao;
import java.util.Arrays;
import java.util.Random;
public class codigoquatro {




        public static void main(String[] args) {
            int[] A = generateRandomArray(50000);
            long startTime = System.nanoTime();
            mergeSort(A, 0, A.length - 1);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo de execução (Merge Sort): " + duration + " nanossegundos");
            System.out.println("B: " + Arrays.toString(A));
        }

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2;
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);
                merge(arr, left, mid, right);
            }
        }

        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = arr[left + i];
            }
            for (int i = 0; i < n2; i++) {
                R[i] = arr[mid + 1 + i];
            }

            int i = 0, j = 0;
            int k = left;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static int[] generateRandomArray(int size) {
            int[] arr = new int[size];
            Random rand = new Random();
            for (int i = 0; i < size; i++) {
                arr[i] = rand.nextInt(50000);
            }
            return arr;
        }
    }


