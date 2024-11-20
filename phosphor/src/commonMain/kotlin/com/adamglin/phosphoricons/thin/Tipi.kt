package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Tipi: ImageVector
    get() {
        if (_tipi != null) {
            return _tipi!!
        }
        _tipi = Builder(name = "Tipi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.37f, 213.84f)
                lineTo(132.75f, 53.5f)
                lineToRelative(22.62f, -35.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.74f, -4.32f)
                lineTo(128.0f, 46.08f)
                lineTo(107.37f, 13.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.74f, 4.32f)
                lineTo(123.25f, 53.5f)
                lineTo(20.63f, 213.84f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 220.0f)
                lineTo(232.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -6.16f)
                close()
                moveTo(79.0f, 212.0f)
                lineToRelative(49.0f, -76.58f)
                lineTo(177.0f, 212.0f)
                close()
                moveTo(186.52f, 212.0f)
                lineTo(131.38f, 125.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.74f, 0.0f)
                lineTo(69.49f, 212.0f)
                lineTo(31.31f, 212.0f)
                lineTo(128.0f, 60.92f)
                lineTo(224.69f, 212.0f)
                close()
            }
        }
        .build()
        return _tipi!!
    }

private var _tipi: ImageVector? = null
