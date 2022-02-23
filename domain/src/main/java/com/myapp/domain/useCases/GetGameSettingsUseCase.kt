package com.myapp.domain.useCases

import com.myapp.domain.entity.GameSettings
import com.myapp.domain.entity.Level
import com.myapp.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings  {
        return repository.getGameSettings(level)
    }
}