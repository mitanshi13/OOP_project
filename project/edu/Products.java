package project.edu;

public class Products{
    private int id;
    private String name;
    private double price;
    private int qty;
    private String type;

    public Products(int id, String name, double price, int qty, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.type = type;
    }

    public int getProdId() {
        return id;
    }

    public void setProdId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", type='" + type + '\'';
    }
}
