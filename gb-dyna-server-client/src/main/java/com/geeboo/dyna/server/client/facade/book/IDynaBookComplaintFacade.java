package com.geeboo.dyna.server.client.facade.book;

import com.geeboo.common.msg.BaseResponse;
import com.geeboo.common.msg.ObjectResponse;
import com.geeboo.common.msg.PageRestRequest;
import com.geeboo.common.msg.TableResultResponse;
import com.geeboo.dyna.server.client.dto.book.DynaBookComplaintDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${gb-dyna-server}", configuration = {})
public interface IDynaBookComplaintFacade {
    /**
     * 增加
     *
     * @param dto 待新增的实体对象
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint", method = RequestMethod.POST)
    BaseResponse add(@RequestBody DynaBookComplaintDTO dto);

    /**
     * 修改
     *
     * @param dto 待需改的实体对象
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint", method = RequestMethod.PUT)
    BaseResponse update(@RequestBody DynaBookComplaintDTO dto);

    /**
     * 删除
     *
     * @param dto 系统主键
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint", method = RequestMethod.DELETE)
    BaseResponse delete(@RequestBody DynaBookComplaintDTO dto);

    /**
     * 分页查询
     *
     * @param pageRestRequest 分页条件，当前页，每页显示条数
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint/page", method = RequestMethod.POST)
    TableResultResponse<DynaBookComplaintDTO> page(@RequestBody PageRestRequest<DynaBookComplaintDTO> pageRestRequest);

    /**
     * 通过ID获取动态_图书举报表实体
     *
     * @param dto 主键ID
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint/findById", method = RequestMethod.POST)
    ObjectResponse<DynaBookComplaintDTO> findById(DynaBookComplaintDTO dto);

    /**
     * 通过条件获取动态_图书举报表实体
     *
     * @param dto 查询条件
     * @return
     */
    @RequestMapping(value = "/DynaServer/facade/dyna/bookComplaint/findByCondition", method = RequestMethod.POST)
    ObjectResponse<DynaBookComplaintDTO> findByCondition(DynaBookComplaintDTO dto);
}