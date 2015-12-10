package itc;
public class ITC extends Login {
    public static void main(String[] args)  {
        new Login().show();
        new DeleteRecord().setVisible(false);
        new ITCGraphics().setVisible(false);
        new AddRecord().setVisible(false);
    }   
}