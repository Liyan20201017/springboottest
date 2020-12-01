package com.zkr.test.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author: liyan
 * @date: 2020-12-01 9:41
 * @description:
 */
@Repository
public interface IDao {

    List<Map> show();

}
