package com.enci;

/**
 * <p> Title: </p>
 * <p> Description: Hessian 远程暴露服务</p>
 *
 * @创建时间
 * @版本 1.00
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * ----------------------------------------
 * <p>
 * ----------------------------------------
 * </pre>
 */
public class HessianServiceImpl implements HessianService {
    public String getNewMessage(String msg) {
        return "HESSIAN --> " + msg;
    }
}
