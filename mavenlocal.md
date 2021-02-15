# Simply는 Maven Central에 등록 중에 있으며 완료이전까지는 아래의 과정으로 Library를 획득할 수 있다.

## Simply Library 다운로드 및 build

### 1. git clone을 통해 다운로드
```shell
> git clone https://github.com/PotatoWhite/simply-starter.git
```

### 2. gradle 을 통해 build 및 Local 배포
```shell
> gradle clean build publishToMavenLocal
```



## Simply Library Import(사용하고자하는 Application에서)

### Maven Local Repository 추가
```groovy
repositories {
    mavenLocal()
    mavenCentral()
}
```

### Import
```groovy
implementation 'io.easywalk:simply-common:0.0.1-SNAPSHOT'
implementation 'io.easywalk:simply-serviceable:0.0.1-SNAPSHOT'
implementation 'io.easywalk:simply-controllable:0.0.1-SNAPSHOT'
```