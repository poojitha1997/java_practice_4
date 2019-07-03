package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.CharOccurrence;
import main.java.com.stackroute.junit.NameSearch;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class NameSearchTest
{
    NameSearch nameSearch;
    @Before
    public void setUp() throws Exception
    {
        nameSearch = new NameSearch();
    }

    @Test
    public void testForGivenStringSearchName()
    {
        Boolean str = nameSearch.searchName("this is harry","harry");
     //   int str=occurrenceTest.countOccurrence("java is java again java again",'a');
        assertEquals(true,str);
    }
    @Test
    public void testForGivenStringNoNameFound()
    {
        Boolean str = nameSearch.searchName("this is harry","poojitha");
        //   int str=occurrenceTest.countOccurrence("java is java again java again",'a');
        assertEquals(false,str);
    }

    @Test
    public void testForGivenStringNotNull()
    {
        Boolean str = nameSearch.searchName("this is harry","poojitha");
        //   int str=occurrenceTest.countOccurrence("java is java again java again",'a');
        assertNotNull("it is null",str.toString());

    }

    @After
    public void tearDown() throws Exception
    {
        nameSearch = null;
    }




}