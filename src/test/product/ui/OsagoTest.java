package test.product.ui;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import product.services.data.BeforeTests;

import static product.sravni.osago.Calculate.*;

public class OsagoTest extends BeforeTests {
    private OsagoTest() {}

    @Test
    public static void startTest() {

        startCalculate();
    }
}
