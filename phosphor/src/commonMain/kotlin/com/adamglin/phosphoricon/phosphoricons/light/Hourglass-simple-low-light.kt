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

public val LightGroup.`Hourglass-simple-low-light`: ImageVector
    get() {
        if (`_hourglass-simple-low-light` != null) {
            return `_hourglass-simple-low-light`!!
        }
        `_hourglass-simple-low-light` = Builder(name = "Hourglass-simple-low-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.8f, 198.0f)
                lineToRelative(-73.12f, -70.0f)
                lineTo(209.8f, 58.0f)
                lineToRelative(0.09f, -0.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 34.0f)
                lineTo(56.0f, 34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -9.9f, 23.9f)
                lineToRelative(0.09f, 0.09f)
                lineToRelative(73.12f, 70.0f)
                lineTo(46.2f, 198.0f)
                lineToRelative(-0.09f, 0.09f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 56.0f, 222.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, -23.9f)
                close()
                moveTo(54.56f, 49.38f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 46.0f)
                lineTo(200.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.45f, 3.38f)
                lineTo(128.0f, 119.69f)
                close()
                moveTo(128.0f, 136.31f)
                lineTo(163.19f, 170.0f)
                lineTo(92.81f, 170.0f)
                close()
                moveTo(201.84f, 208.77f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 200.0f, 210.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.45f, -3.38f)
                lineTo(80.28f, 182.0f)
                horizontalLineToRelative(95.44f)
                lineToRelative(25.72f, 24.62f)
                arcTo(1.91f, 1.91f, 0.0f, false, true, 201.84f, 208.77f)
                close()
            }
        }
        .build()
        return `_hourglass-simple-low-light`!!
    }

private var `_hourglass-simple-low-light`: ImageVector? = null
