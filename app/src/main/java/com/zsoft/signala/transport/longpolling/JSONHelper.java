package com.zsoft.signala.transport.longpolling;

import android.text.TextUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;


public class JSONHelper {

    public static JSONObject ToJSONObject(String text) {
        if (TextUtils.isEmpty(text)) {
            return null;
        }
        JSONObject json;
        try {
            json = JSON.parseObject(text);
        } catch (JSONException e) {
            json = null;
        }
        return json;
    }
}
