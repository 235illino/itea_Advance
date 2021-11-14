package gold_mine;

public class Mine {
    private volatile int gold = 1000;
    private boolean isFinish = false;

    public int getGold() {

            return gold;

    }

    public void setGold(int gold) {

            this.gold = gold;

    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }
}
