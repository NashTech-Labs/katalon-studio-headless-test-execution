import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.setViewPortSize(1920, 1080)
WebUI.navigateToUrl('https://www.keka.com/')
WebUI.delay(5)
WebUI.maximizeWindow()
System.setProperty("webdriver.chrome.driver", "/home/knoldus/Downloads/chromedriver_linux64/chromedriver");
ChromeOptions options =new ChromeOptions()

options.addArguments("start_maximized")
options.addArguments("disable-infobars")
options.addArguments("disable-extensions")
options.addArguments("--headless")
options.addArguments("--window-size=1920,1080")

WebUI.click(findTestObject('Login/Page_Keka  The HR Payroll software loved by_bb55c4/a_login'))

WebUI.setText(findTestObject('Login/Page_Keka Login/input_Login_Email'), 'soniya.raichandani@knoldus.com')

WebUI.click(findTestObject('Login/Page_Keka Login/button_Login'))

WebUI.click(findTestObject('Login/Page_Log in/button_Login with Google'))
WebUI.click(findTestObject('Login/Next button'))
//WebUI.click(findTestObject('Login/Page_Sign in  Google accounts/span_Next'))

WebUI.setText(findTestObject('Login/Password'),
	'*******')

WebUI.click(findTestObject('Login/Submit button'))

WebUI.takeScreenshot()

WebUI.takeScreenshot('/home/knoldus/Katalon Studio/kekaaa.png')
WebUI.delay(45)
WebUI.takeScreenshot('/home/knoldus/Katalon Studio/keka2.png')
WebUI.mouseOver(findTestObject('Login/Page_Home  Dashboard/span_Me'))

WebUI.click(findTestObject('Login/Page_Home  Dashboard/span_Attendance'))
WebUI.takeScreenshot()