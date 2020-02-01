public class Lights extends HolidayDecorator {
    Lights(HolidayItem decoratedItem) {
        super(decoratedItem);
    }
    @Override
    public double Cost() {
        return decoratedItem.Cost() +5.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" a string of Lights,";
    }
}