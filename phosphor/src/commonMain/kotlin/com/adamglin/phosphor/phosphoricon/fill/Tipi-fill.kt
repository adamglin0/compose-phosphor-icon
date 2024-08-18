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

public val FillGroup.`Tipi-fill`: ImageVector
    get() {
        if (`_tipi-fill` != null) {
            return `_tipi-fill`!!
        }
        `_tipi-fill` = Builder(name = "Tipi-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.74f, 211.69f)
                lineTo(137.5f, 53.5f)
                lineToRelative(21.24f, -33.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.48f, -8.62f)
                lineTo(128.0f, 38.66f)
                lineToRelative(-17.26f, -27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.48f, 8.62f)
                lineTo(118.5f, 53.5f)
                lineTo(17.26f, 211.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 224.0f)
                lineTo(232.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.74f, -12.31f)
                close()
                moveTo(188.74f, 208.0f)
                lineTo(134.74f, 123.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.48f, 0.0f)
                lineTo(67.3f, 208.0f)
                lineTo(38.62f, 208.0f)
                lineTo(128.0f, 68.34f)
                lineTo(217.38f, 208.0f)
                close()
            }
        }
        .build()
        return `_tipi-fill`!!
    }

private var `_tipi-fill`: ImageVector? = null
