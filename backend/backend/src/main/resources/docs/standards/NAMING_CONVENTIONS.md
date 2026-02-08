# Naming Conventions (Backend)

## 1) API (REST) Naming
Base path:
- /api/v1

Rules:
- Use nouns, not verbs
- Use plural resource names
- Use kebab-case in URLs
- Use path variables for IDs

Examples:
- GET    /api/v1/products
- GET    /api/v1/products/{id}
- POST   /api/v1/products
- PUT    /api/v1/products/{id}
- PATCH  /api/v1/products/{id}
- DELETE /api/v1/products/{id}

Contact feature:
- POST /api/v1/contact


## 2) Java Packages
Use lowercase packages.

Standard structure:
- com.platform.backend.controller
- com.platform.backend.service
- com.platform.backend.repository
- com.platform.backend.dto
- com.platform.backend.model


## 3) Java Class Naming
Use PascalCase.

Controllers:
- XController
  Example: ContactController

Services:
- XService (and XServiceImpl if needed)
  Example: ContactService, ContactServiceImpl

Repositories:
- XRepository
  Example: ContactMessageRepository

DTOs:
- XRequest, XResponse
  Example: ContactRequest, ErrorResponse


## 4) Method Naming
Use camelCase verbs.

Examples:
- sendContactEmail()
- createProduct()
- getOrderById()


## 5) Database Naming (PostgreSQL)
Tables:
- snake_case
- plural
- no uppercase

Examples:
- products
- orders
- order_items
- contact_messages

Columns:
- snake_case

Common columns:
- id
- created_at
- updated_at

Foreign keys:
- {table}_id
  Example: order_id, product_id
