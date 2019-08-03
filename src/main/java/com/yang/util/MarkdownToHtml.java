package com.yang.util;


import org.pegdown.PegDownProcessor;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author dalaoyang
 * @Description
 * @project dalaoyang
 * @package com.yang.util
 * @email 397600342@qq.com
 * @date 2018/4/3
 */
@Component
public class MarkdownToHtml {

    public static String markDownToHtml(String makeDownStr) {
        PegDownProcessor pdp = new PegDownProcessor(Integer.MAX_VALUE);
        return pdp.markdownToHtml(makeDownStr);
    }
}
