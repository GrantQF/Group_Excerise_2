package Task4;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
    void navigate();
}
interface TakesScreenshot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{

}
class FirefoxDriver implements RemoteWebDriver{

}
class SafariDriver implements RemoteWebDriver{

}
class Main{
    public static void main(String[] args) {
        ChromeDriver hw=new ChromeDriver();
        hw.close();
        hw.getTitle();
        hw.navigate();
        hw.open();
        FirefoxDriver hw1=new FirefoxDriver();
        hw1.close();
        hw1.getTitle();
        hw1.navigate();
        hw1.open();
        SafariDriver hw2=new SafariDriver();
        hw2.close();
        hw2.getTitle();
        hw2.navigate();
        hw2.open();

    }
}

