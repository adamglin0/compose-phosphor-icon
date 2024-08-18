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

public val FillGroup.`Airplane-in-flight-fill`: ImageVector
    get() {
        if (`_airplane-in-flight-fill` != null) {
            return `_airplane-in-flight-fill`!!
        }
        `_airplane-in-flight-fill` = Builder(name = "Airplane-in-flight-fill", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f)
                horizontalLineTo(216.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 216.0f)
                close()
                moveTo(208.0f, 96.0f)
                horizontalLineTo(147.32f)
                lineTo(101.66f, 50.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 48.0f)
                horizontalLineTo(88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.83f, 69.06f)
                lineToRelative(9.0f, 26.94f)
                horizontalLineTo(59.32f)
                lineTo(37.66f, 74.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 72.0f)
                horizontalLineTo(24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.69f, 92.6f)
                lineToRelative(14.07f, 46.89f)
                arcTo(39.75f, 39.75f, 0.0f, false, false, 61.07f, 168.0f)
                horizontalLineTo(240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(136.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_airplane-in-flight-fill`!!
    }

private var `_airplane-in-flight-fill`: ImageVector? = null
