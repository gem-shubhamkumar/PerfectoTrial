package perfecto;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class PerfectoAndroid {
    public static void main(String[] args) throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities("mobileOS", "", Platform.ANY);

        String host = "trial.perfectomobile.com";

        String token =
                "eyJhbGciOiJIUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICI2ZDM2NmJiNS01NDAyLTQ4MmMtYTVhOC1kODZhODk4MDYyZjIifQ.eyJpYXQiOjE2NjQzNjg2MzQsImp0aSI6IjRlMDQzMGMzLTZmMTUtNGE5Ni1iNTgyLTJkNDA3NGQxNGY5OCIsImlzcyI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsImF1ZCI6Imh0dHBzOi8vYXV0aDMucGVyZmVjdG9tb2JpbGUuY29tL2F1dGgvcmVhbG1zL3RyaWFsLXBlcmZlY3RvbW9iaWxlLWNvbSIsInN1YiI6IjlhZDE0ZWY3LWNiODQtNDI4YS1hOTg0LWYyNGQ5NDQ0MDJlMyIsInR5cCI6Ik9mZmxpbmUiLCJhenAiOiJvZmZsaW5lLXRva2VuLWdlbmVyYXRvciIsIm5vbmNlIjoiMDAxOTVjMDYtZmMwZC00NWYxLWJkNzctZjE0ZmM0MzJkNTc2Iiwic2Vzc2lvbl9zdGF0ZSI6IjI3MTAxYzlmLTU2MjMtNGRmNS1iN2Q4LTQ0ZTAxZDI5MzFhMSIsInNjb3BlIjoib3BlbmlkIG9mZmxpbmVfYWNjZXNzIHByb2ZpbGUgZW1haWwifQ.VsOHbJkDA5AC2BpfXCETEJ6B0Pdnmtmc4KJhaFlEb34";

        URL url = new URL("https://" + host + "/nexperience/perfectomobile/wd/hub");

        System.getProperties().put("securityToken", token);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("securityToken", token);
        capabilities.setCapability("deviceName", "2492860422017ECE");
//        capabilities.setCapability("appium:app", "PUBLIC:ExpenseAppVer1.0.apk");

        capabilities.setCapability("BROWSER_NAME", "Android");
//        capabilities.setCapability("VERSION", "8.0");
//        capabilities.setCapability("deviceName","Emulator");
//        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.android.settings");
        capabilities.setCapability("appActivity", "com.android.settings.Settings");

        System.out.println(capabilities.toString());
        AppiumDriver driver = new AndroidDriver(url, capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        System.out.println("DRIVER - " + driver);
        driver.quit();
    }
}
