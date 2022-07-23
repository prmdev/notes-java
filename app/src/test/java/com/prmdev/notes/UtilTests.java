package com.prmdev.notes;

import com.prmdev.notes.util.Utility;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilTests {

    @Test
    public void canNoteBeSaved(){
        boolean result = Utility.canNoteBeSaved("Title", "Content");
        assertEquals(true, result);
    }

}
