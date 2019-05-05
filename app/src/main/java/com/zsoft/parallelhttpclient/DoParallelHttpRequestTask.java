package com.zsoft.parallelhttpclient;

import android.os.AsyncTask;

import com.turbomanage.httpclient.AsyncCallback;
import com.turbomanage.httpclient.AsyncHttpClient;
import com.turbomanage.httpclient.HttpRequest;
import com.turbomanage.httpclient.android.DoHttpRequestTask;

public class DoParallelHttpRequestTask extends DoHttpRequestTask {

    public DoParallelHttpRequestTask(AsyncHttpClient httpClient,
                                     AsyncCallback callback) {
        super(httpClient, callback);
    }

    public void execute(HttpRequest httpRequest) {
        super.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, httpRequest);
    }
}
