package Ordenacao;
import java.util.Arrays;
import java.util.Random;
public class codigodois {



        public static void main(String[] args) {
            int[] A = generateRandomArray(50000);
            long startTime = System.nanoTime();
            selectionSort(A);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
            System.out.println("Tempo de execução (Selection Sort): " + duration + " nanossegundos");
            System.out.println("B: " + Arrays.toString(A));
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
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


