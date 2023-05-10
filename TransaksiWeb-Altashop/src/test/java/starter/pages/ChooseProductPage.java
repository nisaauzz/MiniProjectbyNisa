package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChooseProductPage extends PageObject {
    // =============================== Locator ===============================
    private By buttonBeli() {
        return By.xpath("//span[text()='Beli']");
    }
    private By titleCart() {
        return By.xpath("//button[@type='button']");
    }

    private By buttonCart() {
        return By.xpath("//i[@aria-hidden='true']");
    }

    private By detailBtn() {
        return By.xpath("//span[text()='Detail']");
    }

    private By titleDetail() {
        return By.xpath("//button[@aria-label='Rating 4 of 5']");
    }
    private By buttonBayar() {
        return By.id("button-bayar");
    }

    private By historyTransactions() {
        return By.xpath("//div[@class='v-data-table__wrapper']");
    }

    //=============================================== Functional ===================================================


    public void mainPage() { open(); $(buttonCart()).shouldBeVisible();
    }

    public void clickBeli() { $(buttonBeli()).click();
    }

    public void successAddToCart() { $(titleCart()).shouldBeVisible();
    }

    public void clickCart() { $(buttonCart()).click();
    }

    public void clickDetail() { $(detailBtn()).click();
    }

    public void seeDetail() { $(titleDetail()).click();
    }

    public void clickBayar() { $(buttonBayar()).click();
    }

    public void seeHistoryTransactions() { $(historyTransactions()).click();
    }
}
