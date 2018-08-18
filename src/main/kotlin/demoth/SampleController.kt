package demoth

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
open class SampleController {

    @GetMapping("/sample")
    fun sampleText(@RequestParam("name") name: String): String {
        return "hello, $name :" + Date()
    }
}