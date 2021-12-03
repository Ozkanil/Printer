package Fall2021;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {

        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (tonerAmount + tonerLevel > 100) {
                return -1;
            } else {
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = 0;
        if (duplex) {
            pagesToPrint = pages / 2 + pages % 2;

            System.out.println("The Printer is printing in duplex mode.");

        } else {
            pagesToPrint = pages;

        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;


    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}


