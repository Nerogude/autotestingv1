package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CypressWithCucumberPage extends BasePage{
	
	public WebDriver driver;
	
	By searchBar = By.cssSelector("input#header-mobile-search-bar");
	By searchButton =By.cssSelector(".ud-search-form-autocomplete-input-group.ud-search-form-autocomplete-input-group-reversed > .ud-btn.ud-btn-disabled.ud-btn-ghost.ud-btn-icon.ud-btn-icon-large.ud-btn-large.ud-heading-md");
	By addToCartBtn = By.cssSelector(".course-landing-page__purchase-section__main .ud-btn-brand");
	By previewThisCourse = By.cssSelector(".course-landing-page__introduction-asset__main > .intro-asset--wrapper--37FIE > .intro-asset--asset--3abyc > .intro-asset--placeholder--2_N1K.ud-btn.ud-btn-ghost.ud-btn-large.ud-heading-md > .intro-asset--text--lXX59.ud-heading-md");
	By couponTextField = By.cssSelector(".course-landing-page__purchase-section__main .ud-text-input-medium");
	By applyBtn = By.cssSelector(".course-landing-page__main-content.course-landing-page__purchase-section__main.dark-background-inner-text-container > div  .generic-purchase-section--main-cta-container--1hRUq  .generic-purchase-section--cta---ZDRQ .text-input-form--text-input-form--170x1 > .ud-btn.ud-btn-medium.ud-btn-primary.ud-heading-sm");
	By buyNowBtn = By.cssSelector("[class='slider-menu--cta-button--17y69'] [class]");

	public CypressWithCucumberPage() throws IOException {
		super();
		
	}

}
