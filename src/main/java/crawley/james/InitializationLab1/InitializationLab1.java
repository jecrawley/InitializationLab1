package crawley.james.InitializationLab1;

/**
 * Created by jamescrawley on 9/10/16.
 */
public class InitializationLab1 {

    public static void main (String[] args) {


        BoringThing boringThing0 = new BoringThing();
        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();

        ColorfulThing colorfulThing0 = new ColorfulThing(Color.RED);
        ColorfulThing colorfulThing1 = new ColorfulThing(Color.GREEN);
        ColorfulThing colorfulThing2 = new ColorfulThing(Color.BLUE);
        ColorfulThing colorfulThing3 = new ColorfulThing(Color.YELLOW);
        ColorfulThing colorfulThing4 = new ColorfulThing(Color.CYAN);

        System.out.println(colorfulThing0.getColor().name());
        System.out.println(colorfulThing1.getColor().name());
        System.out.println(colorfulThing2.getColor().name());
        System.out.println(colorfulThing3.getColor().name());
        System.out.println(colorfulThing4.getColor().name());


    }
}
