
public class Star extends HolidayDecorator {
private static Star unique;
    private Star(HolidayItem decoratedItem){
        super(decoratedItem);
    }

    static Star getStar(HolidayItem decoratedItem) {
        if (unique == null){
            unique = new Star(decoratedItem);
        }else{
            System.out.println("tree already has a star.");
        }
        return unique;
    }
static void resetUnique(){
        unique=null;
}
    @Override
    public double Cost(){
        return decoratedItem.Cost()+4.00;
    }

    @Override
    public String getDescription() {
        return decoratedItem.getDescription()+" a Star,";
    }
}
