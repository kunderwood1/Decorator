public class BallsSilver extends HolidayDecorator {
    BallsSilver(HolidayItem decoratedItem) {
        super(decoratedItem);
    }

    @Override
    public double Cost() {
        return decoratedItem.Cost() + 3.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" Silver balls,";
    }
}