package dev.xuanran.springcloudapi.util;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by XuanRan on 2022/8/14
 */
@Setter
@Accessors(chain = true)
@NoArgsConstructor
public class R {
    public static Integer SUCCESS = 20000;
    public static Integer ERROR = 20001;

    public Boolean success;
    public Integer code;
    public String message;
    public Map<String, Object> data = new HashMap<>();


    public R(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static R ok() {
        R r = new R();
        r.setCode(R.SUCCESS);
        r.setSuccess(true);
        r.setMessage("success");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(R.ERROR);
        r.setSuccess(false);
        r.setMessage("error");
        return r;
    }

    public R success(Boolean bool) {
        this.setSuccess(bool);
        return this;
    }

    public R message(String mes) {
        this.setMessage(mes);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }
}

