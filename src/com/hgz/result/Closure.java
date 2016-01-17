package com.hgz.result;

import com.hgz.Env;
import com.hgz.ast.LamC;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public class Closure extends RetValueD{
    public LamC fundef;
    public Env  env;

    public Closure(LamC fundef, Env env) {
        this.fundef = fundef;
        this.env = env;
    }

    public String toString() {
        return getClass().getName()+"("+fundef+","+env+")";
    }
}
