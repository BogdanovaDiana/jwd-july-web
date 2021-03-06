package com.epam.jwd.controller.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;

public class CurrentDateTimeTag extends SimpleTagSupport {

    private static final String TAG_OUTPUT = "<h5>Current time: %s</h5>";

    @Override
    public void doTag() throws JspException {
        final LocalDateTime currentTime = LocalDateTime.now();
        final JspWriter out = getJspContext().getOut();
        try {
            out.println(String.format(TAG_OUTPUT, currentTime));
        } catch (IOException e) {
            throw new JspException(e);
        }
    }
}
