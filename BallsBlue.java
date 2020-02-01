public class BallsBlue extends HolidayDecorator {
    BallsBlue(HolidayItem decoratedItem) {
        super(decoratedItem);

    }

    @Override
    public double Cost() {
        return decoratedItem.Cost() + 2.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" Blue balls,";
    }
}
