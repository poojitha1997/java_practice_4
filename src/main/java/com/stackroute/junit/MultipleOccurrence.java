package main.java.com.stackroute.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//program to print the index of the given string found

public class MultipleOccurrence
{
    //method to print the indices using matcher
    public String matching(String inputString,String givenString){
        StringBuffer stringBuffer=new StringBuffer();
        Pattern pattern=Pattern.compile(givenString,Pattern.CASE_INSENSITIVE);
        Matcher matcher=pattern.matcher(inputString);
        while (matcher.find()){
            stringBuffer.append("Found at: ").append(matcher.start()).append(" - ").append(matcher.end()).append("\n");
        }
        return stringBuffer.toString().trim();
    }
}
