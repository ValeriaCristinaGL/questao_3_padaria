public class MultiLayeredCake extends Cake {
    private final Cake baseCake;

    public MultiLayeredCake(Cake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public int getCost() {
        return baseCake.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + baseCake.getDescription();
    }
}

