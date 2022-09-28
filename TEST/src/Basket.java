import java.util.Collection;

public class Basket  {
    private String name;
    private int number;
    private float price;
    private float sum;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public float getSum() {
        return sum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
