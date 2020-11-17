package cn.navz.foomap.bean;

import lombok.Data;

import java.util.List;

/**
 * @author hym
 * @description foo map
 * @date 2020/11/17 14:18
 **/
@Data
public class FooMap {

    private long mapId;

    private List<Long> points;

    private String title;

    private String description;

}
