package com.anup.ai.platform.tools;

import java.util.Map;

public interface Tool {

    String name();

    Object execre(Map<String, Object> params);
}
