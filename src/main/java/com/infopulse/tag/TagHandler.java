package com.infopulse.tag;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class TagHandler extends BodyTagSupport {

    private String name="";
    private String text;
    @Override
    public int doStartTag(){
//        JspWriter out=pageContext.getOut();
//        try {
//            out.println("Hello, "+name);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return EVAL_BODY_BUFFERED;
    }

    @Override
    public int doAfterBody(){
        BodyContent bodyContent =getBodyContent();
        text = bodyContent.getString();


        return SKIP_BODY;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public int doEndTag() {
        JspWriter jspWriter = pageContext.getOut();
        try {
            jspWriter.println(text);
            return BodyTagSupport.EVAL_PAGE;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return BodyTagSupport.EVAL_PAGE;
        }

    }
}

