//package TestCases;
//
//import Pages.RahulShettyPractisePage;
//import Utilities.BasePage;
//
//public class RahulShettyTest extends BasePage {
//
//    RahulShettyPractisePage rsp = new RahulShettyPractisePage(driver);
//
//    public void performRadioButtonOperations(){
//        rsp.launchApplicationWithExtendedUrl()
//    }
//
//    /**
//     * This method is used to launch the application
//     * @param url
//     */
//    public void launchApplication(String url) {
//        driver.get(url);
//    }
//
//    /**
//     * This method is used to select first radio button
//     */
//    public void selectFirstRadioButton() {
//        RahulShettyPractisePage.firstRadioButton.click();
//    }
//
//    /**
//     * This method is used to verify first selected radio button
//     */
//    public void verifyFirstRadioButtonStatus() {
//        boolean isFirstRadiobuttonSelected = RahulShettyPractisePage.firstRadioButton.isSelected();
//        if (isFirstRadiobuttonSelected){
//            System.out.println("First radio button is selected");
//        }else {
//            System.out.println("First radio button is not selected");
//        }
//    }
//}
