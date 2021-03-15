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

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_Email'), 'tirawat4567@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_Password'), 'v9Rq/WY/9JI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_confirm_password'), 
    'uk0P/+4WioI=')

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_FName'), 'สมปอง')

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_LName'), 'ใจดี')

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/input_Forgot password_Tel'), '0823456789')

WebUI.setText(findTestObject('Object Repository/Page_account BG-STORE/textarea_Forgot password_Address'), 'ต.หนองโสน อ.เลาขวัญ จ.กาญจนบุรี')

WebUI.click(findTestObject('Object Repository/Page_account BG-STORE/button_Register'))

WebUI.verifyTextPresent('Register', false)

WebUI.closeBrowser()

