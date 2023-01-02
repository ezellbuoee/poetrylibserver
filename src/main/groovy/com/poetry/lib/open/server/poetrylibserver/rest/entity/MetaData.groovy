package com.poetry.lib.open.server.poetrylibserver.rest.entity

import groovy.transform.builder.Builder

@Builder
class MetaData {

    String author
    Date createdDate
    Date lastModified
}
