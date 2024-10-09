package repositorio;

 
public class Repositorio<T> implements RepositorioDeReservas<T>{
    
    private int tamanho;
    private int capacidade;
    private T[] vetor;

    @SuppressWarnings("unchecked")
    public Repositorio(){
        this.tamanho = 0;
        this.capacidade = 10;
        this.vetor = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")
    public Repositorio(int capacidade){
        this.tamanho = 0;
        this.capacidade = capacidade;
        this.vetor = (T[]) new Object[capacidade];
    }

    @Override
    public void add(T object){
        if(tamanho==capacidade){
            resize();
        }
        vetor[tamanho] = object;
        tamanho++;
    }

    @Override
    public void remove(int index){
        if(tamanho==0){
            throw new IndexOutOfBoundsException("Lista está vazia.");
        }
        if(index<0 || index>=tamanho){
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        for(int i=index; i<tamanho; i++){
            vetor[index] = vetor[index+1];
        }
        vetor[tamanho-1] = null;
        tamanho--;
    }

    @Override
    public void set(int index, T object){
        if(index<0 || index>=tamanho){
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        vetor[index] = object;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void clear(){
        this.vetor = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    @Override
    public T get(int index){
        if(index<0 || index>=tamanho){
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        return vetor[index];
    }

    @Override
    public int size(){
        return tamanho;
    }

    @SuppressWarnings({ "unchecked" })
    private void resize(){
        if (tamanho == capacidade){
            T[] newArray = (T[]) new Object[capacidade*2];
            for(int i=0; i<tamanho; i++){
                newArray[i] = vetor[i];
            }
            capacidade = (capacidade*2);
            vetor = newArray;
        }
    }
}