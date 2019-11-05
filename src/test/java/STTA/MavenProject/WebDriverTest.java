package STTA.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebDriverTest {
 WebDriver driver;

  @Test
  public void verifySearch() {
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\VenkatakrishnaY\\Downloads\\Lib Folder\\geckodriver-v0.20.0-win64\\geckodriver.exe");
   driver = new FirefoxDriver();
   driver.get("http://only-testing-blog.blogspot.in/");
   driver.quit();
  }
}
