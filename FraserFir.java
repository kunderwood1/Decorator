public class FraserFir implements HolidayItem {
    FraserFir(){
        super();

    }
    @Override
    public double Cost() {
        return 35.00;
    }

    @Override
    public String getDescription() {
        return "Fraser Fir Tree, with";
    }
}
