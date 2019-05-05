package com.example.cameraalbumtest;

import com.zsoft.signala.ConnectionState;

/**
 * Created by yby on 2017/10/30
 */

public class ConnectEvent {
    private ConnectionState state;

    public ConnectEvent(ConnectionState state) {
        this.state = state;
    }

    public ConnectionState getState() {
        return state;
    }
}
