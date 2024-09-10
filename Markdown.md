# MarkDown语法

弱小和无知不是生存的障碍，傲慢才是

## 标题

~~~标题
一级标题#+空格
~~~

## 字体

~~~字体
加粗**内容**
斜体*内容*
删除线~~内容~~
~~~

## 引用

~~~引用
>+空格
~~~

## 分割线

~~~分割线
---或***
~~~

## 图片

~~~ 图片
![内容](图片路径)
~~~

## 超链接

~~~超链接
[超链接名字](链接)
~~~

## 列表

~~~有序列表
数字+.+空格
~~~

~~~无序列表
-+空格
~~~

## 表格

~~~ 表格
名字|性别|生日
--|--|--
张三|男|1999-01-02
查看源码删除空行
~~~

## 代码

~~~代码
`代码`
```或~~~
~~~

## 高亮

~~~高亮
==内容=
~~~

## 思维导图

### 横向思维导图

~~~markdown
```mermaid
graph LR
A[内容]-->B[内容]
```
~~~

### 纵向思维导图

~~~markdown
```mermaid
graph TD
A[内容]-->B[内容]
```
~~~

### 复杂思维导图

````markdown
```mermaid
mindmap
  root((mindmap))
    Origins
      Long history
      ::icon(fa fa-book)
      Popularisation
        British popular psychology author Tony Buzan
    Research
      On effectiveness<br/>and features
      On Automatic creation
        Uses
            Creative techniques
            Strategic planning
            Argument mapping
    Tools
      Pen and paper
      Mermaid

```
````



## 时序图

````markdown
```mermaid
sequenceDiagram
    Alice->>+John: 实线
    Alice->>+John: 实线
    John-->>-Alice: 虚线
    John-->>-Alice: 虚线
```
````

## State Diagram(状态图)

````markdown
```mermaid
stateDiagram-v2
	[*] --> Still
    Still --> [*]
    Still --> Moving
    Moving --> Still
    Moving --> Crash
    Crash --> [*]
```
````

## Pie Diagram（饼图）

````markdown
```mermaid
%%{init: {"pie": {"textPosition": 0.5}, "themeVariables": {"pieOuterStrokeWidth": "5px"}} }%%
pie showData
    title Key elements in Product X
    "Calcium" : 42.96
    "Potassium" : 50.05
    "Magnesium" : 10.01
    "Iron" :  5
```
````

## ER图

````markdown
```mermaid
erDiagram
    CUSTOMER }|..|{ DELIVERY-ADDRESS : has
    CUSTOMER ||--o{ ORDER : places
    CUSTOMER ||--o{ INVOICE : "liable for"
    DELIVERY-ADDRESS ||--o{ ORDER : receives
    INVOICE ||--|{ ORDER : covers
    ORDER ||--|{ ORDER-ITEM : includes
    PRODUCT-CATEGORY ||--|{ PRODUCT : contains
    PRODUCT ||--o{ ORDER-ITEM : "ordered in"
```
````

## 类图

````markdown
```mermaid
classDiagram
    Animal <|-- Duck
    Animal <|-- Fish
    Animal <|-- Zebra
    Animal : +int age
    Animal : +String gender
    Animal: +isMammal()
    Animal: +mate()
    class Duck{
      +String beakColor
      +swim()
      +quack()
    }
    class Fish{
      -int sizeInFeet
      -canEat()
    }
    class Zebra{
      +bool is_wild
      +run()
    }
```
````

## GIT示例图

````markdown
```mermaid
---
title: Example Git diagram
---
gitGraph
   commit
   commit
   branch develop
   checkout develop
   commit
   commit
   checkout main
   merge develop
   commit
   commit

```
````





## 几种图的写法

### 横向流程图源码格式

````
```mermaid
graph LR
A[方形] -->B(圆角)
    B --> C{条件a}
    C -->|a=1| D[结果1]
    C -->|a=2| E[结果2]
    F[横向流程图]
```
````

### 竖向流程图源码格式



````
```mermaid
graph TD
A[方形] --> B(圆角)
    B --> C{条件a}
    C --> |a=1| D[结果1]
    C --> |a=2| E[结果2]
    F[竖向流程图]
```
````

### 标准流程图源码格式（纵向）

````
```flow
st=>start: 开始框
op=>operation: 处理框
cond=>condition: 判断框(是或否?)
sub1=>subroutine: 子流程
io=>inputoutput: 输入输出框
e=>end: 结束框
st->op->cond
cond(yes)->io->e
cond(no)->sub1(right)->op
```
````

### 标准流程图源码格式（横向）

````
```flow
st=>start: 开始框
op=>operation: 处理框
cond=>condition: 判断框(是或否?)
sub1=>subroutine: 子流程
io=>inputoutput: 输入输出框
e=>end: 结束框
st(right)->op(right)->cond
cond(yes)->io(bottom)->e
cond(no)->sub1(right)->op
```
````

### UML时序图源码

````
```sequence
sequenceDiagram
对象A->>对象B: 对象B你好吗?（请求）
Note right of 对象B: 对象B的描述
Note left of 对象A: 对象A的描述(提示)
对象B-->>对象A: 我很好(响应)
对象A->>对象B: 你真的好吗？
```
````

### UML时序图源码复杂

````
```sequence
Title: 标题：复杂使用
对象A->对象B: 对象B你好吗?（请求）
Note right of 对象B: 对象B的描述
Note left of 对象A: 对象A的描述(提示)
对象B-->对象A: 我很好(响应)
对象B->小三: 你好吗
小三-->>对象A: 对象B找我了
对象A->对象B: 你真的好吗？
Note over 小三,对象B: 我们是朋友
participant C
Note right of C: 没人陪我玩
```
````

### UML标准时序图样例

````
```mermaid
%% 时序图例子,-> 直线，-->虚线，->>实线箭头
  sequenceDiagram
    participant 张三
    participant 李四
    张三->王五: 王五你好吗？
    loop 健康检查
        王五->王五: 与疾病战斗
    end
    Note right of 王五: 合理 食物 <br/>看医生...
    李四-->>张三: 很好!
    王五->李四: 你怎么样?
    李四-->王五: 很好!
```
````

### 甘特图

````
```mermaid
%% 语法示例
        gantt
        dateFormat  YYYY-MM-DD
        title 软件开发甘特图
        section 设计
        需求                      :done,    des1, 2014-01-06,2014-01-08
        原型                      :active,  des2, 2014-01-09, 3d
        UI设计                     :         des3, after des2, 5d
    未来任务                     :         des4, after des3, 5d
        section 开发
        学习准备理解需求                      :crit, done, 2014-01-06,24h
        设计框架                             :crit, done, after des2, 2d
        开发                                 :crit, active, 3d
        未来任务                              :crit, 5d
        耍                                   :2d
        section 测试
        功能测试                              :active, a1, after des3, 3d
        压力测试                               :after a1  , 20h
        测试报告                               : 48h
```
````

## Windows命令

### Windows快捷键

~~~Windows快捷键
Ctrl+C：复制
Ctrl+F4：关闭窗口
Shift+Delete：永久删除
Ctrl+Shift+Esc：打开任务管理器
Win+E：打开我的电脑
~~~

### DOS命令

~~~DOS命令
#盘符切换E：
#查看当前目录下的所有文件dir
#切换目录cd   不同盘符cd /d f:\文件名
#清理屏幕cls
#退出exit
#查看ip  ipconfig
#打开应用
	calc 计算器
	mspaint 画图
	notepad 记事本
	#文件操作
		md 目录名
		rd 目录名
		cd> 文件名
		del 文件名
~~~

## picgo

https://picgo.github.io/PicGo-Core-Doc/zh/guide/getting-started.html

```shell
yarn global add picgo
# or
npm install picgo -g
# 配置文件
picgo set uploader
# 安装插件 https://picgo.github.io/PicGo-Core-Doc/zh/dev-guide/cli.html#%E6%A6%82%E8%BF%B0
npm install ./picgo-plugin-<your-plugin-name>

# 使用插件模板
picgo init plugin <your-project-name>


# 存在npm与picgo-core配置文件的情况下
npx picgo upload xxx.png
# 指定配置文件上传
 picgo upload ./tecoy.cn.png --config C:\Users\fjpti\.picgo\config1.json
```





# Windows注册表快捷方式

```shell
regedit
计算机\HKEY_CLASSES_ROOT\Directory\Background\shell\IntelliJ IDEA\command
默认: "C:\Soft\JetBrains\apps\IDEA-U\ch-0\211.7628.21\bin\idea64.exe" "%V"
Icon: C:\Soft\JetBrains\apps\IDEA-U\ch-0\211.7628.21\bin\idea64.exe

```

