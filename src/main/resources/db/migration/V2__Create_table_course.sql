CREATE TABLE courses (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    category VARCHAR(255),
    instructor_id BIGINT,

    CONSTRAINT fk_instructor FOREIGN KEY (instructor_id) REFERENCES users(id)
);
