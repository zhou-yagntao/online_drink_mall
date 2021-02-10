package com.zyt.service.impl;

import com.zyt.entity.Users;
import com.zyt.mapper.UserMapper;
import com.zyt.service.UserInfoManagerService;
import com.zyt.utils.AESUtils;
import com.zyt.utils.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ProjectName: online_drink_mall
 * @Package: com.zyt.service.impl
 * @ClassName: UserInfoManagerServiceImpl
 * @Author: zhou_yangtao@yeah.net
 * @Description: 用户注册信息管理服务层实现模块
 * @Date: 11:06 2021/2/9
 * @Version: 1.0
 */
@Service(value = "userInfoManagerService")
public class UserInfoManagerServiceImpl implements UserInfoManagerService {

     private Logger logger = LoggerFactory.getLogger(UserInfoManagerServiceImpl.class);

     private  static  final  String  SALE = "zhou_yangtao_AES";

     @Autowired
     private UserMapper userMapper;

     //注入redis
     @Autowired
     private RedisUtil redisUtil;

    /**
     * @Method: GetUserIsFinishedRegsiter
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:查看当前手机号下是否已经有人注册
     * @Return: java.util.List<com.zyt.entity.Users>
     * @Exception:
     * @Date: 2021/2/9 11:07
     * @Param: * @param phoneNum
     * @Return: java.util.List<com.zyt.entity.Users>
     */
    @Override
    public List<Users> GetUserIsFinishedRegsiter(String phoneNum) {
        return this.userMapper.getUserIsFinishedRegsiter(phoneNum) != null ? this.userMapper.getUserIsFinishedRegsiter(phoneNum) :null;
    }

    /**
     * @Method: AddUserRegisterInfos
     * @Author: zhou_yangtao@yeah.net
     * @Version  1.0
     * @Description:添加注册信息
     * @Return: int
     * @Exception:
     * @Date: 2021/2/9 15:36
     * @Param: * @param infos
     * @Return: int
     */
    @Transactional
    @Override
    public int AddUserRegisterInfos(String[] infos) {
        Users users = new Users();
        users.setUserName(infos[0]);
        users.setUserNickName(infos[1]);
        String EncryptePass = null;
        //对密码进行加密处理
        try {
            EncryptePass = AESUtils.encrypt(infos[2],SALE);
        } catch (Exception e) {
            e.printStackTrace();
        }
        users.setLoginPassword(EncryptePass);
        users.setUserIdentity(infos[4]);
        users.setUserPhoneNum(infos[5]);
        logger.info("处理获得的数据信息为:"+users.toString());
        int result = this.userMapper.addUserRegisterInfos(users);
        if (result == 0){
            return  0;
        }
        return 1;
    }
}
