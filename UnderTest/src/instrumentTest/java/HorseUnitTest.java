import android.test.AndroidTestCase;

import com.gmccreight.undertest.Horse;

//TODO is instrumentTest the right place to also be putting our unit tests?
//It doesn't *feel* right, and I feel like I remember seeing someplace
//that "tests" or "test" was the right folder, but neither of those appears
//to work correctly.

public class HorseUnitTest extends AndroidTestCase {

    public void testOmgThatHorseCanTalk() {
        Horse horse = new Horse();
        assertEquals("Wilbur", horse.getSaying());
    }

}
