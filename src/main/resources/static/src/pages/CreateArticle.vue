<template>
  <div>
    <el-form class="articleForm" ref="articleForm" :model="article" :rules="rules" label-width="80px">
      <el-form-item label="标题" prop="title">
        <el-input v-model="article.title" placeholder="请输入标题"></el-input>
      </el-form-item>

      <el-form-item label="作者" prop="author">
        <el-input v-model="article.author" placeholder="请输入作者"></el-input>
      </el-form-item>

      <el-form-item label="类型" prop="type">
        <el-select v-model="article.type" placeholder="请选择文章类型">
          <el-option label="Java" value="Java"></el-option>
          <el-option label="JavaScript" value="JavaScript"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item label="标签" prop="tag">
        <el-input v-model="article.tag" placeholder="请输入标签,每个以`,`分割"></el-input>
      </el-form-item>

      <el-form-item label="分类" prop="category">
        <el-select v-model="article.category" placeholder="请选择文章分类">
          <el-option label="Java" value="Java"></el-option>
          <el-option label="JavaScript" value="JavaScript"></el-option>
        </el-select>
      </el-form-item>

      <el-form-item label="内容" prop="content" class="is-required" :class="{'is-error': contentError}">
        <quill-editor ref="content"
                      v-model="article.content"
                      :options="editorOption"
                      @blur="onEditorBlur($event)"
                      @focus="onEditorFocus($event)"
                      @change="onEditorChange($event)"
                      @ready="onEditorReady($event)">
        </quill-editor>
        <div v-if="contentError" class="el-form-item__error">请输入文章正文</div>
      </el-form-item>

      <el-form-item>
        <el-button type="primary" @click="onSubmit('articleForm')">立即发布</el-button>
        <el-button type="defualt">保存为草稿</el-button>
      </el-form-item>
    </el-form>
    <div v-html="article.content" style="margin: 10% 10%;"></div>
  </div>
</template>

<script>
  export default {
    name: 'CreateArticle',
    components: {},
    computed: {
      editor() {
        return this.$refs.content.quill
      }
    },
    data() {
      return {
        editorOption: {},
        contentError: false,
        article: {
          title: '',
          author: '',
          type: '',
          tag: '',
          category: '',
          content: ''
        },
        rules: {
          title: [
            {required: true, message: '请输入文章标题', trigger: 'blur, change'},
          ],
          author: [
            {required: true, message: '请输入作者', trigger: 'blur, change'},
          ],
          type: [
            {required: true, message: '请选择文章类型', trigger: 'blur, change'},
          ],
          tag: [
            {required: true, message: '请输入标签, 每个以`,`分割', trigger: 'blur, change'},
          ],
          category: [
            {required: true, message: '请选择分类', trigger: 'blur, change'},
          ],
//          content: [
//            {required: true, message: '请输入文章正文', trigger: 'blur, change'},
//          ],

        },
      }
    },
    methods: {
      onEditorReady(editor) {
        $('.articleForm .ql-container')
          .height('200px')
          .css('border', '1px solid #CCCCCC');
      },
      onEditorBlur(editor) {
        this.validateContent();
      },
      onEditorChange(editor) {
        this.validateContent();
      },
      onEditorFocus(editor) {
      },
      validateContent() {
        if (this.article.content === '') {
          this.contentError = true;
          $('.articleForm .ql-container').css('border', '1px solid #FF4949');
          return true;
        } else {
          this.contentError = false;
          $('.articleForm .ql-container').css('border', '1px solid #CCCCCC');
          return false;
        }
      },
      onSubmit(articleForm) {
        this.$refs[articleForm].validate((valid) => {
          var flag = this.validateContent();
          if (valid && !flag) {
            this.$axios.get('/api/employee/getEmployees.do').then(function (response) {
              console.log(response);
            }).catch(function (error) {
              console.log(error);
            });
          } else {
            this.$message.error('错了哦，这是一条错误消息!');
            return false;
          }
        });
      },
    },

  }
</script>

<style scoped>
  .articleForm {
    margin: 20px 15%;
  }
</style>
