package com.mkk.werehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class ResponseResult<T> {
    private String code;
    private String message;
    private T data;

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<T>().setCode("200").setMessage("操作成功").setData(data);
    }
}
