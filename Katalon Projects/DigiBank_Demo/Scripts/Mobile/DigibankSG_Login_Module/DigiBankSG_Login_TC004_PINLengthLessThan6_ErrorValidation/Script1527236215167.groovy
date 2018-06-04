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

Mobile.startApplication('G:\\APK Files\\DBS digibank SG_v2.0.002_apkpure.com.apk', true)

Mobile.tap(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_button_Login'), 0)

Mobile.tap(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_txtedit_UserID'), 0)

Mobile.setText(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_txtedit_UserID'), 'UserName', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_txtedit_PIN'), 0)

Mobile.setText(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_txtedit_PIN'), '1234', 0)

Mobile.tap(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_button_Login'), 0)

Mobile.verifyElementHasAttribute(findTestObject('Mobile/DigiBankSG_Login_OR/LoginPage_txtview_InvalidLoginDetails'), 'Please enter your PIN.', 
    0)

Mobile.closeApplication()

