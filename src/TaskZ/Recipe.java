package TaskZ;

public class Recipe {
    private String productName;
    private  double sand;
    private  double gravel;
    private double bitum;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getSand() {
        return sand;
    }

    public void setSand(Double sand) {
        this.sand = sand;
    }

    public Double getGravel() {
        return gravel;
    }

    public void setGravel(Double gravel) {
        this.gravel = gravel;
    }

    public Double getBitum() {
        return bitum;
    }

    public void setBitum(Double bitum) {
        this.bitum = bitum;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "productName='" + productName + '\'' +
                ", sand=" + sand +
                ", gravel=" + gravel +
                ", bitum=" + bitum +
                '}';
    }
}
