public class Bingo {
    public String BingoName;

    // Konstruktor untuk menginisialisasi nama hewan
    public Bingo(String BingoName) {
        this.BingoName = BingoName;
    }

    // Metode untuk menghasilkan dan mencetak lirik lagu
    public void printSong() {
        // Bagian pengantar lagu
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        
        // Bagian pertama
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("B-I-N-G-O");
        System.out.println("And " + BingoName + " was his name-o.");

        // Bagian kedua
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        System.out.println("(clap)-I-N-G-O");
        System.out.println("(clap)-I-N-G-O");
        System.out.println("(clap)-I-N-G-O");
        System.out.println("And " + BingoName + " was his name-o.");

        // Bagian ketiga
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println("(clap)-(clap)-N-G-O");
        System.out.println("And " + BingoName + " was his name-o.");

        // Bagian keempat
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println("(clap)-(clap)-(clap)-G-O");
        System.out.println("And " + BingoName + " was his name-o.");

        // Bagian kelima
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println("(clap)-(clap)-(clap)-(clap)-O");
        System.out.println("And " + BingoName + " was his name-o.");

        // Bagian terakhir
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + BingoName + " was his name-o.");
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println("(clap)-(clap)-(clap)-(clap)-(clap)");
        System.out.println("And " + BingoName+ " was his name-o.");
    }
}
