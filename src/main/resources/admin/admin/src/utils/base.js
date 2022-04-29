const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot213wf/",
            name: "springboot213wf",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "汽车美容管理系统设计"
        } 
    }
}
export default base
