import RomanConverter.RomanConverter;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class RomanConverterTest {

    @Test public void itShouldConvertIto1(){
        assertThat(RomanConverter.Convert('I')).isEqualTo(1);
    }
}
