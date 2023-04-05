package adapterpattern.util;

public class UserUtil {
    public static int poundsToKg(int pounds) {
        return (int) (pounds * 0.45359237f);
    }

    public static int feetToCm(int feet) {
        return (int) (feet * 30.48f);
    }
}
