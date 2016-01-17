package com.hgz.result;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class NumValue extends RetValueD {
    public double num;

    public NumValue(double num) {
        this.num = num;
    }
    public String toString(){
        return getClass().getName()+"("+num+")";
    }
}
