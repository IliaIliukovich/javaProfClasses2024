package lesson20240515;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IpAddressValidationTest {

    @Test
    public void test() {
        boolean isValid = IpAddressValidation.isValidIPAddress("127.0.0.1");
        Assertions.assertTrue(isValid);

        isValid = IpAddressValidation.isValidIPAddress("127.0.0.300");
        Assertions.assertFalse(isValid);
    }


}
