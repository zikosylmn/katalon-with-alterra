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

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('ObjectSpy/HomePage/Page_CURA Healthcare Service/btn_menu-toggle'))

WebUI.click(findTestObject('ObjectSpy/Menu Toggle/btn_Login'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/inpt_username'), 0)

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/lbl_Login'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/lbl_Please login to make appointment'))

WebUI.setText(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/inpt_username'), 'John Doe')

WebUI.setText(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/inpt_password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('ObjectSpy/Login/Page_CURA Healthcare Service/btn_Login'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/Appointment/Page_CURA Healthcare Service/h2_Make Appointment'), 0)

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Appointment/Page_CURA Healthcare Service/btn_Book Appointment'))

WebUI.click(findTestObject('ObjectSpy/HomePage/Page_CURA Healthcare Service/btn_menu-toggle'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_Home'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_History'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_Profile'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_Logout'))

WebUI.verifyElementNotPresent(findTestObject('ObjectSpy/Menu Toggle/btn_Login'), 0)

WebUI.click(findTestObject('ObjectSpy/Menu Toggle/btn_Logout'))

WebUI.waitForElementVisible(findTestObject('ObjectSpy/HomePage/Page_CURA Healthcare Service/tittle_CURA Healthcare Service'), 
    0)

WebUI.click(findTestObject('ObjectSpy/HomePage/Page_CURA Healthcare Service/btn_menu-toggle'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_Home'))

WebUI.verifyElementVisible(findTestObject('ObjectSpy/Menu Toggle/btn_Login'))

WebUI.verifyElementNotPresent(findTestObject('ObjectSpy/Menu Toggle/btn_Logout'), 0)

WebUI.closeBrowser()

