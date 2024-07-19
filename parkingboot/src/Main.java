//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int length = 180;
        int width = 120;
        int surface = length * width;
        int permiter = (length + width)*2;
        float ratio = (float) width / length;
        System.out.println("Le périmetre de la voiture es de : "+ permiter);
        System.out.println("La surface au sol de la voiture est de: "+ surface);
    }
}