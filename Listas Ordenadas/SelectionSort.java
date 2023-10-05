import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] minhaLista = new int[100];

        // Preenchendo o array com valores aleatórios entre 0 e 999
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            minhaLista[i] = random.nextInt(1000); // Valores aleatórios entre 0 e 999
        }

        System.out.println("Array desordenado:");
        imprimirArray(minhaLista);

        // Chamando a função Selection Sort para ordenar o array
        selectionSort(minhaLista);

        System.out.println("\nArray ordenado:");
        imprimirArray(minhaLista);
    }

    // Função para imprimir o array
    static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Função Selection Sort
    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            // Encontra o índice do menor elemento no subarray não ordenado
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Troca o elemento atual com o menor elemento encontrado
            int temp = arr[indiceMenor];
            arr[indiceMenor] = arr[i];
            arr[i] = temp;
        }
    }
}