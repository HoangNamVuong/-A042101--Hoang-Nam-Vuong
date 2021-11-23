package examination;

public class ImportProduct extends Product {
    private String importPrice;
    private String importProvince;
    private String importTax;

   public ImportProduct() {

   }

    public ImportProduct(int id,
                         int idCard,
                         String name,
                         String price,
                         int quanity,
                         String producer,
                         String importPrice,
                         String importProvince,
                         String importTax) {
        super(id, idCard, name, price, quanity, producer);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
    }

    public String getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(String importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public String getImportTax() {
        return importTax;
    }

    public void setImportTax(String importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return "ImportProduct{" + super.toString() +
                "importPrice='" + importPrice + '\'' +
                ", importProvince='" + importProvince + '\'' +
                ", importTax='" + importTax + '\'' +
                '}';
    }
}
