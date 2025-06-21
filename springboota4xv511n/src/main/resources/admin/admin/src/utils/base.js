const base = {
    get() {
        return {
            url : "http://localhost:8080/springboota4xv511n/",
            name: "springboota4xv511n",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboota4xv511n/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于JavaWeb的花店销售系统设计与实现"
        } 
    }
}
export default base
