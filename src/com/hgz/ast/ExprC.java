package com.hgz.ast;

import com.hgz.Env;
import com.hgz.result.RetValueD;

/**
 * Created by hgz92_000 on 2016/1/16.
 */
public abstract class ExprC {
    public abstract RetValueD interp(Env e) throws Exception;
}