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

public val BoldGroup.`Gavel-bold`: ImageVector
    get() {
        if (`_gavel-bold` != null) {
            return `_gavel-bold`!!
        }
        `_gavel-bold` = Builder(name = "Gavel-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.14f, 113.86f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -23.06f, -3.75f)
                lineToRelative(-45.2f, -45.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.74f, -23.06f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.28f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 23.0f, 3.79f)
                lineTo(29.36f, 181.38f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f)
                lineTo(134.0f, 167.21f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 3.81f, 22.94f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f)
                close()
                moveTo(80.0f, 98.34f)
                lineTo(69.64f, 88.0f)
                lineTo(128.0f, 29.65f)
                lineTo(138.34f, 40.0f)
                close()
                moveTo(57.64f, 209.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineToRelative(59.52f, -59.52f)
                lineToRelative(11.31f, 11.32f)
                close()
                moveTo(150.34f, 149.38f)
                lineTo(106.62f, 105.66f)
                lineTo(145.62f, 66.66f)
                lineTo(189.34f, 110.38f)
                close()
                moveTo(167.99f, 186.38f)
                lineTo(157.65f, 176.0f)
                lineTo(216.0f, 117.66f)
                lineTo(226.34f, 128.0f)
                close()
            }
        }
        .build()
        return `_gavel-bold`!!
    }

private var `_gavel-bold`: ImageVector? = null
