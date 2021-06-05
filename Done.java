import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Done
{
	 public static void main(String[] args) throws InterruptedException 
	 {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\OneDrive\\Desktop\\desktop\\selenium jar\\chromedriver.exe");
	     
	     //create driver object//
         WebDriver w= new ChromeDriver();
         
         //Navigate//
         w.get("http://parabank.parasoft.com");
         
         System.out.println("Welcome to Parabank");
         
         //To maximize window//
         w.manage().window().maximize();
         
        
         Thread.sleep(1000);



            
        //Welcome to Parabank//
        
		 //home
		 //read me
		 w.findElement(By.linkText("home")).click();
		 w.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/p[1]/a[1]")).click();
		 w.findElement(By.xpath("//body[1]/div[1]/div[3]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/a[1]")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/p[2]/a[1]")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 //ATM service
		w.findElement(By.linkText("Withdraw Funds")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.linkText("Transfer Funds")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.linkText("Check Balances")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.linkText("Make Deposits")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 //online service
		 w.findElement(By.linkText("Bill Pay")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.linkText("Account History")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 w.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/ul[2]/li[4]/a[1]")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 //05/26/2021
		 w.findElement(By.linkText("ParaBank Is Now Re-Opened")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 
		 Thread.sleep(4000);
		 
		 
		//About button
		 w.findElement(By.linkText("about")).click();
		 w.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/p[3]/a[1]")).click();
		 Thread.sleep(2000);
		 w.navigate().back();
		 Thread.sleep(2000);
		 
		 
		 //feedback
		 w.findElement(By.linkText("contact")).click();
		 w.findElement(By.id("name")).sendKeys("abcd");
		 w.findElement(By.id("email")).sendKeys("abcd@gmail.com");
		 w.findElement(By.id("phone")).sendKeys("1234567890");
		 w.findElement(By.id("message")).sendKeys("good");
		 w.findElement(By.xpath("//tbody/tr[5]/td[2]/input[1]")).click();
		 Thread.sleep(2000);
		 
         
         w.findElement(By.linkText("About Us")).click();//About us
         
         w.findElement(By.linkText("www.parasoft.com")).click();//click on www.parasoft.com//
         JavascriptExecutor hs = ( JavascriptExecutor) w;
         hs.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000); 
         w.navigate().back();
      
                 
         
         
         //Services//
         w.findElement(By.linkText("Services")).click();
         JavascriptExecutor ps = ( JavascriptExecutor) w;
         ps.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000); 
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[1]/td[2]/a")).click();//Book store services//
         JavascriptExecutor js = ( JavascriptExecutor) w;
         js.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[2]/td[2]/a")).click();
         JavascriptExecutor j1 = ( JavascriptExecutor) w;
         j1.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[3]/td[2]/a")).click();
         JavascriptExecutor j2 = ( JavascriptExecutor) w;
         j2.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
        
         
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[4]/td[2]/a")).click();
         JavascriptExecutor j4 = ( JavascriptExecutor) w;
         j4.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
       
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[5]/td[2]/a")).click();
         JavascriptExecutor j6 = ( JavascriptExecutor) w;
         j6.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
        
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[6]/td[2]/a")).click();
         JavascriptExecutor j8 = ( JavascriptExecutor) w;
         j8.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
      
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[3]/tbody/tr[1]/td[2]/a")).click();//parabank services/
         JavascriptExecutor j9 = ( JavascriptExecutor) w;
         j9.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[3]/tbody/tr[2]/td[2]/a")).click();
         JavascriptExecutor j10 = ( JavascriptExecutor) w;
         j10.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[5]/tbody/tr/td/a[1]")).click();//Available REST ful services//
         JavascriptExecutor j11 = ( JavascriptExecutor) w;
         j11.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         
         w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[5]/tbody/tr/td/a[2]")).click();//Available REST ful services//
         JavascriptExecutor j12 = ( JavascriptExecutor) w;
         j12.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
         Thread.sleep(1000);
         w.navigate().back();
         
         Thread.sleep(1000);
         w.navigate().back();
         
         
         System.out.println("These are all services");
         
         
         
         
         //Products//
         w.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
        //scroll
        JavascriptExecutor p=(JavascriptExecutor) w;
	   p.executeScript("window.scrollBy(0,10000)","");
	    Thread.sleep(1000);
	    w.navigate().back();
	    
	    
	    //Locations//
	    w.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
		JavascriptExecutor sj=(JavascriptExecutor) w;
		sj.executeScript("window.scrollBy(0,1000)","");
		Thread.sleep(3000);
	
		w.navigate().back();
	
		
		
		
		//Admin Page//
		w.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
		w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[1]/button")).click();
		System.out.println("Database Initialized");
		
		w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[1]/form/table/tbody/tr/td[2]/button")).click();
		System.out.println("Database Cleaned");

		w.findElement(By.xpath("//*[@id=\"rightPanel\"]/table/tbody/tr/td[2]/form/table/tbody/tr/td[3]/input")).click();
	    System.out.println("ShutDown");
	    
	    WebElement radio1 = w.findElement(By.id("accessMode3"));		
	    radio1.click();
       WebElement radio2 = w.findElement(By.id("accessMode1"));	
       radio2.click();
	   w.findElement(By.id("soapEndpoint")).sendKeys("abc");
	   w.findElement(By.id("restEndpoint")).sendKeys("sgdc");
	   w.findElement(By.id("endpoint")).sendKeys("mmm");
	
	
	  Select m= new Select(w.findElement(By.id("loanProvider")));
      m.selectByIndex(0);
      Select n= new Select(w.findElement(By.id("loanProcessor")));
      n.selectByIndex(0);
      w.findElement(By.xpath("//*[@id=\"adminForm\"]/input")).click();
      System.out.println("Administration Submitted Successfully");
      
      
      
      Thread.sleep(1000);
		 
		
        
        //click on register//
        w.findElement(By.linkText("Register")).click();
       //Registration page//
        w.findElement(By.linkText("Register")).click();
	
	 
        w.findElement(By.name("customer.firstName")).sendKeys("Sk");
        w.findElement(By.name("customer.lastName")).sendKeys("Appu");
        w.findElement(By.name("customer.address.street")).sendKeys("Tenali");
        w.findElement(By.name("customer.address.city")).sendKeys("Guntur");
        w.findElement(By.name("customer.address.state")).sendKeys("AP");
        w.findElement(By.name("customer.address.zipCode")).sendKeys("123456");
        w.findElement(By.name("customer.phoneNumber")).sendKeys("6301785201");
        w.findElement(By.name("customer.ssn")).sendKeys("803413241567");
        w.findElement(By.name("customer.username")).sendKeys("SSAD10");
        w.findElement(By.name("customer.password")).sendKeys("Appu@1234");
        w.findElement(By.name("repeatedPassword")).sendKeys("Appu@1234");
        w.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();

        System.out.println("Registration done successfully");



        //open new account//  
        w.findElement(By.linkText("Open New Account")).click();

        Select s=new Select(w.findElement(By.xpath("//*[@id=\"type\"]")));
        s.selectByIndex(0);
        Select we= new Select(w.findElement(By.xpath("//*[@id=\"fromAccountId\"]")));
        we.selectByIndex(0);
        w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
        System.out.println("Account Open Sucessfully");

        w.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();  //account overview

        w.findElement(By.linkText("Transfer Funds")).click(); /// click on transfer fund//
        //w.findElement(By.id("input")).sendKeys("300");
        //Select se=new Select(w.findElement(By.xpath("//*[@id=\"fromAccountId\"]")));  //from account
        //se.selectByIndex(1);
        //Select st=new Select(w.findElement(By.xpath("//*[@id=\"toAccountId\"]")));  //to account
         //st.selectByIndex(0);

        // w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")).click();// //transfer button

 
        w.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[4]/a")).click(); // bill pay
		
        w.findElement(By.name("payee.name")).sendKeys("Sk Appu");
       w.findElement(By.name("payee.address.street")).sendKeys("Tenali");
        w.findElement(By.name("payee.address.city")).sendKeys("Guntur"); 
        w.findElement(By.name("payee.address.state")).sendKeys("AP");
		
        w.findElement(By.name("payee.address.zipCode")).sendKeys("123456");
        w.findElement(By.name("payee.phoneNumber")).sendKeys("6301785201");
        w.findElement(By.name("payee.accountNumber")).sendKeys("80567");
        w.findElement(By.name("verifyAccount")).sendKeys("80567");
        w.findElement(By.name("amount")).sendKeys("13");
        Select so =new Select(w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")));
        so.selectByIndex(0);
        w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")).click();  // send payment


        System.out.println("send payement successfully");

       Thread.sleep(2000);



       //Find transactions
       w.findElement(By.linkText("Find Transactions")).click();
       Select PE=new Select(w.findElement(By.xpath("//*[@id=\"accountId\"]")));//select an account//
       PE.selectByIndex(0);
       w.findElement(By.xpath("//*[@id=\"criteria.transactionId\"]")).sendKeys("1235");//find account//
   
   
      w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[3]/button")).click();//click on find by trans id
   
   
      w.findElement(By.id("criteria.onDate")).sendKeys("04-20-2021");
   
      w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[5]/button")).click();
      w.findElement(By.id("criteria.fromDate")).sendKeys("04-2-2021");
      w.findElement(By.id("criteria.toDate")).sendKeys("04-20-2021");
      w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[7]/button")).click();
      w.findElement(By.id("criteria.amount")).sendKeys("515");
      w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[9]/button")).click();
   

     Thread.sleep(1000);

     //To click on update info

     w.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
     //update info//
     w.findElement(By.name("customer.firstName")).sendKeys("ppu");
     w.findElement(By.name("customer.lastName")).sendKeys("Sk");
     w.findElement(By.name("customer.address.street")).sendKeys("Bhatt");
     w.findElement(By.name("customer.address.city")).sendKeys("Guntur");
     w.findElement(By.name("customer.address.state")).sendKeys("TN");
     w.findElement(By.name("customer.address.zipCode")).sendKeys("123567");
     w.findElement(By.name("customer.phoneNumber")).sendKeys("6301784356");

     //To submit update button//
     w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[8]/td[2]/input")).click();
     Thread.sleep(2000); 
     System.out.println("Update profile Successfully");


     //click on Request Loan//
     w.findElement(By.linkText("Request Loan")).click();
     w.findElement(By.id("amount")).sendKeys("100");
     w.findElement(By.id("downPayment")).sendKeys("20");
     //for dropdown to select from account//
    Select l= new Select(w.findElement(By.id("fromAccountId")));
    l.selectByIndex(0);
    //to click on Apply button//
    w.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
    Thread.sleep(1000);
    System.out.println("Request loan apllied successfully");//

    //To Logout//
     w.findElement(By.linkText("Log Out")).click();
     System.out.println("Logot successfully");
     Thread.sleep(1000);



     //Forget logininfo//

     w.findElement(By.linkText("Forgot login info?")).click();
     w.findElement(By.name("firstName")).sendKeys("Sk");
     w.findElement(By.name("lastName")).sendKeys("Appu");
     w.findElement(By.name("address.street")).sendKeys("Tenali");
     w.findElement(By.name("address.city")).sendKeys("Guntur");
     w.findElement(By.name("address.state")).sendKeys("AP");
     w.findElement(By.name("address.zipCode")).sendKeys("123456");
     w.findElement(By.name("ssn")).sendKeys("803413241567");
     w.findElement(By.xpath("//*[@id=\"lookupForm\"]/table/tbody/tr[8]/td[2]/input")).click();
     System.out.println("Login info");


     //To Logout//
     w.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a")).click();
     System.out.println("Logout successfully");
     Thread.sleep(1000);


    //Login//
    w.findElement(By.name("username")).sendKeys("SAAD10");
    w.findElement(By.name("password")).sendKeys("Appu@123");
    w.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
    System.out.println("Login successfully");
    
    
    //Forum//
	 w.findElement(By.linkText("Forum")).click();
	 w.findElement(By.name("Search")).sendKeys("products");//for products//
	 w.findElement(By.xpath("//*[@id=\"Form_Go\"]")).click();
	 JavascriptExecutor d = ( JavascriptExecutor) w;
    d.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
    Thread.sleep(1000); 
    w.navigate().back();
    
    
    
    w.findElement(By.name("Search")).sendKeys("services");//for products//
	 w.findElement(By.xpath("//*[@id=\"Form_Go\"]")).click();
	 JavascriptExecutor de = ( JavascriptExecutor) w;
    de.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
    Thread.sleep(1000);
    w.navigate().back();
    
    
    
    JavascriptExecutor ded = ( JavascriptExecutor) w;
    ded.executeScript("window.scrollBy(0,1000)","");  //ScrollDown//
    Thread.sleep(1000); 
    w.navigate().back();
    
    
    //sitemap//
    w.findElement(By.linkText("Site Map")).click();
    
    
    
    
    //contact us/
    w.findElement(By.linkText("Contact Us")).click();
    w.findElement(By.id("name")).sendKeys("abcd");
	 w.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	 w.findElement(By.id("phone")).sendKeys("1234567890");
	 w.findElement(By.id("message")).sendKeys("good");
	 w.findElement(By.xpath("//*[@id=\"contactForm\"]/table/tbody/tr[5]/td[2]/input")).click();
	 Thread.sleep(2000);
	System.out.println("Thank You For Your Response");
	
    w.close();
	 
	 
	 }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    


