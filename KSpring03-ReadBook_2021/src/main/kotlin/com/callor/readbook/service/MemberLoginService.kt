package com.callor.readbook.service

import com.callor.readbook.config.logger
import com.callor.readbook.model.MemberVO
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class MemberLoginService():UserDetailsService {

    // 가상의 member list 생성해 두기
    private val userList = listOf(
            MemberVO(username = "num5268", password = "1234"),
            MemberVO(username = "num", password = "1234"),
            MemberVO(username = "5268", password = "1234"),
    )

    // findByUserName(username) : UserDetails
    override fun loadUserByUsername(username: String): UserDetails {
        // 배열.find {] : 배열의 요소중 원하는 값이 담겨 있는가?
        // 담겨 있으면 해당 값을 return 하고, 없으면 null return
        val member:UserDetails? = userList.find { it.username == username }
        logger().debug("SERVICE {}", member.toString() )
        member ?: throw UsernameNotFoundException("사용자 ID가 잘못되었습니다.")

        logger().debug("SERVICE {}", member.toString() )

        return member
    }

    fun findById(username: String):MemberVO{
        val member = userList.filter { it.username == username }

        return member.get(0)
    }

}

