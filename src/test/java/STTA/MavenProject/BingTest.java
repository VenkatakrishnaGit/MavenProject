package STTA.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BingTest {
 WebDriver driver;

 @BeforeTest
 public void StartBrowser_NavURL() {
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\VenkatakrishnaY\\Downloads\\Lib Folder\\geckodriver-v0.20.0-win64\\geckodriver.exe");
  driver = new FirefoxDriver();
  driver.manage().window().maximize();
 }

 @AfterTest
 public void CloseBrowser() {
  driver.quit();
 }

 @Test
 public void testToCompareDoubles() {
  driver.get("http://www.bing.com");
 }
}
