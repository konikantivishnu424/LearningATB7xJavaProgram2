package August.ex_11082024.RealLifeExamples;

public class Chrome extends BaseClass{
    @Override
    String openBrowser(String Browser) {
        System.out.println("Open The Chrome.......");
        //This code is related to chrome only
        return "";
    }

    @Override
    String closeBrowser(String Browser) {
        System.out.println("Close the chrome------");
        //This code is related to chrome only
        return "";
    }

    @Override
    void takescreenshot() {
        System.out.println("taking Screenshots");
    }
}
