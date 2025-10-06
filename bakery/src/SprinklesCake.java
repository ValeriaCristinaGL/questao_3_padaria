public class SprinklesCake extends Cake {
    private final Cake baseCake;

    public SprinklesCake(Cake baseCake) {
        this.baseCake = baseCake;
    }

    @Override
    public int getCost() {
        return baseCake.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return baseCake.getDescription() + " with sprinkles";
    }
}
