package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * B站IP地址返回DTO
 *
 * @author Dduo
 * @date 2024/06/21 22:52
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "B站IP地址返回DTO", description = "B站IP地址查询返回的数据结构")
public class BiliIpInfoDTO {

    /**
     * 状态码
     */
    @Schema(description = "状态码", example = "0")
    private Integer code;

    /**
     * 提示信息
     */
    @Schema(description = "提示信息", example = "success")
    private String message;

    /**
     * 提示信息
     */
    @Schema(description = "提示信息", example = "success")
    private String msg;

    /**
     * 返回数据
     */
    @Schema(description = "IP地址详细信息")
    private IpInfoData data;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Schema(name = "IP地址详细信息", description = "IP地址的地理位置和网络信息")
    public static class IpInfoData {

        /**
         * ip地址
         */
        @Schema(description = "IP地址", example = "114.114.114.114")
        private String addr;

        /**
         * country
         */
        @Schema(description = "国家", example = "中国")
        private String country;

        /**
         * province
         */
        @Schema(description = "省份", example = "江苏省")
        private String province;

        /**
         * city
         */
        @Schema(description = "城市", example = "南京市")
        private String city;

        /**
         * 供应商
         */
        @Schema(description = "网络服务提供商", example = "中国移动")
        private String isp;

        /**
         * 纬度
         */
        @Schema(description = "纬度坐标", example = "32.04")
        private String latitude;

        /**
         * 经度
         */
        @Schema(description = "经度坐标", example = "118.78")
        private String longitude;
    }
}