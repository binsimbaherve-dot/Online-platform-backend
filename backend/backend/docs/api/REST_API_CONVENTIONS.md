# REST API Conventions

## Base URL
All REST endpoints must be prefixed with:
/api/v1
## Versioning
- URI versioning is used
- Breaking changes require a new version (v2, v3, etc.)
## Endpoint Naming
- Use nouns, not verbs
- Use plural resource names
- Use lowercase
- Use path variables for IDs
Examples:
- GET /api/v1/products
- GET /api/v1/products/{id}
- POST /api/v1/orders
## HTTP Methods
- GET: Read data
- POST: Create data
- PUT: Replace data
- PATCH: Partial update
- DELETE: Remove data

## Error Response Format
All errors must return JSON in the following format:

```json
{
  "timestamp": "2026-02-07T10:15:30+02:00",
  "status": 400,
  "error": "Bad Request",
  "message": "Validation failed",
  "path": "/api/v1/resource"
}

Status Codes

200 OK

201 Created

204 No Content

400 Bad Request

401 Unauthorized

403 Forbidden

404 Not Found

409 Conflict

500 Internal Server Error

