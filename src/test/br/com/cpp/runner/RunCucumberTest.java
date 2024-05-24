package br.com.concorrencia.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:surefire-reports/test-report.html", "json:surefire-reports/test-report.json", "xml:surefire-reports/test-report.xml"},
//        tags = "@teste",
        glue = {"br.com.concorrencia.steps"}
)
public class RunCucumberTest {
    public static WebDriver driver;
    public static Properties properties = new Properties();

    @BeforeClass
    public static void setup() throws IOException {
        InputStream variables = new FileInputStream("src/test/resources/application.properties");
        properties.load(variables);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

}
