package com.poetry.lib.open.server.poetrylibserver.rest.service

import com.poetry.lib.open.server.poetrylibserver.rest.entity.MetaData
import com.poetry.lib.open.server.poetrylibserver.rest.entity.Poem
import org.springframework.stereotype.Service

@Service
class PoemService {

    List<Poem> anyItem() {
        def metaData = MetaData.builder()
                .author('Ezekiel Olasehinde')
                .createdDate(new Date())
                .build()
        def poem = Poem.builder()
                .metaValues(metaData)
                .title('Gift of a thousand skull')
                .content('The dark caves speaks of dark times\n' +
                        'Cruel and deadly the destiny that awaits them\n' +
                        'Such that oracle had emerged years before Adeolu reigns\n' +
                        'Gift of a thousands skull he envisioned; and such none shall escape.\n' +
                        '\n' +
                        'The dark times is long gone\n' +
                        'Masters of the mystic art had failed them \n' +
                        'Even the strongest mage amongst them chickened\n' +
                        'This, a thousand skull with a seat of honor; they feared\n' +
                        '\n' +
                        'These dried skulls tells a story\n' +
                        'Of how deadly once become Endless city\n' +
                        'Brutal and endless was their fate\n' +
                        'A destiny they knew comes at last yet none could stop\n')
                .build()
        return [poem, poem, poem]
    }
}
