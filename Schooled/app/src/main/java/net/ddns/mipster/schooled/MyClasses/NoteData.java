package net.ddns.mipster.schooled.MyClasses;

import android.graphics.Point;

import java.io.Serializable;

/**
 * Created by Chen on 12/03/2017.
 */

public class NoteData implements Serializable {

    private int x1, y1, x2, y2;
    private String text;

    public NoteData(int x1, int y1, int x2, int y2, String text){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.text = text;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
