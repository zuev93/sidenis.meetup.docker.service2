package sidenis.meetup.service

import org.springframework.stereotype.Service

@Service
open class MainService {
    fun calc(number: Int) = number * 1.5 + number * number
}