/*
 * Copyright (c) 2010-2011, The MiCode Open Source Community (www.micode.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


//同步动作执行失败异常

package net.micode.notes.gtask.exception;

public class ActionFailureException extends RuntimeException {
    private static final long serialVersionUID = 4425249765923293627L;

    public ActionFailureException() {
        super();
    }  //无参构造，只抛出异常

    public ActionFailureException(String paramString) {
        super(paramString);
    } //抛出异常并说明原因

    public ActionFailureException(String paramString, Throwable paramThrowable) {
        super(paramString, paramThrowable);
    }  //说明原因并说明异常具体位置，例如json解析失败
}
