package com.hepsiburada.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends Base {

    @FindBy(css = "#productReviewsTab")
    private WebElement commentsTab;

    @FindBy(css = "#hermes-voltran-comments > div.ReviewList-module-2Ymrn > div > div > div:nth-child(1)")
    private WebElement firstComment;

    @FindBy(xpath = "//*[@id=\"hermes-voltran-comments\"]/div[3]/div/div/div[1]/div[2]/div[7]/div/button[1]")
    private WebElement firstYesBtn;

    @FindBy(css = "#hermes-voltran-comments > div.ReviewList-module-2Ymrn > div > div > div:nth-child(1) > div.ReviewCard-module-3Y36S > div.ReviewCard-module-uH6Em > span.ReviewCard-module-1ZiTv")
    private WebElement thanksMsg;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnCommentsTab() {
        waitUntilClickable(commentsTab).sendKeys(Keys.ENTER);
    }

    public void clickOnYesForTheFirstComment() {
        if(firstComment.isDisplayed()) {
            waitUntilClickable(firstYesBtn).sendKeys(Keys.ENTER);
        }
    }

    public String seeThanksMessage(String message) {
        return waitUntilVisible(thanksMsg).getText();
    }
}