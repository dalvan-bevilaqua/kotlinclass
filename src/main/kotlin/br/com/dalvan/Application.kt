package br.com.dalvan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

