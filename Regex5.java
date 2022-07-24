/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsought;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {

    public static void main(String... args) {
        String str = "The chef is in the kitchen preparing a meal.aacblkja";
        Pattern pattern = Pattern.compile("^th", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println("Matched::" + matcher.group());
        } else {
            System.out.println("NO MATCH");
        }

    }
}
