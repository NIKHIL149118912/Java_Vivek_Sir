
class RevString {

    static void revStr(String s) {
        if (s.length() == 0) {
            return;
        }
        int i = s.length() - 1;
        System.out.print(s.charAt(i));
        revStr(s.substring(0,i));
    }

    public static void main(String[] args) {
        revStr("Hello");
    }
}
