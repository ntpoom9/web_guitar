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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/web/index.html')

WebUI.click(findTestObject('Object Repository/Page_BG-STORE/a_'))

WebUI.click(findTestObject('Object Repository/Page_account BG-STORE/span_'))

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/input__Email'), 'tirawat2617@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_account BG-STORE/input__Password'), 'N0Vb6Oo1MHA=')

WebUI.click(findTestObject('Object Repository/Page_account BG-STORE/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Document/a_'))

WebUI.click(findTestObject('Object Repository/Page_All Products BG-STORE/h4_Enya EA-X1 EQ'))

WebUI.click(findTestObject('Object Repository/Page_All Products BG-STORE/button_'))

WebUI.click(findTestObject('Object Repository/Page_All Products BG-STORE/i_Tirawat_fas fa-shopping-cart'))

WebUI.verifyTextPresent('Enya EA-X1 EQ', false)

WebUI.closeBrowser()

