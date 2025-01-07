ALTER TABLE lessons
ADD COLUMN progress_id BIGINT NOT NULL,
ADD CONSTRAINT fk_progress FOREIGN KEY (progress_id) REFERENCES progress(id);
