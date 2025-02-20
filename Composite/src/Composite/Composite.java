package Composite;

import java.util.ArrayList;

public class Composite extends CarComponent {
    private ArrayList<CarComponent> parts;

    public Composite(String name) {
        super(name);
        parts = new ArrayList<CarComponent>();
    }

    @Override
    public void showDetails() {
        System.out.println(this.name+ " é composto por:");
        for (CarComponent part : parts) {
            part.showDetails();
        }
    }

    @Override
    public void addComponent(CarComponent part) {
        parts.add(part);
    }

    @Override
    public void removeComponent(CarComponent part) {
        parts.remove(part);
    }

    @Override
    public double showPrice() {
        double total = 0;
        for (CarComponent part : parts) {
          total += part.showPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return name + ", R$" + showPrice();
    }
}
