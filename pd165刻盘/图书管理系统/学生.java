/***********************************************************************
 * Module:  学生.java
 * Author:  Administrator
 * Purpose: Defines the Class 学生
 ***********************************************************************/

import java.util.*;

/** @pdOid ed78aeed-1858-47fb-86d9-810c1080f7f4 */
public class 学生 {
   /** @pdOid 52a35fff-e3b2-4fbd-b780-f872c2a39ce2 */
   public java.lang.String 学生姓名;
   /** @pdOid 67a977a3-9236-41b3-8767-8ba9e5a5981d */
   public java.lang.String 学生性别;
   /** @pdOid ff2dab00-5358-4b5a-b2ec-986321fd0768 */
   public java.util.Date 学生出生日期;
   /** @pdOid df052fed-5b65-4262-b2c1-95c879aaba8e */
   public java.lang.String 学生民族;
   /** @pdOid 31a652e8-e4cd-4737-9ab3-dc12d1702d42 */
   public java.lang.String 学生政治面貌;
   
   /** @pdRoleInfo migr=no name=班级 assc=班级学生 mult=1..1 side=A */
   public 班级 班级;
   /** @pdRoleInfo migr=no name=读者 assc=读者6 mult=1..1 side=A */
   public 读者 读者;
   
   
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