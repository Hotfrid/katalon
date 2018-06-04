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

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/i agree'), FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('IR/1st tst/Cont'), FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('IR/1st tst/passes btn in menu'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('IR/1st tst/Glbl pass btn in submenu'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/Glbl pass btn in submenu'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/add to cart'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('IR/1st tst/go to checkout'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.focus(findTestObject('IR/1st tst/go to checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/go to checkout'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/pass prot'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('IR/1st tst/sipping count drop down'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/Croatha'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/Proceed'), FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.delay(2)

WebUI.refresh()

WebUI.waitForElementVisible(findTestObject('IR/1st tst/Guest proceed'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/Guest proceed'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(2, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/date_add'))

WebUI.click(findTestObject('IR/1st tst/date'))

WebUI.setText(findTestObject('IR/Page_Checkout/input_customer_profile_travele'), 'qqq', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Checkout/input_customer_profile_travele_1'), 'www', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/1st tst/mr'))

WebUI.selectOptionByValue(findTestObject('IR/Page_Checkout/select_Day12345678910111213141'), '6', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('IR/Page_Checkout/select_MonthJanFebMarAprMayJun'), '5', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('IR/Page_Checkout/select_Year2018201720162015201'), '2010', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Checkout/input_customer_profile_travele_2'), 'MF334422', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/Page_Checkout/input_customer_profile_travele'))

WebUI.click(findTestObject('IR/Page_Checkout/a_Continue to shipping details'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_shippin'), '345646', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_shippin_1'), 'tryrty', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_shippin_2'), 'tyrty rtytry', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_shippin_3'), 'tytry rtyrty', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_contact'), '45654654', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_contact_1'), 'nhfvgfvgfv01@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Shipping/input_customer_profile_contact_2'), 'nhfvgfvgfv01@gmail.com', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/Page_Shipping/a_Continue to review your orde'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/Page_Review order/input_checkout_reviewaccept'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/Page_Review order/a_Proceed to payment details'), FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('IR/Page_Payment details/input_brandName'))

WebUI.delay(2)

WebUI.click(findTestObject('IR/Page_Payment details/input_brandName'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.setText(findTestObject('IR/Page_Payment details/input_card.cardNumber'), '4111 1111 1111 1111', FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Payment details/input_card.cardHolderName'), 'ddd sss', FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('IR/Page_Payment details/select_01020304050607080910111'), '08', true, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('IR/Page_Payment details/select_        2018        201'), '2018', true, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('IR/Page_Payment details/input_card.cvcCode'), '737', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IR/Page_Payment details/input_pay'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

