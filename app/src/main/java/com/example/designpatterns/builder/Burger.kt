package com.example.designpatterns.builder

class Burger private constructor(
    val cheese : Boolean,
    val beef : Boolean,
    val chicken : Boolean,
    val butter : Boolean,
) {
    class Builder{
        private var cheese : Boolean = false
        private var beef : Boolean = true
        private var chicken : Boolean = false
        private var butter : Boolean = true

        fun cheese(value: Boolean) = apply { cheese=value }
        fun beef(value: Boolean) = apply { beef=value }
        fun chicken(value: Boolean) = apply { chicken=value }
        fun butter(value: Boolean) = apply { butter=value }

        fun build() = Burger(cheese,beef,chicken,butter)

    }
}