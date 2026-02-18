class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline Array Initialization
        String[] banner = {
            "OOOO   OOOOO  PPPP    SSSSS",
            "O   O  O   O  P   P  S     ",
            "O   O  O   O  PPPP    SSSSS ",
            "O   O  O   O  P           S ",
            "OOOO   OOOOO  P       SSSSS  "
        };

        // Printing Banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
