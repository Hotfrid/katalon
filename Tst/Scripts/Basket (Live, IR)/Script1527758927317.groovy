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

WebUI.openBrowser('', FailureHandling.STOP_ON_FAILURE)

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://www.interrail.eu/', FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/i agree'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/Cont'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Counter/Passes counter'), '0')

WebUI.click(findTestObject('Page_Be free to explore Europe by r/a_Go for sunshine'))

WebUI.click(findTestObject('Page_Summer in Europe  Interrail.eu/a_5. Capri Italy'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('Page_Summer in Europe  Interrail.eu/a_SEE ITALY PASS PRICES'))

WebUI.switchToWindowTitle('Interrail Italy Pass | Italy by Train | Interrail.eu')

WebUI.click(findTestObject('Page_Interrail Italy Pass  Italy by/label_1st ClassWider seats les'))

WebUI.click(findTestObject('Page_Interrail Italy Pass  Italy by/a_Add to cart'))

WebUI.waitForElementVisible(findTestObject('Page_Interrail Italy Pass  Italy by/a_Continue shopping'), 0)

WebUI.click(findTestObject('Page_Interrail Italy Pass  Italy by/a_Continue shopping'))

WebUI.verifyElementText(findTestObject('Counter/Passes counter'), '1')

WebUI.closeBrowser()

