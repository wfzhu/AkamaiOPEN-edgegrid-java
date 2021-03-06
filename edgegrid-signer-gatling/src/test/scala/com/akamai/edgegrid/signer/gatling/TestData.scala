/*
 * Copyright 2016 Copyright 2016 Akamai Technologies, Inc. All Rights Reserved.
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

package com.akamai.edgegrid.signer.gatling

import com.akamai.edgegrid.signer.ClientCredential

package object testdata {

  val testCredential = ClientCredential.builder
    .accessToken("akaa-dm5g2bfwoodqnc6k-ju7vlao2wz6oz2rp")
    .clientToken("akaa-k7glklzuxkkh2ycw-oadjphopvpn6yjoj")
    .clientSecret("SOMESECRET")
    .host("localhost:9089").build

  val SERVICE_MOCK_HOST = "localhost"
  val SERVICE_MOCK_PORT = 9089
  val SERVICE_MOCK = testdata.SERVICE_MOCK_HOST + ":" + testdata.SERVICE_MOCK_PORT


}
