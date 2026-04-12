package Assigment_15_Generic.Q1_;

class Q1_GenericBox<T>{
   private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}