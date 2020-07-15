package web.model;

public class Car {
    private String model;
    private String owner;
    private int series;

    public Car() {
    }

    public Car(String model, String owner, int series) {
        this.model = model;
        this.owner = owner;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
