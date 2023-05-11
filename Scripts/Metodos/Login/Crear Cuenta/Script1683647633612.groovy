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

WebUI.delay(2)

WebUI.click(findTestObject('Web/Login/btn_CrearCuenta'))

WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_email'), email)

WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_confimarEmail'), email)

WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_password'), pass)

WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_confirmarContraseña'), pass)

WebUI.scrollToElement(findTestObject('Web/Login/crear cuenta/txt_confimarEmail'), 0)

WebUI.click(findTestObject('Web/Login/crear cuenta/label_TerninosYcondiciones'))

WebUI.click(findTestObject('Web/Login/crear cuenta/btn_crearCuenta'))

WebUI.delay(5)

String Ms = WebUI.verifyTextPresent('Lo sentimos, no pudimos crear su cuenta. Favor de inténtalo de nuevo. Si el pro blema continúa comuníquese con Atención al clientes.', 
    false)

if (Ms.equals('true')) {
    int RN = ((Math.random() * 10000) as int)

    WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_email'), ('prueba' + RN) + '@test.mx')

    WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_confimarEmail'), ('prueba' + RN) + '@test.mx')

    WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_password'), pass)

    WebUI.sendKeys(findTestObject('Web/Login/crear cuenta/txt_confirmarContraseña'), pass)

    WebUI.scrollToElement(findTestObject('Web/Login/crear cuenta/txt_confimarEmail'), 0)

    WebUI.click(findTestObject('Web/Login/crear cuenta/label_TerninosYcondiciones'))

    WebUI.click(findTestObject('Web/Login/crear cuenta/btn_crearCuenta'))
}

