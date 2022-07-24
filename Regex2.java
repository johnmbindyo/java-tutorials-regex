/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsought;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String... args) {
        String str = "John's end of term scores were as  follows;Math 72%, English 65%,Science 85% and Commerce 45% .Overall class position number 12";
        Pattern pattern = Pattern.compile("(\\b\\d{1,3}\\b)(%)");//(\\b\\d{1,2}\\b)(.+?)    (\\b\\d{1,3}\\b)(%)  \\b(\\d{1,3}%?)\\b    \\b(\\d{1,3})(%)?\\b    (\\d{1,3})(%+)
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        int count = 0;
        while (matcher.find()) {
            String subsequence = matcher.group();
            //System.out.println(subsequence);
            System.out.println("G1::" + matcher.group(1));
            System.out.println("G2::" + matcher.group(2));
            System.out.println("GroupCount::" + matcher.groupCount());
            sum += Double.valueOf(matcher.group(1));
            count++;
        }
        System.out.println("Total score=" + sum + " ,avg=" + (sum / count));
    }
}
