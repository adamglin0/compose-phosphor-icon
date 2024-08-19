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

public val LightGroup.`Subtract-light`: ImageVector
    get() {
        if (`_subtract-light` != null) {
            return `_subtract-light`!!
        }
        `_subtract-light` = Builder(name = "Subtract-light", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.91f, 83.08f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, -89.83f, 89.83f)
                arcToRelative(78.0f, 78.0f, 0.0f, true, false, 89.83f, -89.83f)
                close()
                moveTo(226.0f, 160.0f)
                arcToRelative(65.31f, 65.31f, 0.0f, false, true, -0.62f, 8.9f)
                lineToRelative(-53.76f, -53.77f)
                arcTo(77.84f, 77.84f, 0.0f, false, false, 174.0f, 96.0f)
                curveToRelative(0.0f, -0.17f, 0.0f, -0.34f, 0.0f, -0.51f)
                arcTo(65.8f, 65.8f, 0.0f, false, true, 226.0f, 160.0f)
                close()
                moveTo(146.71f, 155.19f)
                lineTo(202.21f, 210.69f)
                arcTo(66.0f, 66.0f, 0.0f, false, true, 182.52f, 222.0f)
                lineToRelative(-54.8f, -54.81f)
                arcTo(77.86f, 77.86f, 0.0f, false, false, 146.71f, 155.19f)
                close()
                moveTo(155.19f, 146.71f)
                arcToRelative(77.86f, 77.86f, 0.0f, false, false, 12.0f, -19.0f)
                lineTo(222.0f, 182.52f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, true, -11.35f, 19.69f)
                close()
                moveTo(30.0f, 96.0f)
                arcToRelative(66.0f, 66.0f, 0.0f, true, true, 66.0f, 66.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, true, 30.0f, 96.0f)
                close()
                moveTo(95.49f, 174.0f)
                lineTo(96.0f, 174.0f)
                arcToRelative(77.84f, 77.84f, 0.0f, false, false, 19.13f, -2.38f)
                lineToRelative(53.77f, 53.76f)
                arcTo(65.87f, 65.87f, 0.0f, false, true, 95.49f, 174.0f)
                close()
            }
        }
        .build()
        return `_subtract-light`!!
    }

private var `_subtract-light`: ImageVector? = null
