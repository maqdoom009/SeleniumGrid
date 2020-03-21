package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//Define desire capabilities
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//chrome option definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String url = "http://192.168.0.108:4444/wd/hub";
		
		WebDriver driver = new RemoteWebDriver(new URL(url),options);
		
		driver.get("https://www.seleniumhq.org");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
