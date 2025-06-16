package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * Git用户信息DTO
 *
 * @author Dduo
 */
@Data
@Schema(name = "Git用户信息DTO", description = "存储Git用户基本信息的数据传输对象")
public class GitUserInfoDTO {

    /**
     * 用户id
     */
    @Schema(description = "用户唯一标识符", example = "12345678")
    private String id;

    /**
     * 头像
     */
    @Schema(description = "用户头像URL地址", example = "https://avatars.githubusercontent.com/u/12345678?v=4")
    private String avatar_url;

    /**
     * 昵称
     */
    @Schema(description = "用户显示昵称", example = "Dduo")
    private String name;

    /**
     * 登录名
     */
    @Schema(description = "用户登录账号", example = "Dddddduo")
    private String login;
}