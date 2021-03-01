package com.ts.tscloud.data;

import com.ts.tscloud.Order;

public interface OrderRepository {
    Order save(Order order);
}
