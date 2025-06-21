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
            <el-input v-model.number="ruleForm.zongjine" 
                placeholder="总金额" clearable :disabled=" false  ||ro.zongjine"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="下单时间" prop="xiadanshijian">
            <el-input v-model="ruleForm.xiadanshijian" 
                placeholder="下单时间" clearable :disabled=" false  ||ro.xiadanshijian"></el-input>
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
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}'  label="配送状态" prop="peisongzhuangtai">
            <el-select v-model="ruleForm.peisongzhuangtai" placeholder="请选择配送状态" :disabled="true  ||ro.peisongzhuangtai" >
              <el-option
                  v-for="(item,index) in peisongzhuangtaiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="备货时间" prop="beihuoshijian">
            <el-input v-model="ruleForm.beihuoshijian" 
                placeholder="备货时间" clearable :disabled=" false  ||ro.beihuoshijian"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="接单时间" prop="jiedanshijian">
              <el-date-picker
				  :disabled=" false  ||ro.jiedanshijian"
                  value-format="yyyy-MM-dd HH:mm:ss"
                  v-model="ruleForm.jiedanshijian" 
                  type="datetime"
                  placeholder="接单时间">
              </el-date-picker>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="配送账号" prop="peisongzhanghao">
            <el-input v-model="ruleForm.peisongzhanghao" 
                placeholder="配送账号" clearable :disabled=" false  ||ro.peisongzhanghao"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="配送姓名" prop="peisongxingming">
            <el-input v-model="ruleForm.peisongxingming" 
                placeholder="配送姓名" clearable :disabled=" false  ||ro.peisongxingming"></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"10px","margin":"0 0 10px"}' label="联系方式" prop="lianxifangshi">
            <el-input v-model="ruleForm.lianxifangshi" 
                placeholder="联系方式" clearable :disabled=" false  ||ro.lianxifangshi"></el-input>
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
				peisongzhuangtai : false,
				beihuoshijian : false,
				jiedanshijian : false,
				peisongzhanghao : false,
				peisongxingming : false,
				lianxifangshi : false,
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
          peisongzhuangtai: '配送中' ,
          beihuoshijian: '',
          jiedanshijian: '',
          peisongzhanghao: '',
          peisongxingming: '',
          lianxifangshi: '',
        },
        peisongzhuangtaiOptions: [],


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
          peisongzhuangtai: [
          ],
          beihuoshijian: [
          ],
          jiedanshijian: [
          ],
          peisongzhanghao: [
          ],
          peisongxingming: [
          ],
          lianxifangshi: [
          ],
        },
		centerType: false,
      };
    },
    computed: {



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
      this.ruleForm.jiedanshijian = this.getCurDateTime()
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
            if(o=='peisongzhuangtai'){
              this.ruleForm.peisongzhuangtai = obj[o];
              this.ro.peisongzhuangtai = true;
              continue;
            }
            if(o=='beihuoshijian'){
              this.ruleForm.beihuoshijian = obj[o];
              this.ro.beihuoshijian = true;
              continue;
            }
            if(o=='jiedanshijian'){
              this.ruleForm.jiedanshijian = obj[o];
              this.ro.jiedanshijian = true;
              continue;
            }
            if(o=='peisongzhanghao'){
              this.ruleForm.peisongzhanghao = obj[o];
              this.ro.peisongzhanghao = true;
              continue;
            }
            if(o=='peisongxingming'){
              this.ruleForm.peisongxingming = obj[o];
              this.ro.peisongxingming = true;
              continue;
            }
            if(o=='lianxifangshi'){
              this.ruleForm.lianxifangshi = obj[o];
              this.ro.lianxifangshi = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
            if((json.shangjiazhanghao!=''&&json.shangjiazhanghao) || json.shangjiazhanghao==0){
                this.ruleForm.shangjiazhanghao = json.shangjiazhanghao
            }
            if((json.shangjiamingcheng!=''&&json.shangjiamingcheng) || json.shangjiamingcheng==0){
                this.ruleForm.shangjiamingcheng = json.shangjiamingcheng
            }
            if((json.shangjiadizhi!=''&&json.shangjiadizhi) || json.shangjiadizhi==0){
                this.ruleForm.shangjiadizhi = json.shangjiadizhi
            }
            if((json.lianxidianhua!=''&&json.lianxidianhua) || json.lianxidianhua==0){
                this.ruleForm.lianxidianhua = json.lianxidianhua
            }
            if((json.peisongzhanghao!=''&&json.peisongzhanghao) || json.peisongzhanghao==0){
                this.ruleForm.peisongzhanghao = json.peisongzhanghao
            }
            if((json.peisongxingming!=''&&json.peisongxingming) || json.peisongxingming==0){
                this.ruleForm.peisongxingming = json.peisongxingming
            }
            if((json.lianxifangshi!=''&&json.lianxifangshi) || json.lianxifangshi==0){
                this.ruleForm.lianxifangshi = json.lianxifangshi
            }
          }
        });
        this.peisongzhuangtaiOptions = "已配送,配送中".split(',')

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
        this.$http.get(`peisongjiedan/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

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
						this.$http.get('peisongjiedan/list', {
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


								this.$http.post(`peisongjiedan/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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


						this.$http.post(`peisongjiedan/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
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
