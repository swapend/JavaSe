package project01_sort;

public class Data implements Comparable<Data> {
    int number;
    String name;

    public Data(String name, int number) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Data o) {
        return o.number - this.number;
    }
}
