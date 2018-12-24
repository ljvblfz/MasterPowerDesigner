/***********************************************************************
 * Module:  考试安排.java
 * Author:  coco
 * Purpose: Defines the Class 考试安排
 ***********************************************************************/

import java.util.*;

/** @pdOid 8d918ef8-9fac-4b37-9568-ea191107260e */
public class 考试安排 {
   /** @pdOid eb71f8d7-28d9-4b0a-ac6d-a9adfb5eb18e */
   public java.util.Date 时间;
   
   /** @pdRoleInfo migr=no name=教室 assc=教室考试安排 mult=1..1 side=A */
   public 教室 教室;
   /** @pdRoleInfo migr=no name=课程 assc=课程考试安排 mult=1..1 side=A */
   public 课程 课程;
   /** @pdRoleInfo migr=no name=学生 assc=学生考试安排 mult=1..1 side=A */
   public 学生 学生;
   
   
   /** @pdGenerated default parent getter */
   public 教室 get教室() {
      return 教室;
   }
   
   /** @pdGenerated default parent setter
     * @param new教室 */
   public void set教室(教室 new教室) {
      if (this.教室 == null || !this.教室.equals(new教室))
      {
         if (this.教室 != null)
         {
            教室 old教室 = this.教室;
            this.教室 = null;
            old教室.remove考试安排(this);
         }
         if (new教室 != null)
         {
            this.教室 = new教室;
            this.教室.add考试安排(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 课程 get课程() {
      return 课程;
   }
   
   /** @pdGenerated default parent setter
     * @param new课程 */
   public void set课程(课程 new课程) {
      if (this.课程 == null || !this.课程.equals(new课程))
      {
         if (this.课程 != null)
         {
            课程 old课程 = this.课程;
            this.课程 = null;
            old课程.remove考试安排(this);
         }
         if (new课程 != null)
         {
            this.课程 = new课程;
            this.课程.add考试安排(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 学生 get学生() {
      return 学生;
   }
   
   /** @pdGenerated default parent setter
     * @param new学生 */
   public void set学生(学生 new学生) {
      if (this.学生 == null || !this.学生.equals(new学生))
      {
         if (this.学生 != null)
         {
            学生 old学生 = this.学生;
            this.学生 = null;
            old学生.remove考试安排(this);
         }
         if (new学生 != null)
         {
            this.学生 = new学生;
            this.学生.add考试安排(this);
         }
      }
   }

}