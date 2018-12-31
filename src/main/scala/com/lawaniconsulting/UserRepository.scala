package com.lawaniconsulting

object UserRepository {

  private val users = Map(1 -> User(1, "John", "Major", 75, Some("male")),
                          2 -> User(2, "Theresa", "May", 62, Some("Female")))

  def findById(id: Int): Option[User] = users.get(id)
  def findAll: List[User]             = users.values.toList
}
