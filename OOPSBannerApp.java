

class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = createBanner();   
        printBanner(banner);                
    }

    public static String[] createBanner() {

        return new String[] {

            " *****   *****   ****    ***** ",
            "*     * *     *  *   *  *      ",
            "*     * *     *  ****    *****  ",
            "*     * *     *  *           *  ",
            " *****   *****   *       *****  "
        };
    }

    
    public static void printBanner(String[] banner) {

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
