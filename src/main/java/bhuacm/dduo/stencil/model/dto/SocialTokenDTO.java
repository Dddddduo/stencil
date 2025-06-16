package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

/**
 * 第三方token
 *
 * @author Dduo
 */
@Data
@Builder
@Schema(name = "SocialTokenDTO", description = "第三方登录获取的令牌信息")
public class SocialTokenDTO {

    /**
     * 开放id
     */
    @Schema(description = "第三方平台唯一标识", example = "o1234567890abcdef1234567890")
    private String openId;

    /**
     * 访问令牌
     */
    @Schema(description = "访问令牌", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    private String accessToken;

    /**
     * 登录类型
     */
    @Schema(description = "登录类型（1-微信，2-QQ，3-GitHub等）", example = "1")
    private Integer loginType;
}