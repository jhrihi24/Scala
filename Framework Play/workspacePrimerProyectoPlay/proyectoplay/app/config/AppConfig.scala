package config

import java.net.URI
import play.api.ConfigLoader
import com.typesafe.config.Config;

case class AppConfig(title: String, baseUri: URI)
object AppConfig {
  implicit val configLoader: ConfigLoader[AppConfig] = new ConfigLoader[AppConfig] {
    def load(rootConfig: Config, path: String): AppConfig = {      
      AppConfig(
        title = rootConfig.getString("app"),
        baseUri = new URI(rootConfig.getString("url"))
      )
    }
  }
}