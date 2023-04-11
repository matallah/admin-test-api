
## Admin Test Api

Sample Spring-boot project (Spring security + JWT)



## Related

Please Import below postman collection

[Postman collection link](https://github.com/matallah/admin-test-api/blob/master/Santechture%20Test%20API.postman_collection.json)


## API Reference

#### Login

```http
  POST /api/authenticate
```

| Body | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `username` | `string` | **Required**. Your API key |
| `password` | `password` | **Required**. Your API key |

#### Get Users list

```http
  GET /api/user?page=0&size=10
```
#### authentication type:
  Bearer Token



| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `page`      | `int` | **optional**. Page start |
| `size`      | `int` | **optional**. Size limit |



## Deployment

To deploy this project run

```bash
  java -jar admin-test-api-0.0.1-SNAPSHOT.war
```


## Feedback

If you have any feedback, please reach out to me at m3atallah@gmail.com

