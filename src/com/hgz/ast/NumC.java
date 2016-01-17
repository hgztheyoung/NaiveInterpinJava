package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.NumValue;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class NumC extends ExprC {
    double n;

    public NumC(double n) {
        this.n = n;
    }
    public String toString(){
        return getClass().getName()+"("+n+")";
    }

    @Override
    public RetValueD interp(Env e) {
        return new NumValue(n);
    }
}
