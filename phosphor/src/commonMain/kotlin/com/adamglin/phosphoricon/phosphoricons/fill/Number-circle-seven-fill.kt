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

public val FillGroup.`Number-circle-seven-fill`: ImageVector
    get() {
        if (`_number-circle-seven-fill` != null) {
            return `_number-circle-seven-fill`!!
        }
        `_number-circle-seven-fill` = Builder(name = "Number-circle-seven-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(159.52f, 90.73f)
                lineTo(127.52f, 178.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 184.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.73f, -0.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.79f, -10.25f)
                lineTo(140.58f, 96.0f)
                lineTo(104.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.52f, 10.73f)
                close()
            }
        }
        .build()
        return `_number-circle-seven-fill`!!
    }

private var `_number-circle-seven-fill`: ImageVector? = null
