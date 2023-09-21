package Ordenacao;
import java.util.Arrays;
import java.util.Random;
    public class codigoum {

            public static void main(String[] args) {
                int[] A = generateRandomArray(50000);
                long startTime = System.nanoTime();
                bubbleSort(A);
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("Tempo de execução (Bubble Sort): " + duration + " nanossegundos");
                System.out.println("B: " + Arrays.toString(A));
            }

            public static void bubbleSort(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
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
