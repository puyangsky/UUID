package com.springapp.service;

import com.springapp.Util.Base62;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by puyangsky on 2016/11/21.
 */
@Service
public class ServiceImpl {
    // begin from 62^4, so len(url) >= 5
    private static AtomicLong indexer = new AtomicLong((int)Math.pow(62, 4));

    public String getUrl() {
        return Base62.encode(indexer.getAndIncrement());
    }

    public static void main(String[] args) {
//        System.out.println(getUrl());
    }
}
