package bhuacm.dduo.stencil.model.dto;

import bhuacm.dduo.stencil.entity.ChatRecord;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * 聊天记录DTO
 *
 * @author Dduo
 * @date 2023/06/12 10:50
 **/
@Data
@Builder
@Schema(name = "聊天记录DTO", description = "包含聊天记录列表及IP信息的数据传输对象")
public class ChatRecordDTO {

    /**
     * 聊天记录
     */
    @Schema(description = "聊天记录列表", type = "array", implementation = ChatRecord.class)
    private List<ChatRecord> chatRecordList;

    /**
     * ip地址
     */
    @Schema(description = "客户端IP地址", example = "192.168.1.1")
    private String ipAddress;

    /**
     * ip来源
     */
    @Schema(description = "IP地址归属地", example = "中国江苏省南京市")
    private String ipSource;
}