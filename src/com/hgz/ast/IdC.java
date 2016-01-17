package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/17.
 */
public class IdC extends ExprC{
    String symbol;

    public IdC(String symbol) {
        this.symbol = symbol;
    }

    public String toString(){
        return getClass().getName()+"("+symbol+")";
    }

    @Override
    public RetValueD interp(Env e) throws Exception {
        return e.lookup(symbol);
    }
}