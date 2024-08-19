package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Empty-bold`: ImageVector
    get() {
        if (`_empty-bold` != null) {
            return `_empty-bold`!!
        }
        `_empty-bold` = Builder(name = "Empty-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(203.63f, 62.65f)
                lineToRelative(13.25f, -14.58f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f)
                lineTo(185.88f, 46.49f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 52.37f, 193.35f)
                lineTo(39.12f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, 16.14f)
                lineToRelative(13.24f, -14.56f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 203.63f, 62.65f)
                close()
                moveTo(52.0f, 128.0f)
                arcTo(75.94f, 75.94f, 0.0f, false, true, 169.58f, 64.43f)
                lineToRelative(-100.91f, 111.0f)
                arcTo(75.6f, 75.6f, 0.0f, false, true, 52.0f, 128.0f)
                close()
                moveTo(128.0f, 204.0f)
                arcToRelative(75.52f, 75.52f, 0.0f, false, true, -41.58f, -12.43f)
                lineToRelative(100.91f, -111.0f)
                arcTo(75.94f, 75.94f, 0.0f, false, true, 128.0f, 204.0f)
                close()
            }
        }
        .build()
        return `_empty-bold`!!
    }

private var `_empty-bold`: ImageVector? = null
