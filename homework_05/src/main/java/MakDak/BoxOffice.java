package MakDak;

public class BoxOffice {
    private final int timeService = 300 + (int) (Math.random() * 500);
    private int pleasedClients = 0;
    private boolean isOpen = true;


    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public synchronized void serviceClient() {
        try {
            Thread.sleep(timeService);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (Math.random() * 100 <= 30) {
            System.out.println("BoxOffice wants to close");
            isOpen = false;
            return;
        }
        pleasedClients++;
        if (pleasedClients == 5) {
            System.out.println("All clients are pleased");
            isOpen = false;
            return;
        }




    }

}
