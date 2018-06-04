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

Mobile.startApplication('G:\\APK Files\\com.dbs.in.digitalbank_2018-05-19.apk', true)

Mobile.tap(findTestObject('Mobile/DigiBank_SG_OR/ConsentPage_btn_Continue'), 30)

Mobile.delay(10)

Mobile.tap(findTestObject('Mobile/DigiBank_SG_OR/LandingPage_btn_Login'), 30)

Mobile.clearText(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtedit_UserName'), 30)

Mobile.tap(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtedit_UserName'), 30)

Mobile.setText(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtedit_UserName'), UserName, 30)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtedit_Password'), 30)

Mobile.setText(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtedit_Password'), Password, 30)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_btn_Login'), 30)

Mobile.tap(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_btn_Login'), 30)

Mobile.verifyElementAttributeValue(findTestObject('Mobile/DigiBank_SG_OR/LoginPage_txtview_InvalidLogin'), 'text', 'Invalid login details', 
    0)

Mobile.closeApplication()

