# katalon-studio-headless-test-execution


# Introduction-
In this template,how run the script in the headless browser means without a graphical user interface. Headless browsers provide automated control of a web page in an environment similar to popular web browsers, but they are executed via a command-line interface or using network communication. They are particularly useful for testing web pages as they are able to render and understand HTML the same way a browser would, including styling elements such as page layout, colour, font selection and execution of JavaScript and Ajax which are usually not available when using other testing methods.

# About the project-
In this template, how to run testcases in headless mode. We need to define the different arguments- window size,headless,start maximized etc

                       ChromeOptions option=new ChromeOptions();
                       option.addArguments("start_maximized");
                       option.addArguments("disable-infobars");
                       option.addArguments("disable-extensions");
                       option.addArguments("--headless");
                       option.addArguments("--window-size=1920,1080");
                       option.addArguments("--window-size=1920,1080","--disable-gpu", "--disable-extensions", "--no-sandbox", "-incognito");

## Technologies-

###### Browser- Chrome Headless

###### Language- Java, Groovy

###### Tool- Katalon Studio

###### OS- Ubuntu/Linux

## Use this template to following the steps-

## Install the Katalon-
Pre-requisites:
1. Valid Email to active Katalon Account
2. Active Internet Connection to download Katalon Studio


###### System Requirements:

###### Operating System:  
Windows 7, Windows 8, Windows 10, macOS 10.11+
###### CPU: 
1 GHz or faster 32-bit (x86) or 64-bit (x64) processor
###### Memory: 
1 GB RAM (32-bit) or 2 GB RAM (64-bit)
###### Hard Drive:
at least 1 GB available hard disk space

## Install the jdk-
              sudo apt-get install openjdk-8-jre
              sudo update-alternatives --config java //then choose the openjdk-8-jre option

## Install the chrome Driver-

             sudo curl -sS -o - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add 
             sudo bash -c "echo 'deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main' >> /etc/apt/sources.list.d/google-chrome.list" 
             sudo apt -y update 
             sudo apt -y install google-chrome-stable 


###### Go to the Katalon website: Katalon products


Register a Katalon account with an active email or sign in to your Katalon account if you already have one.
To download Katalon Studio for Linux, click Create your first test in the Katalon Studio box. 
Katalon leads you to the downloading page where you will choose the Linux version of Katalon Studio, then click Download. 
A tar.gz file is being downloaded to your machine.

1. After download extract the file

2. After follow the above instructions-

3. Clone the Repository in your system

4. After extract, go to katalon tool and export this repository 

5. Under TestSuites, click on Login

 6.Click on drop down button of Run icon

7. Select the browser as Chrome Headless

8. CLick on Run button
