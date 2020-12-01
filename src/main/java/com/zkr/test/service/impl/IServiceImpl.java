package com.zkr.test.service.impl;

import com.zkr.test.dao.IDao;
import com.zkr.test.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: liyan
 * @date: 2020-12-01 9:41
 * @description:
 */

@Service
public class IServiceImpl implements IService {

    @Autowired
    private IDao IDao;

    @Override
    public List<Map> show() {
        return IDao.show();
    }
}
