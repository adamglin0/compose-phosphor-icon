package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Wechat-logo-thin`: ImageVector
    get() {
        if (`_wechat-logo-thin` != null) {
            return `_wechat-logo-thin`!!
        }
        `_wechat-logo-thin` = Builder(name = "Wechat-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 140.0f, 140.0f)
                close()
                moveTo(188.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 188.0f, 132.0f)
                close()
                moveTo(235.5f, 212.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.9f, 14.9f)
                lineToRelative(-26.21f, -7.71f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 89.24f, 179.68f)
                arcToRelative(75.0f, 75.0f, 0.0f, false, true, -27.63f, -7.89f)
                lineTo(35.4f, 179.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.9f, -14.9f)
                lineToRelative(7.71f, -26.21f)
                arcTo(76.0f, 76.0f, 0.0f, true, true, 166.79f, 76.32f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 61.0f, 110.07f)
                close()
                moveTo(86.5f, 171.32f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 158.0f, 76.05f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, -122.0f, 60.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.31f, 3.0f)
                lineToRelative(-8.17f, 27.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, 5.0f)
                lineToRelative(27.76f, -8.17f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 3.0f, 0.31f)
                arcTo(66.93f, 66.93f, 0.0f, false, false, 86.5f, 171.32f)
                close()
                moveTo(227.83f, 214.86f)
                lineTo(219.66f, 187.1f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 0.31f, -3.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 192.08f, 212.0f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, true, 1.89f, -0.47f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.13f, 0.16f)
                lineToRelative(27.76f, 8.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, -5.0f)
                close()
            }
        }
        .build()
        return `_wechat-logo-thin`!!
    }

private var `_wechat-logo-thin`: ImageVector? = null
