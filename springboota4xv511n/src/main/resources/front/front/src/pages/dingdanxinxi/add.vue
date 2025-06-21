<template>
<div :style='{"width":"100%","padding":"20px 10%","margin":"10px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"width":"100%","padding":"20px 0","position":"relative","background":"#f9f9f9"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="150px"
    >
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="鲜花名称" prop="xianhuamingcheng">
            <el-input v-model="ruleForm.xianhuamingcheng" 
                placeholder="鲜花名称" clearable :disabled=" false  ||ro.xianhuamingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="鲜花类型" prop="xianhualeixing">
            <el-input v-model="ruleForm.xianhualeixing" 
                placeholder="鲜花类型" clearable :disabled=" false  ||ro.xianhualeixing"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="鲜花图片" v-if="type!='cross' || (type=='cross' && !ro.xianhuatupian)" prop="xianhuatupian">
            <file-upload
            tip="点击上传鲜花图片"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.xianhuatupian?ruleForm.xianhuatupian:''"
            @change="xianhuatupianUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' class="upload" v-else label="鲜花图片" prop="xianhuatupian">
                <img v-if="ruleForm.xianhuatupian.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.xianhuatupian.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.xianhuatupian.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="花语" prop="huayu">
            <el-input v-model="ruleForm.huayu" 
                placeholder="花语" clearable :disabled=" false  ||ro.huayu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="价格" prop="jiage">
            <el-input v-model.number="ruleForm.jiage" 
                placeholder="价格" clearable :disabled=" false  ||ro.jiage"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="购买数量" prop="shuliang">
            <el-input v-model.number="ruleForm.shuliang" 
                placeholder="购买数量" clearable :disabled=" false  ||ro.shuliang"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="商家账号" prop="shangjiazhanghao">
            <el-input v-model="ruleForm.shangjiazhanghao" 
                placeholder="商家账号" clearable :disabled=" false  ||ro.shangjiazhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="商家名称" prop="shangjiamingcheng">
            <el-input v-model="ruleForm.shangjiamingcheng" 
                placeholder="商家名称" clearable :disabled=" false  ||ro.shangjiamingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="商家地址" prop="shangjiadizhi">
            <el-input v-model="ruleForm.shangjiadizhi" 
                placeholder="商家地址" clearable :disabled=" false  ||ro.shangjiadizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="联系电话" prop="lianxidianhua">
            <el-input v-model="ruleForm.lianxidianhua" 
                placeholder="联系电话" clearable :disabled=" false  ||ro.lianxidianhua"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="总金额" prop="zongjine">
              <el-input v-model="zongjine" placeholder="总金额" disabled></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="下单时间" prop="xiadanshijian">
              <el-date-picker
				  :disabled=" false  ||ro.xiadanshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.xiadanshijian" 
                  type="datetime"
                  placeholder="下单时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="收货地址" prop="shouhuodizhi">
            <el-input v-model="ruleForm.shouhuodizhi" 
                placeholder="收货地址" clearable :disabled=" false  ||ro.shouhuodizhi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="收货人联系方式" prop="shouhuorenlianxifangshi">
            <el-input v-model="ruleForm.shouhuorenlianxifangshi" 
                placeholder="收货人联系方式" clearable :disabled=" false  ||ro.shouhuorenlianxifangshi"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="备注" prop="beizhu">
            <el-input v-model="ruleForm.beizhu" 
                placeholder="备注" clearable :disabled=" false  ||ro.beizhu"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="用户账号" prop="yonghuzhanghao">
            <el-input v-model="ruleForm.yonghuzhanghao" 
                placeholder="用户账号" clearable :disabled=" false  ||ro.yonghuzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="姓名" prop="xingming">
            <el-input v-model="ruleForm.xingming" 
                placeholder="姓名" clearable :disabled=" false  ||ro.xingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="手机" prop="shouji">
            <el-input v-model="ruleForm.shouji" 
                placeholder="手机" clearable :disabled=" false  ||ro.shouji"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="备货状态" prop="beihuozhuangtai">
            <el-select v-model="ruleForm.beihuozhuangtai" placeholder="请选择备货状态" :disabled="true  ||ro.beihuozhuangtai" >
              <el-option
                  v-for="(item,index) in beihuozhuangtaiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"rgba(255, 255, 255, 1)","borderRadius":"4px","background":"#654B3C","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #654B3C","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#654B3C","borderRadius":"4px","background":"rgba(255, 255, 255, 1)","width":"128px","lineHeight":"40px","fontSize":"14px","height":"40px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
	  let self = this
      return {
        id: '',
        baseUrl: '',
        ro:{
				xianhuamingcheng : false,
				xianhualeixing : false,
				xianhuatupian : false,
				huayu : false,
				jiage : false,
				shuliang : false,
				shangjiazhanghao : false,
				shangjiamingcheng : false,
				shangjiadizhi : false,
				lianxidianhua : false,
				zongjine : false,
				xiadanshijian : false,
				shouhuodizhi : false,
				shouhuorenlianxifangshi : false,
				beizhu : false,
				yonghuzhanghao : false,
				xingming : false,
				shouji : false,
				beihuozhuangtai : false,
				ispay : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          xianhuamingcheng: '',
          xianhualeixing: '',
          xianhuatupian: '',
          huayu: '',
          jiage: '',
          shuliang: '',
          shangjiazhanghao: '',
          shangjiamingcheng: '',
          shangjiadizhi: '',
          lianxidianhua: '',
          zongjine: '',
          xiadanshijian: '',
          shouhuodizhi: '',
          shouhuorenlianxifangshi: '',
          beizhu: '',
          yonghuzhanghao: '',
          xingming: '',
          shouji: '',
          beihuozhuangtai: '未备货' ,
          ispay: '',
        },
        beihuozhuangtaiOptions: [],


        rules: {
          xianhuamingcheng: [
            { required: true, message: '鲜花名称不能为空', trigger: 'blur' },
          ],
          xianhualeixing: [
          ],
          xianhuatupian: [
          ],
          huayu: [
          ],
          jiage: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          shuliang: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          shangjiazhanghao: [
          ],
          shangjiamingcheng: [
          ],
          shangjiadizhi: [
          ],
          lianxidianhua: [
          ],
          zongjine: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          xiadanshijian: [
          ],
          shouhuodizhi: [
          ],
          shouhuorenlianxifangshi: [
            { validator: this.$validate.isMobile, trigger: 'blur' },
          ],
          beizhu: [
          ],
          yonghuzhanghao: [
          ],
          xingming: [
          ],
          shouji: [
          ],
          beihuozhuangtai: [
          ],
          ispay: [
          ],
        },
		centerType: false,
      };
    },
    computed: {


        zongjine:{
            get: function () {
                return 1*this.ruleForm.jiage*this.ruleForm.shuliang
            }
        },

    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
      this.ruleForm.xiadanshijian = this.getCurDateTime()
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='xianhuamingcheng'){
              this.ruleForm.xianhuamingcheng = obj[o];
              this.ro.xianhuamingcheng = true;
              continue;
            }
            if(o=='xianhualeixing'){
              this.ruleForm.xianhualeixing = obj[o];
              this.ro.xianhualeixing = true;
              continue;
            }
            if(o=='xianhuatupian'){
              this.ruleForm.xianhuatupian = obj[o].split(",")[0];
              this.ro.xianhuatupian = true;
              continue;
            }
            if(o=='huayu'){
              this.ruleForm.huayu = obj[o];
              this.ro.huayu = true;
              continue;
            }
            if(o=='jiage'){
              this.ruleForm.jiage = obj[o];
              this.ro.jiage = true;
              continue;
            }
            if(o=='shuliang'){
              this.ruleForm.shuliang = obj[o];
              this.ro.shuliang = true;
              continue;
            }
            if(o=='shangjiazhanghao'){
              this.ruleForm.shangjiazhanghao = obj[o];
              this.ro.shangjiazhanghao = true;
              continue;
            }
            if(o=='shangjiamingcheng'){
              this.ruleForm.shangjiamingcheng = obj[o];
              this.ro.shangjiamingcheng = true;
              continue;
            }
            if(o=='shangjiadizhi'){
              this.ruleForm.shangjiadizhi = obj[o];
              this.ro.shangjiadizhi = true;
              continue;
            }
            if(o=='lianxidianhua'){
              this.ruleForm.lianxidianhua = obj[o];
              this.ro.lianxidianhua = true;
              continue;
            }
            if(o=='zongjine'){
              this.ruleForm.zongjine = obj[o];
              this.ro.zongjine = true;
              continue;
            }
            if(o=='xiadanshijian'){
              this.ruleForm.xiadanshijian = obj[o];
              this.ro.xiadanshijian = true;
              continue;
            }
            if(o=='shouhuodizhi'){
              this.ruleForm.shouhuodizhi = obj[o];
              this.ro.shouhuodizhi = true;
              continue;
            }
            if(o=='shouhuorenlianxifangshi'){
              this.ruleForm.shouhuorenlianxifangshi = obj[o];
              this.ro.shouhuorenlianxifangshi = true;
              continue;
            }
            if(o=='beizhu'){
              this.ruleForm.beizhu = obj[o];
              this.ro.beizhu = true;
              continue;
            }
            if(o=='yonghuzhanghao'){
              this.ruleForm.yonghuzhanghao = obj[o];
              this.ro.yonghuzhanghao = true;
              continue;
            }
            if(o=='xingming'){
              this.ruleForm.xingming = obj[o];
              this.ro.xingming = true;
              continue;
            }
            if(o=='shouji'){
              this.ruleForm.shouji = obj[o];
              this.ro.shouji = true;
              continue;
            }
            if(o=='beihuozhuangtai'){
              this.ruleForm.beihuozhuangtai = obj[o];
              this.ro.beihuozhuangtai = true;
              continue;
            }
          }
          this.ruleForm.shuliang = 0
		  this.ro.shuliang = false;
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.yonghuzhanghao!=''&&json.yonghuzhanghao) || json.yonghuzhanghao==0){
                this.ruleForm.yonghuzhanghao = json.yonghuzhanghao
            }
            if((json.xingming!=''&&json.xingming) || json.xingming==0){
                this.ruleForm.xingming = json.xingming
            }
            if((json.shouji!=''&&json.shouji) || json.shouji==0){
                this.ruleForm.shouji = json.shouji
            }
          }
        });
        this.beihuozhuangtaiOptions = "已备货,未备货".split(',')

		if (localStorage.getItem('raffleType') && localStorage.getItem('raffleType') != null) {
			localStorage.removeItem('raffleType')
			setTimeout(() => {
				this.onSubmit()
			}, 300)
		}
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`dingdanxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

			this.ruleForm.zongjine = this.zongjine
			if(!this.ruleForm.shuliang){
				this.$message.error("购买数量不能为空");
				return
			}
			var obj = JSON.parse(localStorage.getItem('crossObj'));
			var table = localStorage.getItem('crossTable');
			obj.shuliang = obj.shuliang - this.ruleForm.shuliang
			if(obj.shuliang<0){
				this.$message.error("购买数量不足");
				return
			}
      
			//this.$http.post(table+`/update`, obj).then(res => {});
			//更新跨表属性
			var crossuserid;
			var crossrefid;
			var crossoptnum;
			this.$refs["ruleForm"].validate(valid => {
				if(valid) {
					if(this.type=='cross'){
						var statusColumnName = localStorage.getItem('statusColumnName');
						var statusColumnValue = localStorage.getItem('statusColumnValue');
						if(statusColumnName && statusColumnName!='') {
							var obj = JSON.parse(localStorage.getItem('crossObj'));
							if(!statusColumnName.startsWith("[")) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = localStorage.getItem('crossTable');
								this.$http.post(table+'/update', obj).then(res => {});
							} else {
								crossuserid=Number(localStorage.getItem('frontUserid'));
								crossrefid=obj['id'];
								crossoptnum=localStorage.getItem('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
							}
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						var params = {
							page: 1,
							limit: 10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						this.$http.get('dingdanxinxi/list', {
							params: params
						}).then(res => {
							if(res.data.data.total>=crossoptnum) {
								this.$message({
									message: localStorage.getItem('tips'),
									type: 'error',
									duration: 1500,
								});
								return false;
							} else {
								// 跨表计算
								var obj = JSON.parse(localStorage.getItem('crossObj'));
								var table = localStorage.getItem('crossTable');

								obj.shuliang = parseFloat(obj.shuliang) - parseFloat(this.ruleForm.shuliang)

								this.$http.post(table+`/update`,obj).then(res => {});
								this.$http.post(`dingdanxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
									if (res.data.code == 0) {
										this.$message({
											message: '操作成功',
											type: 'success',
											duration: 1500,
											onClose: () => {
												this.$router.go(-1);
											}
										});
									} else {
										this.$message({
											message: res.data.msg,
											type: 'error',
											duration: 1500
										});
									}
								});
							}
						});
					} else {
						var obj = JSON.parse(localStorage.getItem('crossObj'));
						var table = localStorage.getItem('crossTable');

						obj.shuliang = parseFloat(obj.shuliang) - parseFloat(this.ruleForm.shuliang)

						this.$http.post(table+`/update`,obj).then(res => {});
						this.$http.post(`dingdanxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
							if (res.data.code == 0) {
								this.$message({
									message: '操作成功',
									type: 'success',
									duration: 1500,
									onClose: () => {
										this.$router.go(-1);
									}
								});
							} else {
								this.$message({
									message: res.data.msg,
									type: 'error',
									duration: 1500
								});
							}
						});
					}
				}
			});
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		// 返回
		back() {
			this.$router.go(-1);
		},
      xianhuatupianUploadChange(fileUrls) {
          this.ruleForm.xianhuatupian = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 150px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 150px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input__inner {
		text-align: left;
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 12px;
	  outline: none;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  height: 40px;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__decrease {
		display: none;
	}
	.add-update-preview .el-input-number /deep/ .el-input-number__increase {
		display: none;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 0 10px 0 30px;
	  outline: none;
	  color: #000;
	  width: auto;
	  font-size: 14px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  border: 1px dashed #000;
	  cursor: pointer;
	  border-radius: 6px;
	  color: #000;
	  width: 100px;
	  font-size: 32px;
	  line-height: 100px;
	  text-align: center;
	  height: 100px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #000000;
	  border-radius: 4px;
	  padding: 12px;
	  color: #000;
	  width: 400px;
	  font-size: 14px;
	  min-height: 120px;
	  height: auto;
	}
</style>
