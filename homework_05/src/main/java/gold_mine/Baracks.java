package gold_mine;

public class Baracks extends Thread{
    private Worker worker;
    private Mine mine;

    public Baracks(Mine mine) {
        this.mine = mine;
        start();
    }

    public Worker produceWorker () {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return new Worker(mine);

    }


    @Override
    public void run() {
        while (true) {
            if (mine.isFinish()) return;
            produceWorker();
        }
    }
}
