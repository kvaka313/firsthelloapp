package com.infopulse.tag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class TagHandler extends TagSupport {

    @Override
    public int doStartTag(){
        JspWriter out=pageContext.getOut();
        try {
            out.println("Hello all");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EVAL_PAGE;
    }
}
