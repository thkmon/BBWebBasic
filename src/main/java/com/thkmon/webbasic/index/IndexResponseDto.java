package com.thkmon.webbasic.index;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 get 메서드를 생성한다.
// @Setter
// @AllArgsConstructor
@RequiredArgsConstructor // 선언된 모든 final 필드가 포함된 생성자를 생성한다.
public class IndexResponseDto {

    private final String name;
    private final int count;
}