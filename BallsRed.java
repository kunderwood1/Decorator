public class BallsRed extends HolidayDecorator {
    BallsRed(HolidayItem decoratedItem) {
        super(decoratedItem);

    }

    @Override
    public double Cost() {
        return decoratedItem.Cost() + 1.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" red balls,";
    }
}