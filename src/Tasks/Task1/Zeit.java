package Tasks.Task1;

public class Zeit {
    int sec;
    int min;
    int h;

    public Zeit(int sec, int min, int h) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    public Zeit(int sec) {
        this.sec = sec;
    }

    public Zeit() {
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {

    }
}
