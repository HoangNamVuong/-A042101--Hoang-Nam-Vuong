package lesson12_java_collection_framework.exercise.use_arrayList_LinkedList;

public class Product implements Comparable<Product>{
    private String nameProduct;
    private String price;
    private int id;

    public Product() {

    }

    public Product(int id, String nameProduct, String price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", price='" + price + '\'' +
                ", id =" + id +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.getPrice().compareTo(o.getPrice());
    }
}
