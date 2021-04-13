package DAO;

public class Material {
    private Integer ID;//первичный ключ
    private double amount;
    private double costPerOne;

    public Material() {
    }

    public Material(int ID, double amount, double costPerOne) {
        this.ID = ID;

        this.amount = amount;
        this.costPerOne = costPerOne;
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

    public void setCostPerOne(double costPerOne) {
        this.costPerOne = costPerOne;
    }

    public double getTotalCost() {
        return amount*costPerOne;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return amount +
                " priced at " + costPerOne +
                ". Tonal cost is " + getTotalCost();

    }
}
