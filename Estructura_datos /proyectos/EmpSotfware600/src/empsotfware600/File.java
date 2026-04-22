package empsotfware600;

import java.time.LocalDate;

public class File {

    private int code;
    private String name;
    private int size;
    private LocalDate date;

    public File(int code, String name, int size) {
        this.code = code;
        this.name = name;
        this.size = size;
        this.date = LocalDate.now();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "#" + code + "   " + name + "   size: " + size + "  date: " + date;
    }

}
