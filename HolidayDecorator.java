abstract class HolidayDecorator implements HolidayItem {
    HolidayItem decoratedItem;
    static Star unique;
    HolidayDecorator(HolidayItem decoratedItem) {
        this.decoratedItem = decoratedItem;
    }


}
