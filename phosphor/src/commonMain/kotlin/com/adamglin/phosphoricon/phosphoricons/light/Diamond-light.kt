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

public val LightGroup.`Diamond-light`: ImageVector
    get() {
        if (`_diamond-light` != null) {
            return `_diamond-light`!!
        }
        `_diamond-light` = Builder(name = "Diamond-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.92f, 118.14f)
                lineTo(137.86f, 22.08f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.72f, 0.0f)
                lineTo(22.08f, 118.14f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.72f)
                lineToRelative(96.06f, 96.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.72f, 0.0f)
                lineToRelative(96.0f, -96.06f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 0.0f, -19.72f)
                close()
                moveTo(225.43f, 129.38f)
                lineTo(129.38f, 225.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.76f, 0.0f)
                lineTo(30.57f, 129.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.76f)
                lineToRelative(96.05f, -96.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.76f, 0.0f)
                lineToRelative(96.05f, 96.06f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.76f)
                close()
            }
        }
        .build()
        return `_diamond-light`!!
    }

private var `_diamond-light`: ImageVector? = null
