package com.c332030

import org.slf4j.LoggerFactory

/**
 * kotlin CLogger
 */
class CLogger(clazz: Class<*>) {

  private val log = LoggerFactory.getLogger(clazz)

  fun trace(func: () -> String) {
    log.trace(func.invoke())
  }
  fun trace(func: () -> String, e: Throwable) {
    log.trace(func.invoke(), e)
  }

  fun debug(func: () -> String) {
    log.debug(func.invoke())
  }
  fun debug(func: () -> String, e: Throwable) {
    log.debug(func.invoke(), e)
  }

  fun info(func: () -> String) {
    log.info(func.invoke())
  }
  fun info(func: () -> String, e: Throwable) {
    log.info(func.invoke(), e)
  }

  fun warn(func: () -> String) {
    log.warn(func.invoke())
  }
  fun warn(func: () -> String, e: Throwable) {
    log.warn(func.invoke(), e)
  }

  fun error(func: () -> String) {
    log.error(func.invoke())
  }
  fun error(func: () -> String, e: Throwable) {
    log.error(func.invoke(), e)
  }

}
