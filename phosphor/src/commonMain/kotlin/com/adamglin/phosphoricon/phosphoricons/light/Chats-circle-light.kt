package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Chats-circle-light`: ImageVector
    get() {
        if (`_chats-circle-light` != null) {
            return `_chats-circle-light`!!
        }
        `_chats-circle-light` = Builder(name = "Chats-circle-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.93f, 186.58f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 168.16f, 74.42f)
                arcTo(78.0f, 78.0f, 0.0f, true, false, 26.07f, 138.58f)
                lineTo(18.58f, 164.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 36.0f, 181.42f)
                lineToRelative(25.46f, -7.49f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 26.39f, 7.63f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 106.77f, 40.37f)
                lineTo(220.0f, 229.42f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 237.42f, 212.0f)
                close()
                moveTo(62.0f, 161.5f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, -1.69f, 0.24f)
                lineToRelative(-27.77f, 8.17f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.48f, -2.48f)
                lineToRelative(8.17f, -27.77f)
                arcToRelative(6.05f, 6.05f, 0.0f, false, false, -0.47f, -4.53f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 27.08f, 27.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 62.0f, 161.5f)
                close()
                moveTo(217.71f, 187.66f)
                lineTo(225.88f, 215.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.48f, 2.48f)
                lineToRelative(-27.77f, -8.17f)
                arcToRelative(6.06f, 6.06f, 0.0f, false, false, -4.53f, 0.47f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -90.0f, -28.4f)
                arcToRelative(77.92f, 77.92f, 0.0f, false, false, 71.0f, -94.68f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, 46.07f, 96.0f)
                arcTo(6.05f, 6.05f, 0.0f, false, false, 217.74f, 187.66f)
                close()
            }
        }
        .build()
        return `_chats-circle-light`!!
    }

private var `_chats-circle-light`: ImageVector? = null
