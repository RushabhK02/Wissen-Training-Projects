package com.shopping.txns.service;

import com.shopping.txns.web.TxnResponse;

public interface TxrService {

	TxnResponse txr(double amount, String fromAccNum, String toAccNum);
}
