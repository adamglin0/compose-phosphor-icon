package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Number-circle-nine-fill`: ImageVector
    get() {
        if (`_number-circle-nine-fill` != null) {
            return `_number-circle-nine-fill`!!
        }
        `_number-circle-nine-fill` = Builder(name = "Number-circle-nine-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(145.33f, 118.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 138.0f, 90.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 145.31f, 118.0f)
                close()
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(146.0f, 76.82f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 127.94f, 144.0f)
                quadToRelative(0.94f, 0.0f, 1.89f, -0.06f)
                lineToRelative(-16.7f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.77f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, -2.77f)
                lineTo(159.18f, 126.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, false, 146.0f, 76.82f)
                close()
            }
        }
        .build()
        return `_number-circle-nine-fill`!!
    }

private var `_number-circle-nine-fill`: ImageVector? = null
