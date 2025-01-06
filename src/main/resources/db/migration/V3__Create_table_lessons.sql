CREATE TABLE lessons (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT,
    lesson_order BIGINT,
    course_id BIGINT NOT NULL,

    CONSTRAINT fk_course FOREIGN KEY (course_id) REFERENCES courses(id)

);