package com.webank.weevent.broker.task;


import java.util.List;

import com.webank.weevent.sdk.BrokerException;
import com.webank.weevent.sdk.WeEvent;

/**
 * Block chain interface used by subscribe.
 *
 * @since 2019/08/30
 */
public interface IBlockChain {
    /**
     * idle time for every loop
     *
     * @return time in ms
     */
    int getIdleTime();

    /**
     * current block height
     *
     * @param groupId group id
     * @return block height
     * @throws BrokerException BrokerException
     */
    Long getBlockHeight(String groupId) throws BrokerException;

    /**
     * get data from block chain and it's cache
     *
     * @param blockNum block height
     * @param groupId group id
     * @return list of WeEvent
     * @throws BrokerException BrokerException
     */
    List<WeEvent> loop(Long blockNum, String groupId) throws BrokerException;
}
