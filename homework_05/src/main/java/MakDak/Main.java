package MakDak;

public class Main {

    public static void main(String[] args) {
        BoxOffice boxOffice = new BoxOffice();
        Client client = new Client(boxOffice);
        Client client2 = new Client(boxOffice);
        Client client3 = new Client(boxOffice);
        Client client4 = new Client(boxOffice);
        Client client5 = new Client(boxOffice);
    }



}
