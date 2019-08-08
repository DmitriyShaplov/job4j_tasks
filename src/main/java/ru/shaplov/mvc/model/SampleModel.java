package ru.shaplov.mvc.model;

import java.util.Objects;

/**
 * @author shaplov
 * @since 08.08.2019
 */
public class SampleModel {
    private String title;
    private String desc;
    private String time;
    private int number;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getTime() {
        return time;
    }

    public int getNumber() {
        return number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleModel that = (SampleModel) o;
        return number == that.number && Objects.equals(title, that.title)
                && Objects.equals(desc, that.desc)
                && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, desc, time, number);
    }
}
