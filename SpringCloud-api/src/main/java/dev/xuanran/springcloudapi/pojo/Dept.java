package dev.xuanran.springcloudapi.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Created by XuanRan on 2022/8/14
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Dept implements Serializable {
    private int id;
    private String deptName;
    private String dbSource;

    public Dept(String deptName) {
        this.deptName = deptName;
    }
}
