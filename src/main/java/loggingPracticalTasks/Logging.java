package loggingPracticalTasks;

import org.apache.logging.log4j.LogManager; // импортируем лог из зависимостей, добавленных в log4j2.xml
import org.apache.logging.log4j.Logger;

public class Logging {
    public static final Logger logger = LogManager.getLogger(Logging.class);// запрашиваем у Log4j2 логгер для класса Logging, чтобы логировать события этого класса

    private void privateMethod() {
        logger.info("!!!PRIVATE method was called!!!");
    }

    public void publicMethod() {
        logger.info("!!!PUBLIC method was called!!!");
        privateMethod();
    }
}