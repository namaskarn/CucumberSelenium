package com.Namaskar;

//BROWSER ELEMENTS & ITS OPERATIONS:

// BROWSER
//PAGE
//LINK
//BUTTON
//IMAGE
//TEXT AREA/ERROR MESSAGE
//RADIO BUTTON/CHECK BOX
//DROP DOWN BOX/LIST BOX/COMBO BOX
//FRAME means one window divided into two slot like two pages
// iFRAME
//WEB TABLE/HTML TABLE


//Method / Functions on web elements (in selenium we got 6 get commands)

// Get = driver.get("url");
// Get Title = driver.getTitle();
//Get page source = driver.getPageSource();
//Get current url = driver.getCurrentUrl();
//Get window handle (part of switch command)
//Get window handles


//Navigate commands are used to do task like refresh, go back, go forward

//Navigate To = driver.navigate().to("url");
//Navigate Refresh= driver.navigate().refresh();
//Navigate Back= driver.navigate().back();
//Navigate Forward = navigate().forward();

// if you are working 100 test case means you are opening 100 browser windows for that you need other Browser Commands:
// Close = driver.close(); it closes the current tab windows 
//Quit = driver.quit(); it closes the entire browser windows

// OTHER Commands
// findElement Command = driver.findElement(By.name("google")); ID, Name, Class Name, Tag Name, Link Text, Partial Link Text, CSS selector, Xpath
// sendKeys Command = driver.findElement(By.id("Content-1")).sendKeys("123");
//click Command = driver.findElement(By.linkText("youtube")).click();

