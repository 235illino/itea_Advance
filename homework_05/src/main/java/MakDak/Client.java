package MakDak;

public class Client extends Thread {
    private BoxOffice boxOffice;



    public Client(BoxOffice boxOffice) {
        this.boxOffice = boxOffice;
        start();
    }

    @Override
    public void run() {

            synchronized (boxOffice) {
                boxOffice.serviceClient();
                if (!boxOffice.isOpen()) {
                    return;
                }

        }
    }
}
