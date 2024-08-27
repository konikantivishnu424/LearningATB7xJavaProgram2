package August.ex_11082024.RealLifeExamples;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c = new Chrome();
        String s = c.openBrowser("Chrome");
        System.out.println(s);
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");


        Firefox f =new Firefox();
        f.openBrowser("ff");
        f.closeBrowser("ff");
        f.takescreenshot();
    }
}
