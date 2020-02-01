public class TreeTester {
    public static void main(String[] args) {
        HolidayItem myHolidayTree = new BlueSpruce();
        myHolidayTree = Star.getStar(myHolidayTree);
        myHolidayTree = new BallsRed(myHolidayTree);
        myHolidayTree = Star.getStar(myHolidayTree);
        myHolidayTree = new BallsSilver(myHolidayTree);
        myHolidayTree = new BallsBlue(myHolidayTree);
        myHolidayTree = new LEDs(myHolidayTree);
        System.out.println(myHolidayTree.getDescription()+" is "+myHolidayTree.Cost()+"0$.");
        Star.resetUnique();
        System.out.println("_____________________________________________________________________________________");

        HolidayItem myHolidayTree2 = new FraserFir();
        myHolidayTree2 =  Star.getStar(myHolidayTree2);
        myHolidayTree2 = new Ruffles(myHolidayTree2);
        myHolidayTree2 = new BallsSilver(myHolidayTree2);
        myHolidayTree2 = new Ruffles(myHolidayTree2);
        myHolidayTree2 = new Lights(myHolidayTree2);
        System.out.println(myHolidayTree2.getDescription()+" is "+myHolidayTree2.Cost()+"0$.");
        Star.resetUnique();
        System.out.println("_____________________________________________________________________________________");


        HolidayItem myHolidayTree3 = new DouglasFir();
        myHolidayTree3 = Star.getStar(myHolidayTree3);
        myHolidayTree3 = new Ruffles(myHolidayTree3);
        myHolidayTree3 = new Ribbons(myHolidayTree3);
        myHolidayTree3 = new BallsRed(myHolidayTree3);
        myHolidayTree3 = new BallsSilver(myHolidayTree3);
        myHolidayTree3 = new Ruffles(myHolidayTree3);
        System.out.println(myHolidayTree3.getDescription()+" is "+myHolidayTree3.Cost()+"0$.");
        Star.resetUnique();
        System.out.println("_____________________________________________________________________________________");


        HolidayItem myHolidayTree4 = new BalsamFir();
        myHolidayTree4 =  Star.getStar(myHolidayTree4);
        myHolidayTree4 = new Ruffles(myHolidayTree4);
        myHolidayTree4 = new LEDs(myHolidayTree4);
        System.out.println(myHolidayTree4.getDescription()+" is "+myHolidayTree4.Cost()+"0$.");
        Star.resetUnique();
        System.out.println("_____________________________________________________________________________________");


    }

}
