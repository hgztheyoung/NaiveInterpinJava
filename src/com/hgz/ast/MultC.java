package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.NumValue;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class MultC extends ExprC {
    ExprC le;
    ExprC re;

    public MultC(ExprC le, ExprC re) {
        this.le = le;
        this.re = re;
    }

    @Override
    public RetValueD interp(Env e) throws Exception {
        RetValueD lret = le.interp(e);
        RetValueD rret = re.interp(e);
        if(!(lret instanceof NumValue)){
            throw new Exception("PlusC left operator expect NumValue but get"+lret.toString());
        }
        if(!(rret instanceof NumValue)){
            throw new Exception("PlusC right operator expect NumValue but get"+lret.toString());
        }
        return new NumValue(((NumValue) lret).num*
                ((NumValue) rret).num);
    }

    public String toString(){
        return getClass().getName()+"("+le+","+re+")";
    }
}
