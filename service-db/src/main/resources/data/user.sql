CREATE TABLE `user`
(
    `id`        int(11)      NOT NULL AUTO_INCREMENT,
    `username`  varchar(16)  NULL,
    `account`   varchar(6)   NULL,
    `password`  varchar(255) NULL,
    `eamil`     varchar(255) NULL,
    `phone`     varchar(11)  NULL,
    `sex`       int          NULL,
    `create_at` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '' 创建时间 '',
    `update_at` timestamp    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '' 更新时间 '',
    `status`    int(1)       NOT NULL DEFAULT 0 COMMENT '' 0表示未被删除 '',
    PRIMARY KEY (`id`)
);
