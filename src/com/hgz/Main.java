package com.hgz;

import com.hgz.ast.*;

public class Main {

    public static void main(String[] args) throws Exception {
        /*
        Env e = new Env();
        e.extEnv("hgz",new NumValue(213));
        e.extEnv("naive",new NumValue(213));
        Env ecopy = new Env(e);
        ecopy.extEnv("gg",new NumValue(123));
        System.out.println(e);
        System.out.println(ecopy);
        */

        Env mt_env = new Env();
        ExprC inpute = new AppC(new LamC(new IdC("x"), new IdC("x")),
                new NumC(213));
        System.out.println(inpute.interp(mt_env));
        //System.out.println(mt_env);   //test env remain the same.

/*
((lambda (y)
     (((lambda (y)
         (lambda (x) (* y 2))) 3) 0)) 4)
*/
        inpute = new AppC(
                new AppC(new LamC(new IdC("x"),
                        new LamC(new IdC("y"),
                                new MultC(new IdC("x"), new IdC("y"))))
                        , new NumC(2))
                , new NumC(3));

        System.out.println(inpute.interp(mt_env));
        System.out.println(new AppC(
                new AppC(new LamC(new IdC("x"),
                        new LamC(new IdC("y"),
                                new MultC(new IdC("x"), new IdC("y"))))
                        , new NumC(2))
                , new NumC(3)));
    }
}
