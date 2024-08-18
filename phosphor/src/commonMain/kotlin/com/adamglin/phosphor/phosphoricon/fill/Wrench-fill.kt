package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Wrench-fill`: ImageVector
    get() {
        if (`_wrench-fill` != null) {
            return `_wrench-fill`!!
        }
        `_wrench-fill` = Builder(name = "Wrench-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 96.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -100.94f, 66.0f)
                lineTo(79.0f, 222.22f)
                curveToRelative(-0.12f, 0.14f, -0.26f, 0.29f, -0.39f, 0.42f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -45.26f, -45.26f)
                curveToRelative(0.14f, -0.13f, 0.28f, -0.27f, 0.43f, -0.39f)
                lineTo(94.0f, 124.94f)
                arcToRelative(72.07f, 72.07f, 0.0f, false, true, 83.54f, -98.78f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.93f, 13.19f)
                lineTo(144.0f, 80.0f)
                lineToRelative(5.66f, 26.35f)
                lineTo(176.0f, 112.0f)
                lineToRelative(40.65f, -37.52f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.19f, 3.93f)
                arcTo(72.6f, 72.6f, 0.0f, false, true, 232.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_wrench-fill`!!
    }

private var `_wrench-fill`: ImageVector? = null
