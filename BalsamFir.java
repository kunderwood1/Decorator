public class BalsamFir implements HolidayItem {
    BalsamFir(){
        super();

    }
    @Override
    public double Cost() {
        return 25.00;
    }

    @Override
    public String getDescription() {
        return "Balsam Fir Tree, with";
    }
}
