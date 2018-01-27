package com.senthink.www.web;

import com.senthink.www.response.Message;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by wanwentao@aifocus.ai on 27/01/2018
 */
@Api(value = "/webStatus", description = "interface to front and dvc")
@RestController
public class WebStatusController {


    @RequestMapping(value = "/webStatus")
    public Message sendMsgToDvc() {
        return Message.SUCCESS;
    }
}
