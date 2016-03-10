package buddybuild.com.helloworldandroid;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DummyTest {

    @Test
    public void thisWillPass() {
        assertThat(true, is(true));
    }

    @Test
    public void thisShallNotPass() {
        assertThat(true, is(false));
    }
}