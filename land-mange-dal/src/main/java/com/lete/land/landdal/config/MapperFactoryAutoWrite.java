package com.lete.land.landdal.config;

import com.lete.land.landdal.entity.ExitFamersApply;
import com.lete.land.landdal.vo.exitMange.ExitApplyVo;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;

/**
 * Created by WJ on 2019/5/15 0015
 */
@Component
public class MapperFactoryAutoWrite  extends ConfigurableMapper {

    protected void configure(MapperFactory factory) {
        factory.classMap(ExitApplyVo.class, ExitFamersApply.class)
                .register();
    }
}
