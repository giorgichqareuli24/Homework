public class CountZeros {
    public static int countZeros(int num) {
        if (num == 0) {
            return 1;
        }
        if (num < 10) {
            return 0;
        }
        return (num % 10 == 0 ? 1 : 0) + countZeros(num / 10);
    }

    public static void checkZeros(int num) {
        int zeroCount = countZeros(num);
        if (zeroCount % 2 == 0) {
            System.out.println("0-ების რაოდენობა ლუწია: " + zeroCount);
        } else {
            System.out.println("0-ების რაოდენობა კენტია: " + zeroCount);
        }
    }
}
