package com.keydak.find.webmvc.findserver.controller;

import com.keydak.find.common.log.LogUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/6/17.
 */
@Controller
@RequestMapping("/find")
public class FindController {
     @RequestMapping(value="/learn",method={RequestMethod.POST,RequestMethod.GET})
     public @ResponseBody ModelMap learnFingerPrintPost(@RequestBody JSONObject jsonObj){
         LogUtil.info(this.getClass(),"FingerPrint:"+jsonObj.getString("userName"));
         ModelMap result=new ModelMap();
         result.put("success",true);
         result.put("message","Inserted fingerprint containing 23 APs for zack at zakhome floor 2 office");
         return result;
     }

    @RequestMapping(value="/learn1",method={RequestMethod.GET})
    public @ResponseBody ModelMap test(){
        LogUtil.info(this.getClass(),"请求已经进来");
        ModelMap result=new ModelMap();
//        FingerPrint insFingerPrint=new FingerPrint();
//        insFingerPrint.setGroup("cml");
//        insFingerPrint.setUserName("hzc");
//        insFingerPrint.setLocation("yongtai");
//        insFingerPrint.setTime(System.currentTimeMillis());
//        Router insRouter1=new Router();
//        insRouter1.setMac("AA:AA:AA:AA:AA:AA");
//        insRouter1.setRssi(-45);
//        Router insRouter2=new Router();
//        insRouter2.setMac("BB:BB:BB:BB:BB:BB");
//        insRouter2.setRssi(-46);
//        ArrayList<Router> wifiFingerPrint=new ArrayList<Router>();
//        wifiFingerPrint.add(insRouter1);
//        wifiFingerPrint.add(insRouter2);
//        insFingerPrint.setWifiFingerPrint(wifiFingerPrint);
        result.put("detail","send message succeed");
       // result.put("fingerPrint",insFingerPrint);
        return result;
    }
}
