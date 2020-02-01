public class LEDs extends HolidayDecorator {
    LEDs(HolidayItem decoratedItem) {
        super(decoratedItem);
    }
    @Override
    public double Cost() {
        return decoratedItem.Cost() +10.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" a string of LEDS,";
    }
}
