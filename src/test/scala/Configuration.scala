package tests.gatling
import com.typesafe.config.ConfigFactory

trait Configuration {

  private val conf = ConfigFactory.load()

  def getConfigValue(key: String): String = {
    conf.getString(key)
  }
}
