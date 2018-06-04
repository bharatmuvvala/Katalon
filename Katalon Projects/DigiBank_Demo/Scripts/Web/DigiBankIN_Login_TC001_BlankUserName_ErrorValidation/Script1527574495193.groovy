import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



CustomKeywords.'abc.newKeyword.myCustomPrint'('Welcome to Katalon')

WebUI.waitForElementPresent(findTestObject('Web/Page_Personal Banking in India  DBS/LandingPage_lnk_RootLogin'), 30)

WebUI.click(findTestObject('Web/Page_Personal Banking in India  DBS/LandingPage_lnk_RootLogin'))

WebUI.click(findTestObject('Web/Page_Personal Banking in India  DBS/LandingPage_lnk_DigibankLogin'))

WebUI.switchToWindowTitle('digibank Internet Banking')

WebUI.waitForElementPresent(findTestObject('Web/Page_digibank Internet Banking/input_username'), 30)

WebUI.click(findTestObject('Web/Page_digibank Internet Banking/input_username'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Page_digibank Internet Banking/input_username'), UserName)

WebUI.waitForElementPresent(findTestObject('Web/Page_digibank Internet Banking/input_password'), 30)

WebUI.click(findTestObject('Web/Page_digibank Internet Banking/input_password'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Web/Page_digibank Internet Banking/input_password'), Password)

WebUI.click(findTestObject('Web/Page_digibank Internet Banking/button_LOG IN'))

WebUI.verifyElementText(findTestObject('Web/Page_digibank Internet Banking/p_Invalid username'), 'Invalid username')

WebUI.closeBrowser()

