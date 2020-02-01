public class Ribbons extends HolidayDecorator {
    Ribbons(HolidayItem decoratedItem) {
        super(decoratedItem);
    }
    @Override
    public double Cost() {
        return decoratedItem.Cost() +2.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" Ribons,";
    }

}
