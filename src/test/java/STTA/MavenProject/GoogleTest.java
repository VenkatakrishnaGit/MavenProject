package STTA.MavenProject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
 private static final Logger logger = LogManager.getLogger(GoogleTest.class);
 WebDriver driver;

 @BeforeTest
 public void StartBrowser_NavURL() {
  System.setProperty("webdriver.gecko.driver", "C:\\Users\\VenkatakrishnaY\\Downloads\\Lib Folder\\geckodriver-v0.20.0-win64\\geckodriver.exe");
  driver = new FirefoxDriver();
  logger.info("FF Browser is Launched for Google Test Class");
  driver.manage().window().maximize();
  logger.info("Browser is maximized");
 }

 @AfterTest
 public void CloseBrowser() {
  driver.quit();
  logger.info("Browser is Closed for Google Test Class");
 }

 @Test
 public void testToCompareDoubles() {
  driver.get("http://www.google.com");
  logger.info("Google site is Opend");
 }
}
