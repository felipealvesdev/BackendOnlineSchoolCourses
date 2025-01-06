CREATE TABLE progress(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    student_id BIGINT NOT NULL,
    progress_status VARCHAR(255),
    started_at TIMESTAMP NULL,
    finished_at TIMESTAMP NULL,

    CONSTRAINT fk_student FOREIGN KEY (student_id) REFERENCES users(id)
);