package August.ex_11082024.RealLifeExamples;

public class Firefox extends BaseClass{
    @Override
    String openBrowser(String Browser) {
        System.out.println("Open The Firefox.......");
        //This code is related to chrome only
        return "";
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("Close the firefox------");
        //This code is related to chrome only
        return "";
    }

    @Override
    void takescreenshot() {
        System.out.println("Taking Screenshots-----");
    }
}
