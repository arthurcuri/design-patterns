package Composite;

public class Main {
    public static void main(String[] args) throws Exception {
        Composite car = new Composite("Carro");

        Composite engine = new Composite("Motor");
        engine.addComponent(new Leave("Bloco do Motor", 3500.00));
        engine.addComponent(new Leave("Biela", 800.00));
        engine.addComponent(new Leave("Cabeçote", 1200.00));
        engine.addComponent(new Leave("Filtro de Óleo", 90.00));

        Composite wheels = new Composite("Rodas");
        for (int i = 0; i < 4; i++) {
            Composite wheel = new Composite("Roda " + (i + 1));
            wheel.addComponent(new Leave("Pneu", 300.00));
            wheel.addComponent(new Leave("Aro de Liga Leve", 500.00));
            wheel.addComponent(new Leave("Câmara de Ar", 80.00));
            wheels.addComponent(wheel);
        }

        Composite interior = new Composite("Interior");
        interior.addComponent(new Leave("Banco de Couro", 2000.00));
        interior.addComponent(new Leave("Painel Digital", 4500.00));
        interior.addComponent(new Leave("Volante Esportivo", 1200.00));

        Composite electronics = new Composite("Eletrônicos");
        electronics.addComponent(new Leave("Central Multimídia", 3500.00));
        electronics.addComponent(new Leave("Sistema de Som", 2200.00));
        electronics.addComponent(new Leave("Sensor de Estacionamento", 800.00));
        electronics.addComponent(new Leave("Faróis de LED", 1500.00));

        car.addComponent(engine);
        car.addComponent(wheels);
        car.addComponent(interior);
        car.addComponent(electronics);
        car.addComponent(new Leave("Carroceria Reforçada", 8000.00));

        System.out.println(car);
        System.out.println("Valor total das peças: R$" + car.showPrice());
    }
}
