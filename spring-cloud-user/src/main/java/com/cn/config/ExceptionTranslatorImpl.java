package com.cn.config;

import com.cn.exception.GlobalExceptionHandle;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;

/**
 * @author chenning
 * @Classname ExceptionTranslatorImpl
 * @Description 异常翻译
 * @Date 2019/7/8 14:45
 */
public class ExceptionTranslatorImpl implements WebResponseExceptionTranslator {

    @Override
    public ResponseEntity translate(Exception e) throws Exception {
        return ResponseEntity.ok(GlobalExceptionHandle.getExceptionResult(e));
    }

}
