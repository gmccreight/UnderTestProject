package com.gmccreight.undertest.models;

import android.test.AndroidTestCase;

public class HorseTest extends AndroidTestCase {

    public void testOmgThatHorseCanTalk() {
        assertEquals("Wilbur", new Horse().getSaying());
    }

}
