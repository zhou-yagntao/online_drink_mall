package com.zyt;


import com.zyt.constant.EncrypteDecrypte;
import com.zyt.utils.AESUtils;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest
{
    @Autowired
    private RestHighLevelClient client;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws Exception {
        final  String sale = "zhou_yangtao_aes";
        String pass = "liuBei_0427%";
        System.out.println("加密前数据:"+pass);
        String encrypt = AESUtils.encrypt(pass, sale);
        System.out.println("加密后数据:"+encrypt);
        String decrty = AESUtils.decrypt(encrypt,sale);
        System.out.println("解密后数据:"+decrty);
    }

}
