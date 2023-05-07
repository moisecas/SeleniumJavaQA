package pages;

import org.openqa.selenium.WebDriver;

public class GooglePages extends BasePage { //hereda de la clase BasePage para poder acceder a los metodos de la clase BasePage

    public GooglePages() {
        super(driver); //usando la instancia de la clase BasePage 
        
    }

    public void navigateToGoogle(String url) {
        driver.get(url); //navegar a la pagina web, driver es el navegador y get es para navegar a la pagina web
        navigateToGoogle("https://www.google.com/"); 
    }
    
}
