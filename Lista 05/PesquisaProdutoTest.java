package simples;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PesquisaProdutoTest05 {

  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\maris\\drivers\\chrome\\89\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

  }

  @After
  public void tearDown() {

    driver.quit();
  }

  @Test
  public void pesquisaProduto() {
    driver.get("https://www.google.com.br/");
    driver.findElement(By.name("q")).click();
    driver.findElement(By.name("q")).sendKeys("Ovo de Páscoa");
    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("input.gLFyf.gsfi")).click();
    //assertThat(driver.findElement(By.id("content-top")).getText(), is("ovo de páscoa"));
  }
}
