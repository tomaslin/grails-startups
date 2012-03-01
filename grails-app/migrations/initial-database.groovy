databaseChangeLog = {

    changeSet(author: "tomaslin (generated)", id: "1330565190750-1") {
        createTable(tableName: "PERSISTENT_SESSION") {
            column(name: "ID", type: "VARCHAR(255)") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_3")
            }

            column(name: "CREATION_TIME", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "INVALIDATED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "LAST_ACCESSED_TIME", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "MAX_INACTIVE_INTERVAL", type: "INT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-2") {
        createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_F")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "SESSION_ID", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-3") {
        createTable(tableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_5")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ATTRIBUTE_ID", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "SERIALIZED", type: "VARBINARY(20000)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-4") {
        createTable(tableName: "SEC_ROLE") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_6")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "AUTHORITY", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-5") {
        createTable(tableName: "SEC_USER") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_67C")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "ACCOUNT_EXPIRED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "ACCOUNT_LOCKED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "ENABLED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "password", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "PASSWORD_EXPIRED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "USERNAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-6") {
        createTable(tableName: "SEC_USER_SEC_ROLE") {
            column(name: "SEC_ROLE_ID", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "SEC_USER_ID", type: "BIGINT") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-7") {
        createTable(tableName: "STARTUP") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_B")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "APPROVED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "DATE_CREATED", type: "TIMESTAMP") {
                constraints(nullable: "false")
            }

            column(name: "DESCRIPTION", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "IMAGE", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "LAST_UPDATED", type: "TIMESTAMP") {
                constraints(nullable: "false")
            }

            column(name: "LOCATION", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "REVIEWED", type: "BOOLEAN") {
                constraints(nullable: "false")
            }

            column(name: "TWITTER", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }

            column(name: "WEBSITE", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-8") {
        createTable(tableName: "TAG_LINKS") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_58")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "TAG_ID", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "TAG_REF", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "TYPE", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-9") {
        createTable(tableName: "TAGS") {
            column(autoIncrement: "true", name: "ID", type: "BIGINT") {
                constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_2")
            }

            column(name: "VERSION", type: "BIGINT") {
                constraints(nullable: "false")
            }

            column(name: "NAME", type: "VARCHAR(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-10") {
        addPrimaryKey(columnNames: "SEC_ROLE_ID, SEC_USER_ID", constraintName: "CONSTRAINT_C", tableName: "SEC_USER_SEC_ROLE")
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-11") {
        createIndex(indexName: "CONSTRAINT_INDEX_6", tableName: "SEC_ROLE", unique: "true") {
            column(name: "AUTHORITY")
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-12") {
        createIndex(indexName: "CONSTRAINT_INDEX_67", tableName: "SEC_USER", unique: "true") {
            column(name: "USERNAME")
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-13") {
        createIndex(indexName: "CONSTRAINT_INDEX_2", tableName: "TAGS", unique: "true") {
            column(name: "NAME")
        }
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-14") {
        addForeignKeyConstraint(baseColumnNames: "SESSION_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE", baseTableSchemaName: "PUBLIC", constraintName: "FK50C6048B92381D29", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-15") {
        addForeignKeyConstraint(baseColumnNames: "ATTRIBUTE_ID", baseTableName: "PERSISTENT_SESSION_ATTRIBUTE_VALUE", baseTableSchemaName: "PUBLIC", constraintName: "FK1EFE24BDF830ABF5", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "PERSISTENT_SESSION_ATTRIBUTE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-16") {
        addForeignKeyConstraint(baseColumnNames: "SEC_ROLE_ID", baseTableName: "SEC_USER_SEC_ROLE", baseTableSchemaName: "PUBLIC", constraintName: "FK6630E2A859FB9AC", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "SEC_ROLE", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-17") {
        addForeignKeyConstraint(baseColumnNames: "SEC_USER_ID", baseTableName: "SEC_USER_SEC_ROLE", baseTableSchemaName: "PUBLIC", constraintName: "FK6630E2A2ACA7D8C", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "SEC_USER", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
    }

    changeSet(author: "tomaslin (generated)", id: "1330565190750-18") {
        addForeignKeyConstraint(baseColumnNames: "TAG_ID", baseTableName: "TAG_LINKS", baseTableSchemaName: "PUBLIC", constraintName: "FK7C35D6D45A3B441D", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "TAGS", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
    }

}
