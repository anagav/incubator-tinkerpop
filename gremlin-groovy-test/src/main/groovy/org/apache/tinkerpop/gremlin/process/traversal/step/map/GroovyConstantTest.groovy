/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.process.traversal.step.map

import org.apache.tinkerpop.gremlin.process.traversal.Traversal
import org.apache.tinkerpop.gremlin.process.traversal.util.TraversalScriptHelper
import org.apache.tinkerpop.gremlin.structure.Vertex

import java.util.List

/**
 * @author Matt Frantz (http://github.com/mhfrantz)
 */
public abstract class GroovyConstantTest {

    public static class Traversals extends ConstantTest {
        @Override
        public Traversal<Vertex, Integer> get_g_V_constantX123X() {
            TraversalScriptHelper.compute("g.V.constant(123)",g)
        }

        @Override
        public Traversal<Vertex, String> get_g_V_chooseXhasLabelXpersonX_valuesXnameX_constantXinhumanXX() {
            TraversalScriptHelper.compute("g.V.choose(hasLabel('person'), values('name'), constant('inhuman'))",g)
        }

    }
}
