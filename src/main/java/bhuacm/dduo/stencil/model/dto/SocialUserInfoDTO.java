package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

/**
 * 第三方账号信息DTO
 *
 * @author Dduo
 */
@Data
@Builder
@Schema(name = "SocialUserInfoDTO", description = "第三方平台返回的用户信息")
public class SocialUserInfoDTO {

    /**
     * id
     */
    @Schema(description = "第三方平台用户唯一标识", example = "1234567890")
    private String id;

    /**
     * 头像
     */
    @Schema(description = "用户头像URL", example = "https://thirdwx.qlogo.cn/mmopen/...")
    private String avatar;

    /**
     * 昵称
     */
    @Schema(description = "用户昵称", example = "微信用户")
    private String nickname;
}