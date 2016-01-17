package com.hgz;

import com.hgz.result.RetValueD;
import java.util.LinkedHashMap;

public class Env implements Cloneable{
    LinkedHashMap<String,RetValueD> e;

    public Env(Env env) {
        this.e = (LinkedHashMap<String, RetValueD>) env.e.clone();
    }

    //working as mt-env
    public Env(){
        e = new LinkedHashMap<>();
    }

    public void extEnv(String name,RetValueD value){
        e.put(name,value);
    }

    public RetValueD lookup(String symbol) throws Exception {
        if(e.containsKey(symbol)){
            return e.get(symbol);
        }else{
            throw(new Exception("Look up failed.\nSearching symbol\":"+symbol+"\" in Env\n"+e.toString()));
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("ENV:\n");
        for (String name : e.keySet())
        {
            sb.append(name+":");
            sb.append(e.get(name).toString()+",\n");
        }
        return sb.toString();
    }
}
