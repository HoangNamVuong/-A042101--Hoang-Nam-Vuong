package examination;

public abstract class Product {
    private int id;
    private int idCard;
    private String name;
    private String price;
    private int quanity;
    private String producer;

    public Product() {

    }

    public Product(int id, int idCard, String name, String price, int quanity, String producer) {
        this.id = id;
        this.idCard = idCard;
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", idCard=" + idCard +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quanity=" + quanity +
                ", producer='" + producer + '\'' +
                '}';
    }
}
