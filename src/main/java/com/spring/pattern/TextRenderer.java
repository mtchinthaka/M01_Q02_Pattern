package com.spring.pattern;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class TextRenderer {
    private final DefaultFontStyleRenderer defaultFontStyleRenderer;
    private final DefaultColorRenderer defaultColorRenderer;
    private final DefaultFontWeightRenderer defaultFontWeightRenderer;

    public void render(String renderingStyle) {
        log.info("rendering {}", renderingStyle);
    }
}
