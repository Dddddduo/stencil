package bhuacm.dduo.stencil.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import bhuacm.dduo.stencil.model.vo.*;

/**
 * B站服务控制器
 *
 * @author Dduo
 * @date 2023/03/24 19:48
 **/

@Tag(name = "测试服务", description = "测试服务是否跑通")
@RestController("/test")
public class TestController {
    @PostMapping("/hello")
    @Operation(summary = "获取测试信息", description = "返回一个简单的测试消息") // 替换 @ApiOperation
    public Result<String> biliUpload() {
        System.out.println("Hello Dduo");
        return Result.success("Hello Dduo");
    }
}
