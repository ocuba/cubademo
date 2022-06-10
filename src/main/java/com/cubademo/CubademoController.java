package com.cubademo;

import io.micronaut.http.annotation.*;

@Controller("/cubademo")
public class CubademoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}