package com.zsoft.signala;

import android.content.Context;

import com.zsoft.signala.transport.ITransport;
import com.zsoft.signala.transport.StateBase;

public class Connection extends ConnectionBase {

    public Connection(String url, Context context, ITransport transport) {
        super(url, context, transport);
    }

    @Override
    public void OnError(Exception exception) {

    }

    @Override
    public void OnMessage(String message) {

    }

    @Override
    public void OnStateChanged(StateBase oldState, StateBase newState) {

    }

}
