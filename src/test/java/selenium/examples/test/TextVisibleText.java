package selenium.examples.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nishi on 2015-08-03.
 */
public class TextVisibleText {
    
    private WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://localhost:9999/SeleniumCookbook/index.html");
    }

    @Test
    public void testVisibleText(){
        String value;
        value = driver.findElement(By.tagName("h1")).getText();
        if(value.equals("MACIEK2"))
            System.out.println(value);
        else
            System.out.println("Correct value: " + value);
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
