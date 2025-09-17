
class RevNum {

    static int revNumber(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.print(n%10);
        return  revNumber(n / 10);
    }

    public static void main(String[] args) {

        System.out.println(revNumber(123456));
    }
}
