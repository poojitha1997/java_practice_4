package main.java.com.stackroute.junit;

//program to replace the 'd' with the 'f' and 'l' and 't'
public class ReplaceCharacter
{

    //method to replace the character  using replaceAll method
    public String replaceTheAlphabet(String givenString)
    {
        givenString = givenString.toLowerCase(); //converting the string into lowercase
        String finalString;

        finalString= givenString.replaceAll("d", "f");
        finalString = finalString.replaceAll("l","t");


        return finalString;
    }
}
