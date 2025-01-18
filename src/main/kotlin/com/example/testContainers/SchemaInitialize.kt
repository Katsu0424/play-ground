package com.example.testContainers

import com.example.testContainers.domain.UserEntity
import org.jetbrains.exposed.sql.SchemaUtils
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

/**
 * This class is used to initialize the database schema.
 * It is executed when the application starts and if the schema does not exist, it creates it.
 */
@Component
@Transactional
open class SchemaInitialize : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        SchemaUtils.create(UserEntity)
    }
}
