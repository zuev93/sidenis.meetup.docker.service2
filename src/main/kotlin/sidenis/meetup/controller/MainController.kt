package sidenis.meetup.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import sidenis.meetup.service.MainService

@Controller
@RequestMapping("/calc")
open class MainController(val service: MainService) {
    @RequestMapping("{number}", method = [RequestMethod.GET])
    @ResponseBody
    fun calc(
            @PathVariable("number")
            number: Int
    ) = service.calc(number)
}