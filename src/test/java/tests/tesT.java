package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {""},
        glue = "steps",
        plugin = "pretty"
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class tesT {
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {

    }
}
