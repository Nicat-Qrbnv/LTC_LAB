package a1.lesson14.normal.task4;

public class Main {
    public static void main(String[] args) {

        String str1 = "almA";
        String str2 = "arMud";
        String str3 = "əRik";
        String str4 = "Şaftalı";

        StringUtil.concatStr(str1, str2);
        StringUtil.concatStr(str2, str3, str4);

        StringUtil.caseStrLetters(str1, true);
        StringUtil.caseStrLetters(str2, false);

        StringUtil.caseStrLetters(str3, true, true);
        StringUtil.caseStrLetters(str4, false, false);
        StringUtil.caseStrLetters(str1, false, true);
        StringUtil.caseStrLetters(str2, true, false);

    }
}
