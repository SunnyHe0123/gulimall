# gulimall

1.先启动nacos

```shell
cd C:\Users\javaf\Desktop\Sunny\springCloud\nacos\nacos-server-2.2.3\nacos\bin
startup.cmd -m standalone
```
2.配置nginx
```shell
docker pull nginx:1.10
docker run -p 80:80 --name nginx -d nginx:1.10
# 使用管理员权限执行
docker container cp nginx:/etc/nginx .
# 修改nginx名字为conf
docker run -p 80:80 --name nginx -v C:/Users/javaf/Desktop/Sunny/springCloud/ngnix/html:/usr/share/nginx/html -v C:/Users/javaf/Desktop/Sunny/springCloud/ngnix/logs:/var/log/nginx -v C:/Users/javaf/Desktop/Sunny/springCloud/ngnix/conf:/etc/nginx -d nginx:1.10
```
3.启动ELK
使用docker-compose.yml


