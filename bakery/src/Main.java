public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        // Bolo de chocolate
        order.addCake(new ChocolateCake());

        // Bolo de baunilha com o dizer "PLAIN!"
        order.addCake(new SayingCake(new VanillaCake(), "PLAIN!"));

        // Bolo de baunilha com granulado com os dizeres "FANCY"
        order.addCake(new SayingCake(new SprinklesCake(new VanillaCake()), "FANCY"));

        // Bolo de morango em várias camadas com granulado duplo e dois dizeres
        Cake complexCake = new MultiLayeredCake(
                new SprinklesCake(
                        new SprinklesCake(
                                new SayingCake(
                                        new SayingCake(
                                                new StrawberryCake(), "One of"
                                        ), "EVERYTHING"
                                )
                        )
                )
        );
        order.addCake(complexCake);

        order.printOrder();
    }
}
