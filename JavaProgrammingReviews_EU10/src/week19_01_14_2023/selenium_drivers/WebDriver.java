package week19_01_14_2023.selenium_drivers;

public interface WebDriver extends SearchContext{
    void get(String url);
    void close();
    void quit();

}
