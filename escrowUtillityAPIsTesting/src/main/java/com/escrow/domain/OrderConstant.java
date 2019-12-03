package com.escrow.domain;

public class OrderConstant {


    public static final String WEB_TOPIC_PRICE_MATCH = "web_topic_price_match";

    public static final String WEB_TYPE_ORDER_BOOK = "web_type_order_book";
    public static final String WEB_TYPE_ORDER_CANCEL = "web_type_order_cancel";

    public static final String WEB_TOPIC_ORDER_MATCH = "web_topic_order_match";

    public static final String WEB_TYPE_MATCH_DATA = "web_type_match_data";

    public static final String WEB_TOPIC_ORDER_CANCEL = "web_topic_order_cancel";

    public static final String WEB_TYPE_CANCEL_DATA = "web_type_cancel_data";

    public static final String WEB_TOPIC_SYMBOL = "web_topic_symbol";

    public static final String WEB_TYPE_ADD_SYMBOL = "web_type_add_symbol";

    public static final String ORDER_TYPE_BUY = "BUY";
    public static final String ORDER_TYPE_SELL = "SELL";

    public static final String ORDER_TYPE_LIMIT = "limit";
    public static final String ORDER_TYPE_MARKET = "market";
    public static final String ORDER_TYPE_STOP_LOSS = "stop_loss";
    public static final String ORDER_TYPE_TAKE_PROFIT_LIMIT = "take_profit";

    public static final String ORDER_STATUS_NEW = "new";
    public static final String ORDER_STATUS_OPEN = "open";
    public static final String ORDER_STATUS_PARTIAL_FILL = "partial_fill";
    public static final String ORDER_STATUS_FILLED = "filled";
    public static final String ORDER_STATUS_CANCEL = "canceled";
    public static final String ORDER_STATUS_CANCELING = "canceling";


    public static final String COL_ORDER_HISTORY = "order_history";
    public static final String COL_TRADE_HISTORY = "matching_history";
    public static final String COL_STOP_ORDER = "stop_order";
    public static final String COL_CANCEL_EVENT_HISTORY = "event_cancel_history";
    public static final String COL_EVENT_MATCHING_ERROR = "event_matching_error";
    public static final String COL_EVENT_CANCEL_ERROR = "event_cancel_error";
    public static final String COL_EVENT_CANCEL_PENDING = "event_cancel_pending";
    public static final String COL_MARKET_ORDER_ID_MAPPING = "market_order_id_mapping";
    public static final String COL_EVENT_MATCHING_PENDING = "event_matching_pending";
    public static final String IEO_TRANSACTIONS_HISTORY= "ieo_transactions";

    public static final String RATIO_MARKET_ORDER_BUY = "1.1";
    public static final String RATIO_MARKET_ORDER_SELL = "0.9";
}
