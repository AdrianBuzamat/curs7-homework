package ro.fasttrackit.curs7;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = false;
    }

    public boolean hasLiquid() {
        if (availableLiquid > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public int getEmptyVolume() {
        return totalCapacity - availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        if (this.open) {
            System.out.println("The bottle is already opened");
        } else {
            this.open = true;
            System.out.println("The bottle is opened");
        }
    }

    public void close() {
        if (!this.open) {
            System.out.println("The bottle is already closed");
        } else {
            this.open = false;
            System.out.println("The bottle is closed");
        }
    }

    public void volumeConsumed(int volume) {
        if (open == true){
            if (availableLiquid >= volume) {
                System.out.println("You poured " + volume + " ml of liquid.");
                availableLiquid -= volume;
            } else {
                System.out.println("The bottle has only " + availableLiquid + " ml of liquid.");
            }
        } else {
            System.out.println("Open the bottle first!");
        }

    }
}
