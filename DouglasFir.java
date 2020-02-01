public class DouglasFir implements HolidayItem {
    DouglasFir(){
        super();

    }
    @Override
    public double Cost() {
        return 30.00;
    }

    @Override
    public String getDescription() {
        return "Douglas Fir Tree, with";
    }
}
