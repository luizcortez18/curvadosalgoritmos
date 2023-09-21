package Ordenacao;
import java.util.Arrays;
import java.util.Random;
public class codigotres {




        public static void main(String[] args) {
            int[] A = generateRandomArray(50000);
            long startTime = System.nanoTime();
            insertionSort(A);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo de execução (Insertion Sort): " + duration + " nanossegundos");
            System.out.println("B: " + Arrays.toString(A));
        }

        public static void insertionSort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
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


