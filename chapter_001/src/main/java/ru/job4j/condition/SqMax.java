package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
/*//           int result1 = (first > second) && (first > third) && (first > forth) && (second > third) && (second > forth)? first : second;
//        int result2 = (result1 > third) ? result1 : third;
//        int result3 = (result2 > forth) ? result2 : forth;
//        return result3;

            int result = forth;
        if ((first >= second) && (first >= third) && (first >= forth))
        {result = first;}

        if ((second >= first) && (second >= third) && (second >= forth))
        {result = second;}

        if ((third >= first)  && (third >= second) && (third >= forth))
        {result = third;}

        if ((forth >= first) && (forth >= second) && (forth >= third))
        {result = forth;}

       return result;


*/
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = first;
                    return result;
                }
            }
        }  if (second > third) {
            if (second > forth) {
                result = second;
                return result;
            }
        }  if (third > forth) {
            result = third;
            return result;
        }
        return result;
    }
}

