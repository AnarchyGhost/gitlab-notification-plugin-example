package com.anarchyghost

import com.anarchyghost.models.domain.GitlabEvent
import com.anarchyghost.models.domain.event.types.MergeRequestEvent
import com.anarchyghost.models.domain.message.Message
import com.anarchyghost.processing.message.generator.MessageGenerator

class TestGenerator: MessageGenerator {
    override suspend fun generate(event: GitlabEvent<*>): Message {
        return TestMessage("${(event.event as MergeRequestEvent).user}")
    }
}