public class LastDigitChecker {
    // write code here

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit (42, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit(1067, 322, 10));
        System.out.println(isValid(55));
    }

    public static boolean hasSameLastDigit(int first, int second, int third) {

        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstRightDigit = first % 10;
        int secondRightDigit = second % 10;
        int thirdRightDigit = third % 10;

        return (firstRightDigit == secondRightDigit || firstRightDigit == thirdRightDigit || secondRightDigit == thirdRightDigit);
    }

    public static boolean isValid (int number) {
        return !(number < 10 || number > 100);
    }
}
