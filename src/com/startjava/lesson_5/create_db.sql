CREATE TABLE jaegers;
    id              SERIAL PRIMARY KEY,
    modelName       TEXT,
    mark            TEXT,
    height          double precision,
    weight          double precision,
    status          TEXT,
    origin          TEXT,
    launch          DATE,
    kaijuKill       INTEGER
);