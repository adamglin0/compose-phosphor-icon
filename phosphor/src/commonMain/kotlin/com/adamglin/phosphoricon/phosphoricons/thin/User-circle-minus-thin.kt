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

public val ThinGroup.`User-circle-minus-thin`: ImageVector
    get() {
        if (`_user-circle-minus-thin` != null) {
            return `_user-circle-minus-thin`!!
        }
        `_user-circle-minus-thin` = Builder(name = "User-circle-minus-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(176.0f, 60.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 56.0f)
                close()
                moveTo(222.31f, 94.67f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 128.0f, 28.0f)
                arcToRelative(100.69f, 100.69f, 0.0f, false, true, 16.66f, 1.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.32f, 7.89f)
                arcTo(93.4f, 93.4f, 0.0f, false, false, 128.0f, 36.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 62.83f, 192.87f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, -34.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.32f, 0.0f)
                arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, 34.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 21.6f, -95.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.54f, -2.66f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.61f, 91.61f, 0.0f, false, false, 59.14f, -21.58f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.27f, 0.0f)
                arcTo(91.56f, 91.56f, 0.0f, false, false, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return `_user-circle-minus-thin`!!
    }

private var `_user-circle-minus-thin`: ImageVector? = null
