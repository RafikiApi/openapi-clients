## Overview

This repository includes auto-generated clients created using [openapi-generator](https://openapi-generator.tech/) for the [rafiki API](https://docs.rafiki-api.com/reference/welcome) web services.

:warning: In lieu of official and well polished SDKs, the purpose of these clients is to expedite your setup process and offer stubs/generated code that you can experiment with when interacting with the API. However, please note that **we wouldn't recommend using this code in a production/live environment**.

## Usage

Clients generated code is located at `./{language}/{api-version}/generated`, the content within this directory varies based on the programming language in question. You have the flexibility to either import directly from the remote source, (provided the programming language's package manager supports this feature e.g. `go get github.com/RafikiApi/openapi-clients/go/v1/generated`), or alternatively, you can clone the repository and manually extract what you need.

If available, the `./{language}/{api-version}/examples` directory provides instructions and guidelines on utilizing the client code.