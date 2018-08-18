package demoth

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringMain

fun main(args: Array<String>) {
    SpringApplication.run(SpringMain::class.java)
}