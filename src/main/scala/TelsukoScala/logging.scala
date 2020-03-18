package TelsukoScala

import org.apache.log4j.Logger

trait logging {
    val logger:Logger = Logger.getLogger(getClass.getName)

}
