public class PersonCorrected {
    public static boolean isTeenager(int age) {
        boolean result = false;
        if (age > 0 && age < 123) {
            if (age <= 19 && age >= 13) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
}
