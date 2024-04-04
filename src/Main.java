public class Main {
    public static void main(String[] args) {
        Plane a = new Plane("АН 21", 50, 900, 30);
        System.out.print(a);
    }

}

class Plane {
    String name;
    int numberOfPassengers;

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Самолёт " + name  +
                ", колличество пассажиров на борту " + numberOfPassengers +
                ", вместимость " + volume +
                ", максимальная скорость " + speed +" км/ч";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private int volume;

    public void setSpeed(int speed) {
        if (speed < 0)
            speed = 0;
        this.speed = speed;
    }

    private int speed;

    public Plane(String named, int volume, int speed, int numberOfPassengers) {
        this.name = named;
        this.volume = volume;
        this.speed = speed;
        this.numberOfPassengers = numberOfPassengers;

    }
}