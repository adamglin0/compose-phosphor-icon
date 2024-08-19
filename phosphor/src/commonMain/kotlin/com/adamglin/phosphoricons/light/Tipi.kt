package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Tipi: ImageVector
    get() {
        if (_tipi != null) {
            return _tipi!!
        }
        _tipi = Builder(name = "Tipi", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.05f, 212.77f)
                lineTo(135.12f, 53.5f)
                lineToRelative(21.93f, -34.26f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 147.0f, 12.77f)
                lineTo(128.0f, 42.37f)
                lineToRelative(-19.0f, -29.6f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 99.0f, 19.24f)
                lineTo(120.88f, 53.5f)
                lineTo(19.0f, 212.77f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 222.0f)
                lineTo(232.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.05f, -9.23f)
                close()
                moveTo(82.64f, 210.0f)
                lineTo(128.0f, 139.13f)
                lineTo(173.36f, 210.0f)
                close()
                moveTo(187.64f, 210.0f)
                lineTo(133.09f, 124.77f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.1f, 0.0f)
                lineTo(68.4f, 210.0f)
                lineTo(35.0f, 210.0f)
                lineTo(128.0f, 64.63f)
                lineTo(221.0f, 210.0f)
                close()
            }
        }
        .build()
        return _tipi!!
    }

private var _tipi: ImageVector? = null
