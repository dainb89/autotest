package jenkin.demo.kloon.vn.demojenkin;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@Config(emulateSdk = 18, reportSdk = 18)
@RunWith(RobolectricTestRunner.class)
/**
 * Created by dainb on 9/5/16.
 */
public class UserTest {

    @Test
    public void UserNameTest() {
        User u = new User();

        u.setName("foo");

        Assert.assertEquals("foo", u.getName());

    }


}
