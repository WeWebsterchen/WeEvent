package com.webank.weevent.broker.util;

/**
 * @author websterchen
 * @version v1.1
 * @since 2019/9/3
 */
public class WeEventConstants {
    /**
     * Max length for topic name.
     */
    public static final Integer TOPIC_NAME_MAX_LENGTH = 64;

    /**
     * topic name encode length.
     */
    public static final Integer TOPIC_NAME_ENCODE_LENGTH = 8;

    /**
     * hash length.
     */
    public static final Integer HASH_LENGTH = 32;

    /**
     * Max length for event id.
     */
    public static final Integer EVENT_ID_MAX_LENGTH = 64;

    /**
     * Max length for event content.
     */
    public static final Integer EVENT_CONTENT_MAX_LENGTH = 10240;

    /**
     * Max length for event extensions.
     */
    public static final Integer EVENT_EXTENSIONS_MAX_LENGTH = 1024;
    /**
     * Event ID split char.
     */
    public static final String EVENT_ID_SPLIT_CHAR = "-";

    /**
     * Extensions prefix char.
     */
    public static final String EXTENSIONS_PREFIX_CHAR = "weevent-";

    /**
     * Extensions will message.
     */
    public static final String EXTENSIONS_WILL_MESSAGE = "weevent-willmessage";

    /**
     * event topic.
     */
    public static final String EVENT_TOPIC = "topic";

    /**
     * event id.
     */
    public static final String EXTENSIONS_EVENT_ID = "eventId";

    /**
     * event topic.
     */
    public static final String EVENT_GROUP_ID = "groupId";

    /**
     * event content.
     */
    public static final String EVENT_CONTENT = "content";

    /**
     * check the API type,this is use for jsonrpc
     */
    public static final String JSONRPCTYPE = "jsonrpc";

    /**
     * check the API type,this is use for restful
     */
    public static final String RESTFULTYPE = "restful";

    /**
     * check the API type,this is use for mqtt
     */
    public static final String MQTTTYPE = "mqtt";

    /**
     * check the API type,this is use for mqtt
     */
    public static final String STOMPTYPE = "stomp";

    /**
     * The prefix of FISCO-BCOS version 1.3.X
     */
    public static final String FISCO_BCOS_1_X_VERSION_PREFIX = "1.3";

    /**
     * The prefix of FISCO-BCOS version 2.X
     */
    public static final String FISCO_BCOS_2_X_VERSION_PREFIX = "2.";

    public static final String FISCO = "fisco";

    public static final String FABRIC = "fabric";
}