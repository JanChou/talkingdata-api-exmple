package com.talkingdata.api.example.test;

import com.talkingdata.api.example.client.TalkingDataHttpClient;
import net.sf.json.JSONObject;

import java.io.IOException;

/**
 * Created by xiaolong on 2015/4/17.
 */
public class TestTalkingDataAPI {
    public static void main(String[] args) throws IOException {
        //api url
        String api_url = "https://www.talkingdata.com/openapi-analytics/olap/data.json/query";
        JSONObject filter = new JSONObject();
        filter.put("start","2015-04-01");
        filter.put("end","2015-04-07");
        filter.put("platformid_list",new int[]{1});
        JSONObject params = new JSONObject();
        params.put("filter",filter);
        params.put("metrics",new String[]{"newuser"});
        params.put("groupby","day");
        params.put("accesskey","fb46c6980e294be483faf9dc2a12be35");
        System.out.println(TalkingDataHttpClient.doPost(api_url, params));
    }
}
