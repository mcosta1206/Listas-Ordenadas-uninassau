import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] minhaLista = new int[100];

        // Preenchendo o array com valores aleatórios
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            minhaLista[i] = random.nextInt(1000); // Valores aleatórios entre 0 e 999
        }

        System.out.println("Array desordenado:");
        imprimirArray(minhaLista);

        // Chamando a função Quick Sort para ordenar o array
        quickSort(minhaLista, 0, minhaLista.length - 1);

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

    // Função Quick Sort
    static void quickSort(int[] arr, int esquerda, int direita) {
        if (esquerda < direita) {
            int indiceParticao = particionar(arr, esquerda, direita);
            quickSort(arr, esquerda, indiceParticao - 1);
            quickSort(arr, indiceParticao + 1, direita);
        }
    }

    // Função de partição
    static int particionar(int[] arr, int esquerda, int direita) {
        int pivo = arr[direita];
        int i = (esquerda - 1);
        
        for (int j = esquerda; j < direita; j++) {
            if (arr[j] <= pivo) {
                i++;
                // Troca arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i + 1] e arr[direita] (pivô)
        int temp = arr[i + 1];
        arr[i + 1] = arr[direita];
        arr[direita] = temp;

        return i + 1;
    }
}