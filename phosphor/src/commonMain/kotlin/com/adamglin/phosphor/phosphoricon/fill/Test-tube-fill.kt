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

public val FillGroup.`Test-tube-fill`: ImageVector
    get() {
        if (`_test-tube-fill` != null) {
            return `_test-tube-fill`!!
        }
        `_test-tube-fill` = Builder(name = "Test-tube-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 86.34f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(37.11f, 155.57f)
                arcToRelative(44.77f, 44.77f, 0.0f, false, false, 63.32f, 63.32f)
                lineTo(212.32f, 107.0f)
                lineToRelative(22.21f, -7.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.25f)
                close()
                moveTo(205.47f, 92.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.13f, 1.93f)
                lineToRelative(-39.57f, 39.57f)
                curveToRelative(-8.47f, 2.9f, -21.75f, 4.0f, -39.07f, -5.0f)
                curveToRelative(-10.6f, -5.54f, -20.18f, -8.0f, -28.56f, -8.73f)
                lineTo(172.0f, 43.31f)
                lineTo(217.19f, 88.5f)
                close()
            }
        }
        .build()
        return `_test-tube-fill`!!
    }

private var `_test-tube-fill`: ImageVector? = null
