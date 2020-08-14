package pl.employee.enums;

public enum ChooseList {
    EXIT(0), ADD(1), SEARCH(2), SHOW_ALL(3);

    private int number;

    ChooseList(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}
