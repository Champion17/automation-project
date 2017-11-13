import org.openqa.selenium.By;

public class Register extends Obj
{
public void search()
{
    driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("baby books");
}
public void searchlink()
{
    driver.findElement(By.xpath(".//*[@id='nav-link-accountList']/span[1]")).click();
}
public void Entermailid()
{
    driver.findElement(By.xpath(".//*[@id='ap_email']")).sendKeys("shameem3181@gmail.com");
}
public void Enterpassword()
{
    driver.findElement(By.xpath(".//*[@id='ap_password']")).sendKeys("shami3181");
}
public void submit()
{
    driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
}
public void searchitem()
{
    driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("baby monitor");
}
public void searchbutton()
{
    driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
}

    public void signIn(String link) {
    driver.findElement(By.linkText(link)).click();

    }

    public boolean isTextPresent() {

    return driver.getPageSource().contains("baby monitor");
    }
}
