package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;
import utils.ExcelUtils;

import java.time.Duration;

public class RegExcel {

    WebDriver driver;
    WebDriverWait wait;

    String excelPath = "C:\\Users\\deept\\OneDrive\\Desktop\\velocity.xlsx";

    // Test data fields to share data between tests
    String firstName, lastName, emailInput, passwordInput, confirmPassword;

    @BeforeClass
    public void setUpClass() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demo.bagisto.com/bagisto-common/");
    }

    @DataProvider(name = "signupData")
    public Object[][] getSignupData() {
        return ExcelUtils.getSheetData(excelPath, "Sheet1");
    }

    // 1. Click Users Icon
    @Test(dataProvider = "signupData", priority = 1)
    public void clickUsersIcon(String fn, String ln, String email, String pw, String cpw) {
        this.firstName = fn;
        this.lastName = ln;
        this.emailInput = email;
        this.passwordInput = pw;
        this.confirmPassword = cpw;

        clickElement(By.cssSelector("span.icon-users"));
    }

    // 2. Click Sign Up link
    @Test(priority = 2, dependsOnMethods = "clickUsersIcon")
    public void clickSignUpLink() {
        clickElement(By.xpath("//a[contains(text(),'Sign Up')]"));
    }

    // 3. Enter First Name
    @Test(priority = 3, dependsOnMethods = "clickSignUpLink")
    public void enterFirstName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
        driver.findElement(By.name("first_name")).sendKeys(firstName);
    }

    // 4. Enter Last Name
    @Test(priority = 4, dependsOnMethods = "enterFirstName")
    public void enterLastName() {
        driver.findElement(By.name("last_name")).sendKeys(lastName);
    }

    // 5. Enter Email
    @Test(priority = 5, dependsOnMethods = "enterLastName")
    public void enterEmail() {
        driver.findElement(By.name("email")).sendKeys(emailInput);
    }

    // 6. Enter Password
    @Test(priority = 6, dependsOnMethods = "enterEmail")
    public void enterPassword() {
        driver.findElement(By.name("password")).sendKeys(passwordInput);
    }

    // 7. Enter Confirm Password
    @Test(priority = 7, dependsOnMethods = "enterPassword")
    public void enterConfirmPassword() {
        driver.findElement(By.name("password_confirmation")).sendKeys(confirmPassword);
    }

    // 8. Click Agreement checkbox
    @Test(priority = 8, dependsOnMethods = "enterConfirmPassword")
    public void clickAgreement() {
        jsClick(driver.findElement(By.id("agreement")));
    }

    // 9. Click Submit button
    @Test(priority = 9, dependsOnMethods = "clickAgreement")
    public void clickSubmit() {
        clickElement(By.cssSelector("button[type='submit'].primary-button"));
        System.out.println("✅ User registered: " + emailInput);
        sleep(3000);
    }

    // Helper methods

    private void clickElement(By by) {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(by));
        el.click();
        sleep(1000);
    }

    private void jsClick(WebElement el) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", el);
        sleep(500);
    }

    private void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ignored) {
        }
    }

    @AfterClass
    public void tearDownClass() {
        if (driver != null) driver.quit();
    }
}
