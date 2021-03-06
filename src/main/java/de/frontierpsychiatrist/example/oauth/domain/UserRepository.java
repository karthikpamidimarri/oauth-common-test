/*
 * Copyright 2014-2015 the original author or authors.
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

package de.frontierpsychiatrist.example.oauth.domain;

import java.util.List;
import java.util.Optional;

import org.joda.time.DateTime;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByLogin(String login);

	Optional<User> findOneByActivationKey(String key);
	
	List<User> findAllByActivatedIsFalseAndCreatedDateBefore(DateTime dateTime);

	Optional<User> findOneByLogin(String currentLogin);

	Optional<User> findOneByEmail(String email);

}
