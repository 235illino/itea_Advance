package gold_mine;

public class Worker extends Thread {
    private int mineSpeed = 1000;
    private Mine mine;
    private int workerGold = 0;


    public Worker(Mine mine) {
        this.mine = mine;
        this.setName("Worker#" + this.getName().split("-")[1]);
        start();
    }

    @Override
    public void run() {
        while (mine.getGold() != 0) {
            synchronized (mine) {
                if (mine.getGold() < 3) {
                    workerGold = workerGold + mine.getGold();
                    mine.setGold(0);
                    mine.setFinish(true);
                    System.out.println(this.getName() + " " + this.workerGold);
                    return;
                }
                workerGold = workerGold + 3;
                mine.setGold(mine.getGold() - 3);
                System.out.println(this.getName() + " " + this.workerGold);
            }
            try {
                Thread.sleep(mineSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
