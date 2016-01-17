package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.Closure;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class LamC extends ExprC {
    IdC arg;
    ExprC body;

    public LamC(IdC arg, ExprC body) {
        this.arg = arg;
        this.body = body;
    }

    public String toString(){
        return getClass().getName()+"("+arg+","+body+")";
    }

    @Override
    public RetValueD interp(Env e) throws Exception {
        return new Closure(this,e);
    }
}
