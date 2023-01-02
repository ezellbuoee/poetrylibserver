package com.poetry.lib.open.server.poetrylibserver.rest.controller

import com.poetry.lib.open.server.poetrylibserver.rest.service.PoemService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping('/poem')
class PoetryController {

    @Autowired
    private final PoemService poemService

    @GetMapping('/random')
    def getPoems() {
        return ResponseEntity.ok(poemService.anyItem())
    }
}
