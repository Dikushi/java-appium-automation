package lib.ui.mobile_web;

import lib.ui.ArticlePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MWArticlePageObject extends ArticlePageObject {

    static {
        TITLE = "css:#content h1";
        FOOTER_ELEMENT = "css:footer";
        SAVE_TO_LIST_BUTTON = "css:#page-actions li#ca-watch";
        OPTIONS_REMOVE_FROM_MY_LIST_BUTTON = "css:#page-actions li#ca-watch.mw-ui-icon-mf-watched watched button";
    }

    public MWArticlePageObject(RemoteWebDriver driver) {
        super(driver);
    }
}
