
package myTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TagDemo extends TagSupport {
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    private String format;
    @Override
    public  int doStartTag() throws JspException{

        SimpleDateFormat sdf=new SimpleDateFormat(this.format);
        JspWriter out=super.pageContext.getOut();
        try{
            out.write(sdf.format(new Date()));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return TagSupport.SKIP_BODY;
    }
}
