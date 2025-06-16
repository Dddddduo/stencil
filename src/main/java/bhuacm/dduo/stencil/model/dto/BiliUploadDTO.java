package bhuacm.dduo.stencil.model.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * B站图片上传返回DTO
 *
 * @author Dduo
 * @date 2024/06/21 21:43
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "B站图片上传返回DTO", description = "B站图片上传接口的返回数据结构")
public class BiliUploadDTO {

    /**
     * 状态码
     */
    @Schema(description = "状态码", example = "0")
    private String code;

    /**
     * 提示信息
     */
    @Schema(description = "提示信息", example = "success")
    private String message;

    /**
     * ttl
     */
    @Schema(description = "TTL值", example = "1")
    private Integer ttl;

    /**
     * 返回数据
     */
    @Schema(description = "上传结果数据")
    private UploadData data;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
    @Schema(name = "上传结果数据", description = "图片上传成功后的详细信息")
    public static class UploadData {
        /**
         * 图片地址
         */
        @Schema(description = "图片URL", example = "https://i0.hdslb.com/bfs/album/123456789.jpg")
        private String imageUrl;

        /**
         * 图片宽度
         */
        @Schema(description = "图片宽度（像素）", example = "1920")
        private Integer imageWidth;

        /**
         * 图片高度
         */
        @Schema(description = "图片高度（像素）", example = "1080")
        private Integer imageHeight;

        /**
         * 图片大小
         */
        @Schema(description = "图片大小（MB）", example = "2.5")
        private Double imgSize;
    }
}