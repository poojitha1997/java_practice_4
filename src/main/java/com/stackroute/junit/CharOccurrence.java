package main.java.com.stackroute.junit;

//program to count the occurrence of given character
public class CharOccurrence
{
    //method to return the count of occurrence of the given character using replaceAll method
    public int countOccurrence(String givenString,char character)
    {

        givenString = givenString.toLowerCase(); //converting the string into lowercase
        int lengthOfGivenString = givenString.length();
        String finalString = givenString.replaceAll(String.valueOf(character),"");
        int  lengthOfFinalString = finalString.length();
        int count = lengthOfGivenString - lengthOfFinalString;
        if(count==0)
            return 0;
        else
        return count;
    }
}
