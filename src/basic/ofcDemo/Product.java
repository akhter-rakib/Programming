package basic.ofcDemo;

public class Product {
    private Integer id;
    private String serialNo;
    private String productName;
    private Integer quatity;

    public Product() {
    }

    public Product(Integer id, String serialNo, String productName, Integer quatity) {

        this.id = id;
        this.serialNo = serialNo;
        this.productName = productName;
        this.quatity = quatity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuatity() {
        return quatity;
    }

    public void setQuatity(Integer quatity) {
        this.quatity = quatity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", serialNo='" + serialNo + '\'' +
                ", productName='" + productName + '\'' +
                ", quatity=" + quatity +
                '}';
    }
}
