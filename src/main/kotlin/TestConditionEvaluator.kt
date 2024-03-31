package com.anarchyghost

import com.anarchyghost.models.domain.GitlabEvent
import com.anarchyghost.processing.condition.evaluator.ConditionEvaluator

class TestConditionEvaluator: ConditionEvaluator {
    override suspend fun evaluate(event: GitlabEvent<*>): Boolean {
        return true
    }
}