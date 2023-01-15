package week19_01_14_2023.selenium_drivers;

public class ChromeDriver extends RemoteWebdriver{
    @Override
    public String getScreenShotAs() {
        return "JPEG";
    }

}
