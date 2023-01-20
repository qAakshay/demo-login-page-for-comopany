package starter;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/",
       glue = "starter.stepdefinations",
        dryRun = false,
        monochrome = true,
        tags = "@smoke"
)
public class CucumberTestSuite {}
