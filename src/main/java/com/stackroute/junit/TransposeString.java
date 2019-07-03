package main.java.com.stackroute.junit;

//program to reverse the string
public class TransposeString
{
    //using stringbuilder and reverse method to reverse the string
public StringBuilder transpose(StringBuilder givenString)
{
    if(givenString.length() == 0) { //checking if the string is null


        return new StringBuilder("it is null");
    }
    StringBuilder finalString = givenString.reverse();
    return finalString;

}
}
