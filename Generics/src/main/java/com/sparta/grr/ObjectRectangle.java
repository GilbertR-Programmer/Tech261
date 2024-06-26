package com.sparta.grr;

public class ObjectRectangle {
    private Object width;
    private Object height;

    public ObjectRectangle(Object width, Object length) {
        this.width = width;
        this.height = length;
    }

    public Object getWidth() {
        return width;
    }

    public void setWidth(Object width) {
        this.width = width;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }
}
