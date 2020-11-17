package cn.navz.foomap.bean;

import lombok.Data;

/**
 * @author hym
 * @description foo point info
 * @date 2020/11/17 14:20
 **/
@Data
public class FooPoint {

    private long pointId;

    private double longitude;

    private double latitude;

    private String imgPath;

}
