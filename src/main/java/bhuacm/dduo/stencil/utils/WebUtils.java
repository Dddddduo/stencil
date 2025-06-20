package bhuacm.dduo.stencil.utils;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 前端返回工具
 *
 * @author Dduo
 */
@Slf4j
public class WebUtils {

    /**
     * 将字符串渲染到客户端
     *
     * @param response 渲染对象
     * @param string   待渲染的字符串
     */
    public static void renderString(HttpServletResponse response, String string) {
        try {
            response.setStatus(200);
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            PrintWriter writer = response.getWriter();
            writer.print(string);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            log.error("renderString is error, {}", e.getMessage());
        }
    }

}