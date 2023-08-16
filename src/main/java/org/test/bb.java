package org.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: 常兆海
 * @Description:
 * @DateTime: 2023/6/17 23:44
 **/
public class bb {
    public String getTimeStampString(long timestamp,String format ,int timestampType)
    {
        if (format == null || format.length() <=0)
        {
            return  null;
        }
        if (timestampType == 1)
        {
            //如果时间戳格式是秒，需要江时间戳变为毫秒
            timestamp = timestamp * 1000L;
        }
        Date dateTime = new Date(timestamp);
        // 格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String timeString = sdf.format(dateTime);
        return  timeString;
    }
}
