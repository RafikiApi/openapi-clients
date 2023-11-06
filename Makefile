SHELL := bash

OAPI_FILE = https://docs.rafiki-api.com/openapi/6511b156eda37b005a447a78

LANGUAGES := go typescript-node javascript ruby java php csharp kotlin python rust

# generates for all languages defined in $LANGUAGES
generate-all:
	$(foreach lang,$(LANGUAGES), \
		make lang=$(lang) generate; \
	)

# generate for a specific language
#  e.g. `make lang=go generate`
generate:
	docker run \
		--rm \
		-v $(PWD):/tmp/generating \
		openapitools/openapi-generator-cli:v7.0.1 generate \
			--git-host github.com \
			--git-user-id RafikiApi \
			--git-repo-id openapi-clients/$(lang)/v1/generated \
			--package-name rafikigen \
			--api-package rafikigen \
			-c /tmp/generating/$(lang)/genconf.yaml \
			-i $(OAPI_FILE) \
			-g $(lang) -o /tmp/generating/$(lang)/v1/generated
