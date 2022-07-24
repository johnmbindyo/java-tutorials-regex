/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devsought;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {

    public static void main(String... args) {
        String str = "aafe2bh";
        Pattern pattern = Pattern.compile("[ad23][^bc][e-z]+");
        Matcher matcher = pattern.matcher(str);
        boolean matchFound = false;
        while (matcher.find()) {
            System.out.println("Matched::" + matcher.group());
            matchFound = true;
        }
        if (!matchFound) {
            System.out.println("NO MATCH");
        }

    }
}
