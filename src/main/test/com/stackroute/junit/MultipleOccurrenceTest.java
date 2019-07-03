package main.test.com.stackroute.junit;

import main.java.com.stackroute.junit.MultipleOccurrence;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {

    MultipleOccurrence multipleOccurrence;

    @Before
    public void setUp() throws Exception {
        multipleOccurrence = new MultipleOccurrence();
    }

    @After
    public void tearDown() throws Exception {
        multipleOccurrence = null;
    }

    @Test
    public void returnTheIndex() {
        String actual = multipleOccurrence.matching("She sells seashells by the seashore", "se");
        assertEquals("Found at: 4 - 6\n" +
                "Found at: 10 - 12\n" +
                "Found at: 27 - 29", actual);
    }

    @Test
    public void returnNotNull() {
        String actual = multipleOccurrence.matching("She sells seashells by the seashore", "se");
        assertNotNull(actual);
    }

}

