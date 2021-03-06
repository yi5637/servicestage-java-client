/**
 * Copyright 2016 - 2018 Huawei Technologies Co., Ltd. All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.cloud.servicestage.client;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Test;

public class AuthClientTest {

    @Test
    public void testGetAuthToken() throws IOException {
        Token token = AuthClient.getAuthToken(AuthHelper.REGION,
                AuthHelper.USERNAME, AuthHelper.PASSWORD, AuthHelper.DOMAIN);
        System.out.println(token);

        assertFalse(token.isExpired());

        assertNotNull(token);
    }

}
