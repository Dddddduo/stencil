package bhuacm.dduo.stencil.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Canal监听数据DTO
 *
 * @author Dduo
 * @see <a href="https://www.bookstack.cn/read/tidb-6.1-zh/ticdc-ticdc-canal-json.md">消息格式</a>
 **/
@Data
@Schema(name = "Canal监听数据DTO", description = "Canal监听MySQL变更的数据结构")
public class CanalDTO {

    /**
     * Row 所在的 Database 的名字
     */
    @Schema(description = "数据库名", example = "user_db")
    private String database;

    /**
     * Row 所在的 Table 的名字
     */
    @Schema(description = "表名", example = "user_info")
    private String table;

    /**
     * 该条消息是否为 DDL事件
     */
    @Schema(description = "是否为DDL事件", example = "false")
    private Boolean isDdl;

    /**
     * 事件类型（QUERY、INSERT...)
     */
    @Schema(description = "事件类型", example = "INSERT")
    private String type;

    /**
     * 当 isDdl 为 false 时，记录每一列的名字及其数据值
     */
    @Schema(description = "变更数据列表", example = "[{\"id\": 1, \"name\": \"张三\"}]")
    private List<Map<String, Object>> data;

    /**
     * 产生该条消息的事件发生时的13位时间戳
     */
    @Schema(description = "事件发生的13位时间戳", example = "1628345678901")
    private Long es; // 修正为Long类型，更适合存储13位时间戳
}