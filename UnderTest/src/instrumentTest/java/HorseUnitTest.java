import android.test.AndroidTestCase;

import com.gmccreight.undertest.models.Horse;

public class HorseUnitTest extends AndroidTestCase {

    public void testOmgThatHorseCanTalk() {
        assertEquals("Wilbur", new Horse().getSaying());
    }

}
