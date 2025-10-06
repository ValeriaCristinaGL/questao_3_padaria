public class SayingCake extends Cake{
    private final Cake baseCake;
    private final String message;

    public SayingCake(Cake baseCake, String message) {
        this.baseCake = baseCake;
        this.message = message;
    }

    @Override
    public int getCost() {
        return baseCake.getCost(); // no extra cost
    }

    @Override
    public String getDescription() {
        return baseCake.getDescription() + " with saying \"" + message + "\"";
    }
}
