package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver; //protected para que las clases hijas puedan acceder
    private static WebDriverWait wait;

    static { //inicializar el driver para entrar a la pagina web
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriverdos.exe"); //ruta del driver del navegador
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options); //inicializar el driver para entrar a la pagina web 
        wait = new WebDriverWait(driver, 10); //recibe el driver y el tiempo de espera para que cargue la pagina
        
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver; 
        wait = new WebDriverWait(driver, 10);  //instancia de la clase BasePage para que las clases hijas puedan acceder

    }

    public  void navigateToGoogle(String url) {
        driver.get(url); //navegar a la pagina web, driver es el navegador y get es para navegar a la pagina web
        
    }
        
    
}
