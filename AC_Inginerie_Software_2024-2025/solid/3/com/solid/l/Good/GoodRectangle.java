package com.solid.l.Good;

public class GoodRectangle implements Shape{
    private int height;
    private int width;
  @Override
    public int getArea()
   {
      return this.width*this.height;
   }
   public GoodRectangle(int h,int w)
   {
       this.height=h;
       this.width=w;
   }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
