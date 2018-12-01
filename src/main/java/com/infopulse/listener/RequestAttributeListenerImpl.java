package com.infopulse.listener;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class RequestAttributeListenerImpl implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae){
        ServletRequest request = srae.getServletRequest();
        if(srae.getName().equals("filter")){
            String value = (String)srae.getValue();
            value+=" from listener";
            request.setAttribute("filter", value);
        }
    }
}
