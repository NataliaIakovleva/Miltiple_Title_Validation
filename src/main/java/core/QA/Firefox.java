package core.QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		
		if (args.length == 0) {
			System.err.println("No arguments!");
			System.exit(1);
		}
				
		for (int i = 0; i < args.length; i++) {
 
			String text_case_id = "TC-01.01" + (i + 1);
			String param[] = args[i].split("\\|");
 
			String url = param[0];
			String title_expected = param[1];
			
			driver.get(url);
			String title_actual = driver.getTitle();
				System.out.println("");
			if (title_expected.equals(title_actual)) {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "PASSED");
			} else {
				System.out.println("Test Case ID: \t\t" + text_case_id);
				System.out.println("URL: \t\t\t" + url);
				System.out.println("Title Expected: \t" + title_expected);
				System.out.println("Title Actual: \t\t" + title_actual);
				System.out.println("Test Case Result: \t" + "FAILED");
			}
			
		}
	
		driver.quit();
	}

}
