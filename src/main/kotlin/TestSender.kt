package com.anarchyghost

import com.anarchyghost.models.domain.message.Message
import com.anarchyghost.models.domain.message.text.TextMessage
import com.anarchyghost.processing.message.sender.MessageSender

class TestSender: MessageSender {
    override suspend fun send(message: Message) {
        check(message is TestMessage || message is TextMessage) {"Unsupported message type"}
        println(message)
    }
}