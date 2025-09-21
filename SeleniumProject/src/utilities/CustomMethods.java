package utilities;

import org.openqa.selenium.support.ui.Select;

public class CustomMethods {
  
	public void selectValue(Select select,String vlaue) {
		select.selectByValue(vlaue);
	}
}
