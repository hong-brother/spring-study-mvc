package com.hsnam.servlet.web.frontcontroller.v4;

import com.hsnam.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap
     * @param model
     * @return view
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
