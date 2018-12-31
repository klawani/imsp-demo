package com.lawaniconsulting

import org.scalatest.{ FlatSpec, Matchers }

class UserRepositoryTests extends FlatSpec with Matchers {

  "UserRepository" should "return firstName = John & lastName = Major " in {
    val userId       = 1
    val expectedUser = Some(User(1, "John", "Major", 75, Some("male")))

    val actualUser = UserRepository.findById(userId)

    actualUser shouldBe (expectedUser)
  }

  "UserRepository" should "return all users " in {

    val expectedUsers = List(Some(User(1, "John", "Major", 75, Some("male"))),
                             Some(User(2, "Theresa", "May", 62, Some("Female"))))

    val actualUsers = UserRepository.findAll

    actualUsers.size shouldBe (expectedUsers.size)
  }
}
