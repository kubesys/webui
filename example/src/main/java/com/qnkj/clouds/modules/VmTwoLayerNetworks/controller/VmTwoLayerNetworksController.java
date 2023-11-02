package com.qnkj.clouds.modules.VmTwoLayerNetworks.controller;

import com.qnkj.clouds.modules.VmTwoLayerNetworks.services.IVmTwoLayerNetworksService;
import com.qnkj.core.base.BaseEntityUtils;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * create by Auto Generator
 * create date 2023-07-09
 * @author Auto Generator
 */

@Slf4j
@Validated
@Controller("VmTwoLayerNetworks")
@RequiredArgsConstructor
@Api(tags = "低代码演示：二层网络资源")
@Scope("prototype")
@RequestMapping("VmTwoLayerNetworks")
public class VmTwoLayerNetworksController {
    private final IVmTwoLayerNetworksService vmtwolayernetworksService;
    private BaseEntityUtils viewEntitys = null;

    @PostConstruct
    public void init() { viewEntitys = BaseEntityUtils.init(this); }

}
