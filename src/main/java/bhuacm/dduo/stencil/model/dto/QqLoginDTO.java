package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * QQ登录DTO
 *
 * @author Dduo
 * @date 2023/04/06 23:30
 **/
@Data
@Schema(name = "QQ登录DTO", description = "QQ第三方登录所需的参数信息")
public class QqLoginDTO {

    /**
     * openId
     */
    @Schema(description = "QQ用户唯一标识", example = "CE51A85A257A65D8A66A85A257A65D8")
    private String openid;

    /**
     * clientId
     */
    @Schema(description = "应用唯一标识", example = "101474184")
    private String client_id;
}