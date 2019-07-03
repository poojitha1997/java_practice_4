package main.java.com.stackroute.junit;

import java.util.Arrays;

//program to sort the paragraph and print in the alphabetic order
public class SortParagraph
{

    //using arrays to sort the split string
    public String sortThePara(String str)
    {

        if(str==null) //checking if the string is null
        {
            return null;
        }

        String[] str2 = str.split(" ");

        Arrays.sort(str2);
        return Arrays.toString(str2);
    }
}
