package com.zyt.controller;

import com.zyt.entity.Result;
import com.zyt.entity.ResultCode;
import com.zyt.entity.Users;
import com.zyt.service.UserInfoManagerService;
import com.zyt.utils.RSAUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.controller
 * @ClassName: UserInfoManagerController
 * @Author: zhou_yangtao@yeah.net
 * @Description: 用户信息管理模块控制层
 * @Date: 11:02 2021/2/9
 * @Version: 1.0
 */
@Controller
@RequestMapping("/userInfoManager")
public class UserInfoManagerController {

    private Logger logger = LoggerFactory.getLogger(UserInfoManagerController.class);

    @Autowired
    private UserInfoManagerService userInfoManagerService;

    /**
     * @Method: GetUserIsFinishedRegsiter
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:查看当前手机号下是否已经有人注册
     * @Return: com.zyt.entity.Result
     * @Exception:
     * @Date: 2021/2/9 11:04
     * @Param: * @param registerPhone
     * @Return: com.zyt.entity.Result
     */
    @RequestMapping(value = "/getUserIsFinishedRegsiter",method = RequestMethod.POST)
    @ResponseBody
    public Result GetUserIsFinishedRegsiter(@RequestParam(value = "registerPhone",required = false)String registerPhone){
        //如若传入参数不为空，则进行查询
        List<Users> usersList = null;
        if (registerPhone != null){
            usersList = this.userInfoManagerService.GetUserIsFinishedRegsiter(registerPhone);
        }
        //若返回结果不为空，则进行封装
        if(usersList.size() == 0){
            return  Result.success(ResultCode.SUCCESS);
        }
        return  Result.failure(ResultCode.RESULE_DATA_NONE);
    }

    /**
     * @Method: GetPublicKey
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:获取公钥秘钥
     * @Return: com.zyt.entity.Result
     * @Exception:
     * @Date: 2021/2/9 14:15
     * @Param: * @param
     * @Return: com.zyt.entity.Result
     */
    @RequestMapping(value = "/getPublicKey",method = RequestMethod.POST)
    @ResponseBody
    public Result GetPublicKey(){
        String publicKey = RSAUtil.getPublicKey();
        return  Result.success(ResultCode.SUCCESS,publicKey);
    }


    /**
     * @Method: AddUserRegisterInfos
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:用户注册信息注入
     * @Return: com.zyt.entity.Result
     * @Exception:
     * @Date: 2021/2/9 12:19
     * @Param: * @param infos
     * @Return: com.zyt.entity.Result
     */
    @RequestMapping(value = "/addUserRegisterInfos",method = RequestMethod.POST)
    @ResponseBody
    public Result AddUserRegisterInfos(@RequestBody String [] infos){

        int result = this.userInfoManagerService.AddUserRegisterInfos(infos);
        return  null;
    }

}
