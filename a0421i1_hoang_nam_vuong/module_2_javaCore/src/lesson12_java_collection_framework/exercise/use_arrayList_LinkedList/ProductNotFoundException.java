package lesson12_java_collection_framework.exercise.use_arrayList_LinkedList;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException() {
        super("not found product");
    }
}
