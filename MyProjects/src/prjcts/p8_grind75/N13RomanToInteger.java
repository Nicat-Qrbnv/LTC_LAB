package prjcts.p8_grind75;

public class N13RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XLIX"));
    }

    public static int romanToInt(String s) {
        int n=0;
        int l = 0;
        int d = 0;
        for (int i=s.length()-1; i>-1; i--) {//LXIX
            char c = s.charAt(i);
            switch(c) {
                case 'I' -> d=1;
                case 'V' -> d=5;
                case 'X' -> d=10;
                case 'L' -> d=50;
                case 'C' -> d=100;
                case 'D' -> d=500;
                case 'M' -> d=1000;
            }
            if (d>=l) {
                n += d;
            } else {
                n -= d;
            }
            l = d;
        }
        return n;
    }
}
