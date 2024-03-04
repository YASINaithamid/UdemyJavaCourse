public class FirstClass {
    public static void main(String[] args) {
        int newValue=55;
        if (newValue==50){
            System.out.println("This is true.");
        }
        boolean isCAr=false;
        boolean bus=!isCAr;
        if (!isCAr){
            System.out.println("This is not support to happen.");
        }
        String makeOfCar="Volkswagen1";
        boolean isDomestic =makeOfCar=="Volkswagen"?false:true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s=(isDomestic)?"This car is Domestic":"This car is not domestic";

        //challenge
        // 1 :   20.00
        double myRealNum=20.00;
        double mySecondDouble=80.00;
        double result= (myRealNum+mySecondDouble)*100.00;

        double remainder=result%40.00;
        System.out.println("reaminder is :"+remainder);

        boolean isZero=remainder==0.0;

        System.out.println("the remainder truth is :"+isZero);

        if (!isZero)
            System.out.println("got some remainder");







    }
}
