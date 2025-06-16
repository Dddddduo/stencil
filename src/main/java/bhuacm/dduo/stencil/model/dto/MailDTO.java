package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * 邮箱DTO
 *
 * @author Dduo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "邮箱DTO", description = "邮件发送所需的参数信息")
public class MailDTO {

    /**
     * 接收者邮箱号
     */
    @Schema(description = "接收者邮箱地址", example = "recipient@example.com")
    private String toEmail;

    /**
     * 主题
     */
    @Schema(description = "邮件主题", example = "测试邮件")
    private String subject;

    /**
     * 内容
     */
    @Schema(description = "邮件正文内容（普通文本或HTML）", example = "这是一封测试邮件")
    private String content;

    /**
     * 内容信息
     */
    @Schema(description = "邮件模板中使用的动态变量", example = "{\"username\":\"张三\",\"code\":\"123456\"}")
    private Map<String, Object> contentMap;

    /**
     * 邮件模板
     */
    @Schema(description = "邮件模板名称", example = "verification_code")
    private String template;
}