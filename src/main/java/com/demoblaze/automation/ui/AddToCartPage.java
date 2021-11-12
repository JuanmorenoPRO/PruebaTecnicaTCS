package com.demoblaze.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddToCartPage {

    public static final Target LAPTOP_OPTION = Target.the("").located(By.xpath("(//*[@id='itemc'])[2]"));
    public static final Target LAPTOP_SELECT = Target.the("").located(By.xpath("(//*[@class='hrefch'])[6]"));
    public static final Target ADD_TO_CART_BUTTON= Target.the("").located(By.xpath("//*[@class='btn btn-success btn-lg']"));
    public static final Target CART_OPTION= Target.the("").located(By.xpath("//*[@id='cartur']"));
    public static final Target TEXT_VALIDATION_PRODUCT= Target.the("").located(By.xpath("//td[contains(.,'MacBook Pro')]"));


}
