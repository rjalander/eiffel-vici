/*
   Copyright 2017 Ericsson AB.
   For a full list of individual contributors, please see the commit history.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.ericsson.vici.api.entities.settings;


public class EiffelEventRepository {
    private String name;
    private String url;
    private RepositorySettings repositorySettings;

    public EiffelEventRepository() {
    }

    public EiffelEventRepository(String name, String url, RepositorySettings repositorySettings) {
        this.name = name;
        this.url = url;
        if (repositorySettings == null) {
            this.repositorySettings = new RepositorySettings();
        } else {
            this.repositorySettings = repositorySettings;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RepositorySettings getRepositorySettings() {
        return repositorySettings;
    }

    public void setRepositorySettings(RepositorySettings repositorySettings) {
        this.repositorySettings = repositorySettings;
    }
}