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

public val LightGroup.EjectSimple: ImageVector
    get() {
        if (_ejectSimple != null) {
            return _ejectSimple!!
        }
        _ejectSimple = Builder(name = "EjectSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(32.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 194.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 200.0f)
                close()
                moveTo(27.39f, 150.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 29.16f, 135.0f)
                lineTo(110.82f, 34.2f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 34.36f, 0.0f)
                lineTo(226.84f, 135.0f)
                arcToRelative(14.09f, 14.09f, 0.0f, false, true, -10.93f, 23.0f)
                lineTo(40.09f, 158.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 27.39f, 150.0f)
                close()
                moveTo(38.22f, 144.84f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 40.09f, 146.0f)
                lineTo(215.91f, 146.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.87f, -1.18f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.27f, -2.24f)
                lineTo(135.86f, 41.76f)
                arcToRelative(10.1f, 10.1f, 0.0f, false, false, -15.72f, 0.0f)
                lineTo(38.49f, 142.58f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 38.22f, 144.82f)
                close()
            }
        }
        .build()
        return _ejectSimple!!
    }

private var _ejectSimple: ImageVector? = null
