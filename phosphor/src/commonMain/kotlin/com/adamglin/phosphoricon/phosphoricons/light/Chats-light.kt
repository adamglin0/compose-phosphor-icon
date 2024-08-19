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

public val LightGroup.`Chats-light`: ImageVector
    get() {
        if (`_chats-light` != null) {
            return `_chats-light`!!
        }
        `_chats-light` = Builder(name = "Chats-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 82.0f)
                horizontalLineTo(182.0f)
                verticalLineTo(48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 48.0f)
                verticalLineTo(176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.42f, 5.41f)
                arcTo(5.86f, 5.86f, 0.0f, false, false, 32.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.77f, -1.33f)
                lineTo(73.71f, 150.0f)
                horizontalLineTo(74.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(94.29f)
                lineToRelative(37.94f, 30.67f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 230.0f)
                arcToRelative(5.86f, 5.86f, 0.0f, false, false, 2.58f, -0.59f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 224.0f)
                verticalLineTo(96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 82.0f)
                close()
                moveTo(71.58f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, 1.33f)
                lineTo(38.0f, 163.43f)
                verticalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(168.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(218.0f, 211.43f)
                lineToRelative(-29.81f, -24.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, -1.33f)
                horizontalLineTo(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(150.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(94.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return `_chats-light`!!
    }

private var `_chats-light`: ImageVector? = null
