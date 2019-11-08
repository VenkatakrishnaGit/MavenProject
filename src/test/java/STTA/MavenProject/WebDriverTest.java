package STTA.MavenProject;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
 WebDriver driver;
 private static final Logger logger = LogManager.getLogger(WebDriverTest.class);

  @Test
  public void verifySearch() {
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\VenkatakrishnaY\\Downloads\\Lib Folder\\geckodriver-v0.20.0-win64\\geckodriver.exe");
   driver = new FirefoxDriver();
   logger.info("FF Browser is Launched for WebDriverTest Class");
   
   driver.get("http://only-testing-blog.blogspot.in/");
   logger.info("Only Testing site is Launched");
   
   driver.quit();
   logger.info("FF Browser is Closed for WebDriverTest Class");
  }
}
