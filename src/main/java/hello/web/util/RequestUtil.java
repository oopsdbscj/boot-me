package hello.web.util;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tab chan 10/19/2017
 */
public class RequestUtil {

    public static String getString(String sKey, HttpServletRequest request) {
        String sReturn = "";
        if (request.getParameterValues(sKey) != null) {
            sReturn = "";
            String[] sArray = request.getParameterValues(sKey);

            for(int i = 0; i < sArray.length - 1; ++i) {
                sReturn = sReturn + new String(sArray[i]) + ",";
            }

            sReturn = sReturn + new String(sArray[sArray.length - 1]);
        }

        return sReturn;
    }
}
