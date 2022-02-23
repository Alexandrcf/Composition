package com.myapp.domain.repository

import com.myapp.domain.entity.GameSettings
import com.myapp.domain.entity.Level
import com.myapp.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}