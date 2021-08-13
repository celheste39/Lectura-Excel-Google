package pageObjects;

import org.openqa.selenium.By;

public class GooglePO {
    private static By txtBarra = By.xpath("//input[@class='gLFyf gsfi']");

    public static By getTxtBarra() {
        return txtBarra;
    }

}
