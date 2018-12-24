/***********************************************************************
 * Module:  学生.java
 * Author:  coco
 * Purpose: Defines the Class 学生
 ***********************************************************************/

import java.util.*;

/** @pdOid 502a8e5c-5f4a-474f-b617-062a6c5ea5a1 */
public class 学生 {
   /** @pdOid c077b926-67bb-4e89-993e-a8608e7f069c */
   public java.lang.String 学号;
   /** @pdOid a556f09f-5484-4f2f-9ff9-19b516d6e1d7 */
   public java.lang.String 姓名;
   /** @pdOid 0af4019d-b49b-43d9-8d2b-b2a0a4ae779e */
   public java.lang.String 性别;
   /** @pdOid eb90ebca-d3db-477b-ba86-4dfed86951c9 */
   public java.util.Date 出生日期;
   /** @pdOid d8fc79f6-615e-4586-92fd-74ca079038d0 */
   public java.lang.String 籍贯;
   /** @pdOid a429c29e-29fe-415e-831f-a2cda8c2f45a */
   public java.lang.String 民族;
   /** @pdOid 0738affd-0def-4730-97cb-69923459a08f */
   public java.lang.String 政治面貌;
   /** @pdOid a41564a2-8770-430e-a625-99330794d2b5 */
   public java.lang.String 身份证号;
   /** @pdOid d59c86bc-d841-4e64-8a16-f884d2ce13d0 */
   public double 高考成绩;
   /** @pdOid 0eea6a3b-f10e-4877-9897-ea91cbc7ae3b */
   public java.lang.String 档案编号;
   
   public java.util.Collection 成绩;
   /** @pdRoleInfo migr=no name=考试安排 assc=学生考试安排 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<考试安排> 考试安排;
   /** @pdRoleInfo migr=no name=选课 assc=学生选课 coll=java.util.Collection impl=java.util.HashSet mult=0..* type=Composition */
   public java.util.Collection<选课> 选课;
   /** @pdRoleInfo migr=no name=班级 assc=班级学生 mult=1..1 side=A */
   public 班级 班级;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<考试安排> get考试安排() {
      if (考试安排 == null)
         考试安排 = new java.util.HashSet<考试安排>();
      return 考试安排;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator考试安排() {
      if (考试安排 == null)
         考试安排 = new java.util.HashSet<考试安排>();
      return 考试安排.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new考试安排 */
   public void set考试安排(java.util.Collection<考试安排> new考试安排) {
      removeAll考试安排();
      for (java.util.Iterator iter = new考试安排.iterator(); iter.hasNext();)
         add考试安排((考试安排)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new考试安排 */
   public void add考试安排(考试安排 new考试安排) {
      if (new考试安排 == null)
         return;
      if (this.考试安排 == null)
         this.考试安排 = new java.util.HashSet<考试安排>();
      if (!this.考试安排.contains(new考试安排))
      {
         this.考试安排.add(new考试安排);
         new考试安排.set学生(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old考试安排 */
   public void remove考试安排(考试安排 old考试安排) {
      if (old考试安排 == null)
         return;
      if (this.考试安排 != null)
         if (this.考试安排.contains(old考试安排))
         {
            this.考试安排.remove(old考试安排);
            old考试安排.set学生((学生)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll考试安排() {
      if (考试安排 != null)
      {
         考试安排 old考试安排;
         for (java.util.Iterator iter = getIterator考试安排(); iter.hasNext();)
         {
            old考试安排 = (考试安排)iter.next();
            iter.remove();
            old考试安排.set学生((学生)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<选课> get选课() {
      if (选课 == null)
         选课 = new java.util.HashSet<选课>();
      return 选课;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator选课() {
      if (选课 == null)
         选课 = new java.util.HashSet<选课>();
      return 选课.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new选课 */
   public void set选课(java.util.Collection<选课> new选课) {
      removeAll选课();
      for (java.util.Iterator iter = new选课.iterator(); iter.hasNext();)
         add选课((选课)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new选课 */
   public void add选课(选课 new选课) {
      if (new选课 == null)
         return;
      if (this.选课 == null)
         this.选课 = new java.util.HashSet<选课>();
      if (!this.选课.contains(new选课))
      {
         this.选课.add(new选课);
         new选课.set学生(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old选课 */
   public void remove选课(选课 old选课) {
      if (old选课 == null)
         return;
      if (this.选课 != null)
         if (this.选课.contains(old选课))
         {
            this.选课.remove(old选课);
            old选课.set学生((学生)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll选课() {
      if (选课 != null)
      {
         选课 old选课;
         for (java.util.Iterator iter = getIterator选课(); iter.hasNext();)
         {
            old选课 = (选课)iter.next();
            iter.remove();
            old选课.set学生((学生)null);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 班级 get班级() {
      return 班级;
   }
   
   /** @pdGenerated default parent setter
     * @param new班级 */
   public void set班级(班级 new班级) {
      if (this.班级 == null || !this.班级.equals(new班级))
      {
         if (this.班级 != null)
         {
            班级 old班级 = this.班级;
            this.班级 = null;
            old班级.remove学生(this);
         }
         if (new班级 != null)
         {
            this.班级 = new班级;
            this.班级.add学生(this);
         }
      }
   }

}