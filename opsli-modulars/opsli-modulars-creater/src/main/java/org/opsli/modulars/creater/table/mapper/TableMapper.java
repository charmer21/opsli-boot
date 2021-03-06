/**
 * Copyright 2020 OPSLI 快速开发平台 https://www.opsli.com
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opsli.modulars.creater.table.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.opsli.modulars.creater.table.entity.CreaterTable;

import java.util.List;


/**
 * @BelongsProject: opsli-boot
 * @Author: Parker
 * @CreateTime: 2020-09-17 13:01
 * @Description: 代码生成器 - 表 Mapper
 */
@Mapper
public interface TableMapper extends BaseMapper<CreaterTable> {

    /**
     * 唯一验证
     * @param entity
     * @return
     */
    Integer uniqueVerificationByTableName(CreaterTable entity);

    /**
     * 更新同步状态 为 已同步
     * @param id
     */
    void renewSyncState(String id);

    /**
     * 获得当前 生成器中所有表名
     * @return
     */
    List<String> findAllByTableName();

}
