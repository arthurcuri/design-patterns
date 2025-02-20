package Composite;

public class Leave extends CarComponent {
    private Double price;

    public Leave(String name, Double price) {
            super(name);
            this.price = price;
        }
    
    @Override
    public void showDetails() {
        System.out.println(this.name + " do carro.");
    }

    @Override
    public void addComponent(CarComponent part) {
        throw new UnsupportedOperationException("Unimplemented method 'addComponent'");
    }

    @Override
    public void removeComponent(CarComponent part) {
        throw new UnsupportedOperationException("Unimplemented method 'removeComponent'");
    }

    @Override
    public double showPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " - R$" + this.price;
    }
    
}
