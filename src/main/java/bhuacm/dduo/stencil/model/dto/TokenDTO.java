package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Token
 *
 * @author Dduo
 */
@Data
@Schema(name = "TokenDTO", description = "认证令牌信息")
public class TokenDTO {

    /**
     * 访问令牌
     */
    @Schema(description = "JWT访问令牌", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    private String access_token;

    /**
     * 过期时间（秒）
     */
    @Schema(description = "令牌过期时间（单位：秒）", example = "3600")
    private String expires_in;

    /**
     * 刷新token
     */
    @Schema(description = "用于刷新访问令牌的凭证", example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    private String refresh_token;
}