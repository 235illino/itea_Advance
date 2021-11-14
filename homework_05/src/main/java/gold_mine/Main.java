package gold_mine;

public class Main {
    public static void main(String[] args) {
        Mine mine = new Mine();
        Worker worker1 = new Worker(mine);
        Worker worker2 = new Worker(mine);
        Worker worker3 = new Worker(mine);
        Baracks baracks = new Baracks(mine);

    }
}
