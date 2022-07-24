/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsought;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex1 {

       public static void main(String... args) {
        String str = "John's end of term scores were as follows;Math 72%,English 65%,Science 85% and Commerce 45%. His performance was above average.";
        Pattern pattern = Pattern.compile("\\d{1,3}");
        Matcher matcher = pattern.matcher(str);
        int sum = 0;
        int count = 0;
        while (matcher.find()) {
            
            String subsequence = matcher.group();
            sum += Double.valueOf(subsequence);
            count++;
            System.out.println(subsequence);
        }
        System.out.println("Total score=" + sum + " ,avg=" + (sum / count));
    }

}
