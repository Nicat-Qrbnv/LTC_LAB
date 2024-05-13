package p7_leetCode.n1_100.n13_RomanToInteger;

class Solution {
    public static void main(String[] args) {
        System.out.println(romanToInt("XLIX"));
    }

    public static int romanToInt(String s) {
        int result=0;
        int last = 0;
        int digit = 0;
        for (int i=s.length()-1; i>-1; i--) {//LXIX
            char c = s.charAt(i);
            switch(c) {
                case 'I' -> digit=1;
                case 'V' -> digit=5;
                case 'X' -> digit=10;
                case 'L' -> digit=50;
                case 'C' -> digit=100;
                case 'D' -> digit=500;
                case 'M' -> digit=1000;
            }
            if (digit>=last) {
                result += digit;
            } else {
                result -= digit;
            }
            last = digit;
        }
        return result;
    }
}
