package com.zsoft.signala.hubs;


import com.alibaba.fastjson.JSONArray;

import java.util.List;

/// <summary>
///  A client side proxy for a server side hub.
/// </summary>
public interface IHubProxy {

    void On(String eventName, HubOnDataCallback callback);

    void Invoke(String method, List<Object> args, HubInvokeCallback callback);

    void Invoke(String method, JSONArray args, HubInvokeCallback callback);

    //JToken this[String name] { get; set; }
}
