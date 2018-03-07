<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <script src="/static/js/jquery-3.2.1.js"></script>
    <script src="/static/js/vue.js"></script>
</head>
<body>
    <div id="vm">
        <span>{{baseUser}}</span>
    </div>
</body>
<script>
    let vm = new Vue({
        el: "#vm",
        data: {
            baseUser:""
        },
        beforeCreate: function () {
            let _this = this;
            $.get("/user/info", function (data) {
                if (data.result) {
                    _this.baseUser = data.data;
                }
            });
        },
        created: function () {
        },
        updated: function () {
        },
        methods: {
        }
    });
</script>
</html>