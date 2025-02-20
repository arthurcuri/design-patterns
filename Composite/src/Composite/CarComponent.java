package Composite;

public abstract class CarComponent {
    protected String name;

    public CarComponent(String name){
        this.name = name;
    }

    public abstract void showDetails();
    public abstract void addComponent(CarComponent part);
    public abstract void removeComponent(CarComponent part);
    public abstract double showPrice();
}
