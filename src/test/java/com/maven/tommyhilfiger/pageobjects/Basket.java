package com.maven.tommyhilfiger.pageobjects;

import com.maven.tommyhilfiger.driver.DriverFactory;
import com.maven.tommyhilfiger.utils.Help;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Basket extends DriverFactory {
    Help helpers = new Help();
    //to remove I AGREE;
    @FindBy(xpath = "/html/body/div[3]/div/div/div/div/p/button[2]")
    private WebElement  click;
    public void agree(){
        click.click();
    }
    //to select "WOMEN" in main category //women
    @FindBy(css = ".nav__list-item__link")
    private List<WebElement> list;
    public void category(String item) {
        for (WebElement lists: list){
           if(lists.getText().equalsIgnoreCase(item)){
              helpers.action(lists);
               break;
           }
        }
    }
    //to select "coats and jackets , bags" sublist in main category //women/coats and jackets
    //women/bags
    @FindBy(css = ".nav__list-item__link")
    private List<WebElement> sublist;
    public void sublist(String item) {
        for (WebElement lists: sublist){
            if(lists.getText().equalsIgnoreCase(item)){
                lists.click();
                break;
            }
        }
    }
    //to select filters for sublist
    //women/coats and jackets/range,label,style,material,size
    //women/bags/label
    @FindBy(css = ".sticky-scroll .catalog-facets__group-label")
    private List<WebElement> filters;
    public void sublistFilters(String item) throws InterruptedException {
        for (WebElement lists: filters){
            if(lists.getText().equalsIgnoreCase(item)){
                Thread.sleep(3000);
                lists.click();
                break;
            }
        }
    }
    //to select subFilters for sublist
    //women/coats and jackets/range-sustainable,label-tommyJeans,style-paddedJacket,material-down,size-m
    //women/bags/label-tommyJeans
    @FindBy(css = ".checkbox__label ")
    private List<WebElement> subFilters;
    public void subFilter(String item) throws InterruptedException {
        for (WebElement lists: subFilters){
            if(lists.getText().equalsIgnoreCase(item)){
                Thread.sleep(3000);
                lists.click();
                break;
            }
        }
    }
    //add randomly one product
    //women/coats and jackets/range-sustainable,label-tommyJeans,style-paddedJacket,material-down,size-m/select randomProduct
    //women/bags/label-tommyJeans/select randomProduct
    @FindBy(css = ".product-tile__imagery")
    private List<WebElement> productsList;
    public String products() throws InterruptedException {
        int product = productsList.size();
        System.out.println(product);
        int randomList = helpers.random(product);
       String productsInString = productsList.get(randomList).getText();
        System.out.println(productsInString);
        Thread.sleep(4000);
       productsList.get(randomList).click();
      return productsInString;

    }

    //for crossing pop up
   @FindBy(css = ".newsletter__close")
    private WebElement cross;

    public void del() throws InterruptedException {
        cross.click(); //pop up
    }
    //for only coats and jackets not for bags
    @FindBy(css=".attribute-selector__button--btn-min")
    private List<WebElement> sizes;
    public void size(String item) throws InterruptedException {
        for (WebElement lists: sizes){
            if(lists.getText().equalsIgnoreCase(item)){
                Thread.sleep(3000);
                lists.click();
                break;
            }
        }
    }
    //add to basket
    @FindBy(css = ".add-to-bag__add")
    private WebElement add;
   // @FindBy(css = ".add-to-bag")
   // private WebElement add;
    public void atb() throws InterruptedException {
      helpers.jse();
     // driver.findElement(By.cssSelector(".product-page__bag-adding--wishlist-toggle")).click();
      Thread.sleep(3000);
        add.click();
    }
    @FindBy(css=".slider__output-left")
    private WebElement source;
    @FindBy(css="..slider__output-right")
    private WebElement target;
    public void price(WebElement source,WebElement target){
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).build().perform();

    }
}
