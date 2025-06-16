package bhuacm.dduo.stencil.model.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import static bhuacm.dduo.stencil.enums.StatusCodeEnum.*;

/**
 * 结果返回类
 *
 * @author Dduo
 */
@Data
@Schema(name = "结果返回类", description = "统一API响应格式")
public class Result<T> {

    /**
     * 返回状态
     */
    @Schema(description = "操作结果状态", example = "true")
    private Boolean flag;

    /**
     * 状态码
     */
    @Schema(description = "状态码", example = "200")
    private Integer code;

    /**
     * 返回信息
     */
    @Schema(description = "返回消息", example = "操作成功")
    private String msg;

    /**
     * 返回数据
     */
    @Schema(description = "返回数据")
    private T data;

    public static <T> Result<T> success() {
        return buildResult(true, null, SUCCESS.getCode(), SUCCESS.getMsg());
    }

    public static <T> Result<T> success(T data) {
        return buildResult(true, data, SUCCESS.getCode(), SUCCESS.getMsg());
    }

    public static <T> Result<T> fail(String message) {
        return buildResult(false, null, FAIL.getCode(), message);
    }

    public static <T> Result<T> fail(Integer code, String message) {
        return buildResult(false, null, code, message);
    }

    private static <T> Result<T> buildResult(Boolean flag, T data, Integer code, String message) {
        Result<T> r = new Result<>();
        r.setFlag(flag);
        r.setData(data);
        r.setCode(code);
        r.setMsg(message);
        return r;
    }
}