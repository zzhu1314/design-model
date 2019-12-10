package com.cigit.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * @Author:zhuzhou
 * @Date: 2019/11/8  15:59
 **/
public class Pointer {
    private int x;
    private int y;

    public Pointer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private Pointer moveRightBy(int x){
        return new Pointer(this.x+x,y);
    }

    public   static final Comparator<Pointer> comparateByxThenY = Comparator.comparing(Pointer::getX).thenComparing(Pointer::getY);


    @Test
    public  void testMoveBy(){
        Pointer pointer = new Pointer(5, 5);
        Pointer pointer1 = new Pointer(5, 5);
        int compare = pointer1.comparateByxThenY.compare(pointer1, pointer);
        System.out.println(compare);
    }
}
