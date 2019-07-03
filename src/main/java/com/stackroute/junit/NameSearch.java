package main.java.com.stackroute.junit;

//program to check whether the string contains the name
public class NameSearch
{
    //method to search the name using contains method
    public boolean searchName(String givenString, String search)
    {
        if(givenString.length()==0) //in the case where the string is null
        {
            return Boolean.parseBoolean(new String("given string is null"));
        }
        if(givenString.contains(search))
        {
            return true;
        }

        return false;
    }

}
