package web.model;

import java.util.Objects;

public class Car {

    private String model;
    private String series;
    private int year;

    public Car() {
    }

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(series, car.series);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, year);
    }
}