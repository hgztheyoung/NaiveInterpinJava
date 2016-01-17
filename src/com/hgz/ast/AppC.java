package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.Closure;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class AppC extends ExprC {
    ExprC f;
    ExprC arg;

    public AppC(ExprC f, ExprC arg) {
        this.f = f;
        this.arg = arg;
    }

    @Override
    public RetValueD interp(Env e) throws Exception {
        RetValueD funClosure = f.interp(e);
        if (!(funClosure instanceof Closure)) {
            throw new Exception("interping fun,Expect Closure,but get" + funClosure.toString());
        }
        LamC funbody = ((Closure) funClosure).fundef;
        RetValueD argv = arg.interp(e);
        Env ExtendedEnv = new Env(((Closure) funClosure).env);
        ExtendedEnv.extEnv(funbody.arg.symbol, argv);
        return funbody.body.interp(ExtendedEnv);
    }

    public String toString() {
        return getClass().getName() + "(" + f + "," + arg + ")";
    }
}