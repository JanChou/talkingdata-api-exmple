package com.talkingdata.api.example.test;

import com.talkingdata.api.example.client.TalkingDataHttpClient;
import net.sf.json.JSONObject;

import java.io.IOException;

/**
 * Created by xiaolong on 2015/4/17.
 */
public class TestTalkingDataAPI {
    public static void main(String[] args) throws IOException {
        //��ѯһ��ʱ�䷶Χ�ڣ�ÿ�յ������û�
        String api_url = "https://api.talkingdata.com/metrics/app/v1";
        JSONObject filter = new JSONObject();
        filter.put("start", "2015-04-01");
        filter.put("end", "2015-04-07");
        filter.put("platformid_list", new int[]{1});
        JSONObject params = new JSONObject();
        params.put("filter", filter);
        params.put("metrics", new String[]{"newuser"});
        params.put("groupby", "daily");
        params.put("accesskey", "fb46*****e294be483fa*****a12be35");//accesskey should be replaced
        System.out.println(TalkingDataHttpClient.doPost(api_url, params));

        //��ѯ version list�������Ҫ����ƽ̨�������Ӧfilter
        String query_url = "https://api.talkingdata.com/metrics/app/v1/versionlist";
        params = new JSONObject();
        params.put("accesskey", "fb46*****e294be483fa*****a12be35");//accesskey should be replaced
        System.out.println(TalkingDataHttpClient.doPost(query_url, params));
    }
}
