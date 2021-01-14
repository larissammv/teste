package com.projetotestess;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.google.common.io.Files;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;	


		
 //   @Test
    public class NewEclipse {

    	public static void main(String[] args) throws IOException {
    		String currentDirectory = System.getProperty("user.dir");
    		System.out.println("The current working directory is " + currentDirectory);
    		
    		System.setProperty("webdriver.chrome.driver", currentDirectory+"\\chromedriver.exe");
   
    		
 //Aqui será criada automaticamente uma pasta com o nome do dia de hoje, dentro de uma pasta do projeto atual
    		
    		Date now = new Date();
    		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
    		String time = dateFormat.format(now);
    		File dir1= new File(time);
    		if(!dir1.exists())
    			dir1.mkdir();  	
    		
 // Nesta seção é configurado para iniciar o chromedriver com a janela maximizada  
    		
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--start-maximized");
    

    	WebDriver driver = new ChromeDriver(options);
    	
    	   
    	driver.get("https://www.drogariafacine.com.br");
    	
 //Após entrar no site da drogaria, nessa seção é configurado para tirar um screenshot da tela
 // Para inserir na pasta do dia de hoje:
 
    	
File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	
    	FileUtils.copyFile(scrFile2, new File("C:\\Users\\larib\\eclipse-workspace\\NewEclipse\\14012021\\screenshot0.png"));
    	   
    	try {
	        Thread.sleep(2*1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
    	
    	   String oi2Xpath = "/html/body/header/div[1]/div/div/div/div[1]/span/a"; 
    	   WebElement element2 = driver.findElement(By.xpath(oi2Xpath));
    	   if (element2 != null) {
    	  	element2.click(); 
    	  	
    	  	
        	String oi4Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[1]/fieldset/div[2]/p/label[1]/input"; 
        	 WebElement element4 = driver.findElement(By.xpath(oi4Xpath));
        	 if (element4 != null) {
        		element4.sendKeys("Larissa Facine"); 
        		
        		JavascriptExecutor executor = (JavascriptExecutor)driver;
            	executor.executeScript("document.body.style.zoom = '0.6'");	
        		
        		((JavascriptExecutor) driver).executeScript("window.open('https://www.calculadorafacil.com.br/computacao/gerador-de-cpf')");
 
        		
        		// Aqui nessa seção, o chromedriver está entrando em uma nova guia, para copiar o Cpf gerado do gerador de cpf     		
        		
        		String winHandleBefore = driver.getWindowHandle();

        		
        		
        		for(String winHandle : driver.getWindowHandles()){
        		    driver.switchTo().window(winHandle);
        		}
        		
        		
        		try {
        	        Thread.sleep(4*1000);
        	    } catch (InterruptedException e) {
        	        e.printStackTrace();
        	    }
        		
        		
        		String oi5Xpath = "/html/body/section/div/div/div[1]/div/div[3]/div[1]/div[1]/div/div/div[4]/div/div/div/button"; 
        		 WebElement element5 = driver.findElement(By.xpath(oi5Xpath));
        		 if (element5 != null) {
        			element5.click(); 
        			
        			driver.close();
        			
        			driver.switchTo().window(winHandleBefore);

        		
        			
        			driver.findElement(By.xpath("//*[@id=\"pf_cpf_cliente\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
        			
        			String oi7Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[1]/fieldset/div[2]/p/label[2]/input"; 
        			 WebElement element7 = driver.findElement(By.xpath(oi7Xpath));
        			 if (element7 != null) {
        				element7.sendKeys("01081994"); 
        			
        				
        				String oi8Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[1]/fieldset/label[2]/input"; 
        				 WebElement element8 = driver.findElement(By.xpath(oi8Xpath));
        				 if (element8 != null) {
        			element8.sendKeys("11989761255"); 
        			
        		String oi9Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[1]/fieldset/p/label[1]/input"; 
        			 WebElement element9 = driver.findElement(By.xpath(oi9Xpath));
       			 if (element9 != null) {
        				element9.sendKeys("123456"); 
        				
        			String oi10Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[1]/fieldset/p/label[2]/input"; 
        				 WebElement element10 = driver.findElement(By.xpath(oi10Xpath));
        			if (element10 != null) {
        					element10.sendKeys("123456"); 
        					
        					((JavascriptExecutor) driver).executeScript("window.open('https://www.invertexto.com/gerador-email-temporario')");
        	        		
        	        		String winHandleBefore1 = driver.getWindowHandle();

        	        		
        	        		
        	        		for(String winHandle : driver.getWindowHandles()){
        	        		    driver.switchTo().window(winHandle);
        	        		}
        	        		
        	        		
        	        		try {
        	        	        Thread.sleep(2*1000);
        	        	    } catch (InterruptedException e) {
        	        	        e.printStackTrace();
        	        	    }
        					
        	        		
        	        		 String oi11Xpath = "/html/body/main/div[1]/div[2]/div/div/span/button[1]/span"; 
        	        		 WebElement element11 = driver.findElement(By.xpath(oi11Xpath));
        	        		 if (element11 != null) {
        	        			element11.click();
        	        		
        	        			driver.close();
        	        			
        	        			driver.switchTo().window(winHandleBefore);
        	        			
        	        			driver.findElement(By.xpath("//*[@id=\"email_cliente\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
        	        		
        	        			driver.findElement(By.xpath("//*[@id=\"email_cliente2\"]")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
        	        		
   // Tendo preenchido todos os dados do cadastro, será tirado mais um screenshot da tela 	   
        	        			
        	        			
    	   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	   FileUtils.copyFile(scrFile, new File("C:\\Users\\larib\\eclipse-workspace\\NewEclipse\\14012021\\screenshot.png"));
    	   
    	   
    	   String oi111Xpath = "/html/body/div[1]/div/section/div[2]/div/form/div[3]/button"; 
  		 WebElement element111 = driver.findElement(By.xpath(oi111Xpath));
  		 if (element111 != null) {
  			element111.sendKeys(Keys.ENTER); 
    	   
 // Após criar o cadastro, o chromedriver clicará na seção do perfil. onde é possível ver dados do perfil/ login criado   	   
    	
    	  	driver.findElement(By.cssSelector("[href='\\/loja\\/central_anteriores\\.php\\?loja\\=895435']")).click();

    	  	try {
    	        Thread.sleep(3*1000);
    	    } catch (InterruptedException e) {
    	        e.printStackTrace();
    	    }
    	  	
    	  	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     	   FileUtils.copyFile(scrFile1, new File("C:\\Users\\larib\\eclipse-workspace\\NewEclipse\\14012021\\screenshot4.png"));


    	
    	              }
    	
    	           }
    	
    	       }
           }
      }
            
}
      }

    	  }
                  }
    	
                          }
    	
     	
                                        }
    
    
