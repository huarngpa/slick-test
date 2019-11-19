import slick.dbio.DBIOAction
import slick.jdbc.JdbcBackend.Database
import slick.lifted.TableQuery
import slick.driver.PostgresDriver.api._

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.concurrent.ExecutionContext.Implicits.global

object SlickTest extends App with Common {
  val quotes = TableQuery[Quotes]
  val db = Database.forURL(connectionString, user = user, password = password, driver = driver)
  try {
    Await.result(db.run(DBIOAction.seq(
      quotes.result.map(_.map(println))
    )), Duration.Inf)
  } finally db.close()
}
