package sidenis.meetup.service

import org.springframework.stereotype.Service

@Service
open class MainService {
    fun calc(number: Int) = Pair(number * 1.5 + number * number, System.getenv("NODE_ID") ?: "unknown node id")
}