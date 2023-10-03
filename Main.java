import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("https://twitter.com/i/flow/login");
        Thread.sleep(2000);

        WebElement clicar = driver.findElement(By.name("text"));
        clicar.click();
        clicar.sendKeys("Insira_O_Seu_Usuario_Aqui");
        clicar = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]"));
        clicar.click();
        Thread.sleep(1000);

        clicar = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label/div/div[2]/div[1]/input"));
        clicar.click();
        clicar.sendKeys("Insira_A_Sua_Senha");
        clicar = driver.findElement(By.xpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div/div/div"));
        clicar.click();
        Thread.sleep(4000);

        clicar = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[2]/div/div[2]/div/div/div/div[4]/div/section/div/div/div[8]/div/a/div/span"));
        clicar.click();
        Thread.sleep(2000);

        clicar = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[1]/div[1]/div[2]/nav/div/div[2]/div/div[2]/a/div/div/span"));
        clicar.click();
        Thread.sleep(1000);

        clicar = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/main/div/div/div/div/div/div[3]/div/section/div/div/div[3]/div/div/div/div/div[2]"));
        String texto = clicar.getText();
        Thread.sleep(1000);

        clicar = driver.findElement(By.xpath("//div[contains(@class, 'r-e7q0ms')]"));
        clicar.click();
        clicar = driver.findElement(By.xpath("//div[contains(@class, 'public-DraftStyleDefault-ltr')]"));
        clicar.click();
        clicar.sendKeys("Assunto do momento: "+ texto);
        clicar = driver.findElement(By.xpath("//div[@data-testid='tweetButton']"));
        clicar.click();
        Thread.sleep(1000);

        driver.quit();
        }
    }
