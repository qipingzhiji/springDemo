package com.test.entity;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by zhang_htao on 2019/8/10.
 */
@Data
public class CollectionTest {
    private String[] strs;
    private List<Object> lists;
    private Map<String,Object> maps;
}
