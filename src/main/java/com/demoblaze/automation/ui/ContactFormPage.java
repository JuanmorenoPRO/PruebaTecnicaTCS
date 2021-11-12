package com.demoblaze.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactFormPage {

    public static final Target CONTACT_OPTION = Target.the("").located(By.xpath("//*[@data-target='#exampleModal']"));
    public static final Target CONTACT_EMAIL_FIELD = Target.the("").located(By.xpath("//*[@id='recipient-email']"));
    public static final Target CONTACT_NAME_FIELD = Target.the("").located(By.xpath("//*[@id='recipient-name']"));
    public static final Target MESSAGE_FIELD = Target.the("").located(By.xpath("//*[@id='message-text']"));
    public static final Target SEND_BUTTON = Target.the("").located(By.xpath("//button[@onclick='send()']"));
}
