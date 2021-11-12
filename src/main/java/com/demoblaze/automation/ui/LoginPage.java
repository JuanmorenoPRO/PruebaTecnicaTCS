package com.demoblaze.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static String URL = "https://www.demoblaze.com/";
    public static final Target LOGIN_OPTION = Target.the("").located(By.xpath("//*[@id='login2']"));
    public static final Target LOGIN_USERNAME = Target.the("").located(By.xpath("//*[@id='loginusername']"));
    public static final Target LOGIN_PASSWORD = Target.the("").located(By.xpath("//*[@id='loginpassword']"));
    public static final Target LOGIN_BUTTON = Target.the("").located(By.xpath("//button[@onclick='logIn()']"));
    public static final Target WELCOME_TEXT = Target.the("").located(By.xpath("//*[@id='nameofuser']"));


}
