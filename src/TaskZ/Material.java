package TaskZ;

public class Material {
    private MaterialName materialName;
    private ProviderName providerName;
    private double amount;
    private double costPerOne;

    public Material() {
    }

    public MaterialName getMaterialName() {
        return materialName;
    }

    public void setMaterialName(MaterialName materialName) {
        this.materialName = materialName;
    }

    public ProviderName getProviderName() {
        return providerName;
    }

    public void setProviderName(ProviderName providerName) {
        this.providerName = providerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCostPerOne() {
        return costPerOne;
    }

    public void setCostPerOne(double costPer1) {
        this.costPerOne = costPerOne;
    }

    public double getTotalCost() {
        return amount*costPerOne;
    }


}
