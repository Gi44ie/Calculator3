import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanNum { I, II, III, IV, V, VI, VII, VIII, IX, X;

    public static List<RomanNum> getValues() {
        return Arrays.stream(values()).collect(Collectors.toList());
    }

    public static String getRomResult(int result) {
        String romResult = "";
        while (result == 100) {
            romResult += "C";
            result -= 100;
        }
        while (result >= 90) {
            romResult += "XC";
            result -= 90;
        }
        while (result >= 50) {
            romResult += "L";
            result -= 50;
        }
        while (result >= 40) {
            romResult += "XL";
            result -= 40;
        }
        while (result >= 10) {
            romResult += "X";
            result -= 10;
        }
        while (result >= 9) {
            romResult += "IX";
            result -= 9;
        }
        while (result >= 5) {
            romResult += "V";
            result -= 5;
        }
        while (result >= 4) {
            romResult += "IV";
            result -= 4;
        }
        while (result >= 1) {
            romResult += "I";
            result -= 1;
        }
        return romResult;
    }
}
