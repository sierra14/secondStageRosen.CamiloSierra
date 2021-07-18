package seleniumgluecode;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test {
	
	WebDriver driver;
	
	By item1 = By.cssSelector("a.product-name");
	By item2 = By.linkText("Blouse");
	By item3 = By.linkText("Printed Dress");
	By item4 = By.xpath("//li[4]/div/div[2]/h5/a");
	By item5 = By.linkText("Printed Summer Dress");
	By item6 = By.xpath("//li[6]/div/div[2]/h5/a");
	By item7 = By.linkText("Printed Chiffon Dress");
	By colorItem8 = By.id("color_11");
	By colorItem9 = By.id("color_13");
	By colorItem10 = By.id("color_14");
	
	By addToCart1Btn = By.xpath("//ul[@id='homefeatured']/li/div/div[2]/div[2]/a/span");
	By addToCart2Btn = By.xpath("//ul[@id='homefeatured']/li[2]/div/div[2]/div[2]/a/span");
	By addToCart3Btn = By.xpath("//ul[@id='homefeatured']/li[3]/div/div[2]/div[2]/a/span");
	By addToCart4Btn = By.xpath("//ul[@id='homefeatured']/li[4]/div/div[2]/div[2]/a/span");
	By addToCart5Btn = By.xpath("//ul[@id='homefeatured']/li[5]/div/div[2]/div[2]/a/span");
	By addToCart6Btn = By.xpath("//ul[@id='homefeatured']/li[6]/div/div[2]/div[2]/a/span");
	By addToCart7Btn = By.xpath("//ul[@id='homefeatured']/li[7]/div/div[2]/div[2]/a/span");
	
	By addToCartBtn = By.xpath("//p[@id='add_to_cart']/button/span");
	By continueShoppingBtn = By.xpath("//div[@id='layer_cart']/div/div[2]/div[4]/span/span");
	
	By cart = By.xpath("//b");
	By delete = By.cssSelector("i.icon-trash");
	By textEmpty = By.cssSelector("p.alert.alert-warning");
	
	@Given("^Se ingresa a la pagina web$")
	public void se_ingresa_a_la_pagina_web() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/");
	}

	@When("^Se agreguen diez articulos al carrito$")
	public void se_agreguen_diez_articulos_al_carrito() throws Throwable {
	    
		//Se hace un scroll hacía abajo para poder ver los articulos
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		//Agregamos el primero articulo al carrito
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(item1)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart1Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
		
		//Agregamos el segundo articulo al carrito
		builder.moveToElement(driver.findElement(item2)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart2Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
		
		//Agregamos el tercer articulo al carrito
		builder.moveToElement(driver.findElement(item3)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart3Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
		
		//Agregamos el cuarto articulo al carrito
		builder.moveToElement(driver.findElement(item4)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart4Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);		
		
		js.executeScript("window.scrollBy(0,300)");

		//Agregamos el quinto articulo al carrito
		builder.moveToElement(driver.findElement(item5)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart5Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
		
		//Agregamos el sexto articulo al carrito
		builder.moveToElement(driver.findElement(item6)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart6Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
		
		//Agregamos el septimo articulo al carrito
		builder.moveToElement(driver.findElement(item7)).perform();
		driver.switchTo().activeElement();
		driver.findElement(addToCart7Btn).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);			
		
		//Agregamos el octavo articulo al carrito
		driver.findElement(item5).click();
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(colorItem8).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(addToCartBtn).click();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();
		
		//Agregamos el noveno articulo al carrito
		driver.findElement(colorItem9).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(addToCartBtn).click();
		Thread.sleep(2000);
		driver.findElement(continueShoppingBtn).click();	
		
		//Agregamos el decimo articulo al carrito
		driver.findElement(colorItem10).click();
		Thread.sleep(2000);
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(addToCartBtn).click();
		Thread.sleep(5000);
		driver.findElement(continueShoppingBtn).click();
		Thread.sleep(2000);
	}

	@When("^Se toma evidencia del carrito con los diez articulos$")
	public void se_toma_evidencia_del_carrito_con_los_diez_articulos() throws Throwable {
	    //Se hace scroll hacía arriba para poder ir al carrito
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("src/screenshots/cartWithTenItems.jpg"));
		 //Se abre el carrito
		driver.findElement(cart).click();
		
		Thread.sleep(1000);
		//Se toma un capture y se va haciendo scroll hacía abajo mientras se toman las capturas de pantalla
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile2, new File("src/screenshots/cart.jpg"));
		
		//Se realiza un for para que se haga el scroll y se tome la evidencia de la navegación dentro del carrito
		for(int i=0; i<4; i++) {
			js.executeScript("window.scrollBy(0,400)");
			
			File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(scrFile3, new File("src/screenshots/cartPart"+i+".jpg"));
		}

	}

	@When("^Se eliminan los diez articulos del carrito$")
	public void se_eliminan_los_diez_articulos_del_carrito() throws Throwable {
	    //Se hace un scroll hacía arriba para eliminar los articulos
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1200)");
		
		//Se realiza un for que llegue hasta 10, para eliminar uno por uno los elementos del carrito
		for(int i=0; i<10; i++) {
			driver.findElement(delete).click();
			Thread.sleep(3000);
		}
		
	}

	@Then("^Se evidencian carrito vacio$")
	public void se_evidencian_carrito_vacio() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		
		//Se realiza validación del mensaje que indica que el carrito de compras está vacio
		assertEquals("Your shopping cart is empty.", driver.findElement(textEmpty).getText());
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("src/screenshots/cartEmpty.jpg"));
		
		//Se cierra el navegador
	    driver.close();
	}

}
