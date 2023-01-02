package com.poetry.lib.open.server.poetrylibserver.rest.entity

import groovy.transform.builder.Builder

@Builder
class Poem {

    MetaData metaValues
    String title
    String content
}
