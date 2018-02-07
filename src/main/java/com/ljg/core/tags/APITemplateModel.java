package com.ljg.core.tags;

import static freemarker.template.ObjectWrapper.DEFAULT_WRAPPER;

import com.ljg.common.utils.LoggerUtils;
import com.ljg.common.utils.SpringContextUtil;
import com.ljg.core.statics.Constant;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

import java.util.HashMap;
import java.util.Map;

/**
 * Freemarker 自定义标签 API公共入口
 *
 * @author w24164
 * @create 2018-02-07 15:30
 */
public class APITemplateModel extends WYFTemplateModel {

    @Override
    @SuppressWarnings({  "unchecked" })
    protected Map<String, TemplateModel> putValue(Map params)
            throws TemplateModelException {

        Map<String, TemplateModel> paramWrap = null ;
        if(null != params && params.size() != 0 || null != params.get(Constant.TARGET)){
            String name =  params.get(Constant.TARGET).toString() ;
            paramWrap = new HashMap<String, TemplateModel>(params);

            /**
             * 获取子类，用父类接收，
             */
            SuperCustomTag tag =  SpringContextUtil.getBean(name,SuperCustomTag.class);
            //父类调用子类方法
            Object result = tag.result(params);

            //输出
            paramWrap.put(Constant.OUT_TAG_NAME, DEFAULT_WRAPPER.wrap(result));
        }else{
            LoggerUtils.error(getClass(), "Cannot be null, must include a 'name' attribute!");
        }
        return paramWrap;
    }






}