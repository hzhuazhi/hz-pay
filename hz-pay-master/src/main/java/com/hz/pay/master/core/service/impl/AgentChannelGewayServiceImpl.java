package com.hz.pay.master.core.service.impl;

import com.hz.pay.master.core.common.dao.BaseDao;
import com.hz.pay.master.core.common.service.impl.BaseServiceImpl;
import com.hz.pay.master.core.mapper.AgentChannelGewayMapper;
import com.hz.pay.master.core.service.AgentChannelGewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author yoko
 * @Date 2020/9/17 21:21
 * @Version 1.0
 */
@Service
public class AgentChannelGewayServiceImpl<T> extends BaseServiceImpl<T> implements AgentChannelGewayService<T> {
    /**
     * 5分钟.
     */
    public long FIVE_MIN = 300;

    public long TWO_HOUR = 2;

    @Autowired
    private AgentChannelGewayMapper agentChannelGewayMapper;


    public BaseDao<T> getDao() {
        return agentChannelGewayMapper;
    }
}
