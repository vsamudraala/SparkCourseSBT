package rough

import java.util.logging.Logger

trait ProjLogging {
    val logger:Logger = Logger.getLogger(getClass.getName)
}
