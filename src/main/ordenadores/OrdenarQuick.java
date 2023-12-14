package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;
    }

    public int quickParticio(int[] array, int inicio, int fim){
            int pivot = array[inicio];
            int i = inicio;
        
            for (int j = inicio + 1; j <= fim; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        
            int temp = array[i];
            array[i] = array[inicio];
            array[inicio] = temp;
        
            return i;
        }
    }