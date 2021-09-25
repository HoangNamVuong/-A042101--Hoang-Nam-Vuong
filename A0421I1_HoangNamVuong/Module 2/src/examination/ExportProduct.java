package examination;

public class ExportProduct extends Product{
    private String exportPrice;
    private String countryImportProduct;

    public ExportProduct() {

    }

    public ExportProduct(int id,
                         int idCard,
                         String name,
                         String price,
                         int quanity,
                         String producer,
                         String exportPrice,
                         String countryImportProduct) {
        super(id, idCard, name, price, quanity, producer);
        this.exportPrice = exportPrice;
        this.countryImportProduct = countryImportProduct;
    }

    public String getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(String exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getCountryImportProduct() {
        return countryImportProduct;
    }

    public void setCountryImportProduct(String countryImportProduct) {
        this.countryImportProduct = countryImportProduct;
    }

    @Override
    public String toString() {
        return "ExportProduct{"+ super.toString() +
                "exportPrice='" + exportPrice + '\'' +
                ", countryImportProduct='" + countryImportProduct + '\'' +
                '}';
    }
}
