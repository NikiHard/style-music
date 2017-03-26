/*
 * Copyright 2017 Julian Ostarek
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.julianostarek.music.databases

object DatabaseConstants {
    const val TEXT_TYPE = "'TEXT'"
    const val COMMA_SEP = ","
    const val PRIMARY_KEY = " INTEGER PRIMARY KEY,"
    const val INTEGER = " INTEGER"
    const val CREATE_TABLE = "CREATE TABLE "
    const val DROP_TABLE_IF_EXISTS = "DROP TABLE IF EXISTS "
    const val NULL_COLUMN_HACK = "null"
}