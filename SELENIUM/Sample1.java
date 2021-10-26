import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "G:\\UST\\WebDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://www.google.com/");
		d.findElement(By.name("csi").tagName("csi"));
		String s= d.getTitle();
		System.out.println(s);
		s.equals("Google");
		}
}
