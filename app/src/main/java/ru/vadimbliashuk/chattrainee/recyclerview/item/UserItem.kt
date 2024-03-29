package ru.vadimbliashuk.chattrainee.recyclerview.item

import android.content.Context
import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.Item
import com.xwray.groupie.kotlinandroidextensions.ViewHolder
import kotlinx.android.synthetic.main.user_row_new_message.view.*
import ru.vadimbliashuk.chattrainee.R
import ru.vadimbliashuk.chattrainee.models.User


class UserItem(
    val person: User,
    val userId: String,
    private val context: Context
) : Item() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.tv_username_rv_item_newmessage_activity.text = person.username

        Picasso.get()
            .load(person.profileImageUrl)
            .resize(70, 70)
            .centerCrop()
            .into(viewHolder.itemView.iv_photo_rv_item_newmessage)
    }

    override fun getLayout() = R.layout.user_row_new_message


}