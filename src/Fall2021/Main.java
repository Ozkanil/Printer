package Fall2021;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());

        int pagePrinted = printer.printPages(5);
        System.out.println(pagePrinted);
        System.out.println(printer.getPagesPrinted());
    }

}