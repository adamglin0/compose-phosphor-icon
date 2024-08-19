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

public val LightGroup.Chartpie: ImageVector
    get() {
        if (_chartpie != null) {
            return _chartpie!!
        }
        _chartpie = Builder(name = "Chartpie", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(202.74f, 77.92f)
                lineTo(134.0f, 117.61f)
                lineTo(134.0f, 38.2f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 202.74f, 77.92f)
                close()
                moveTo(122.0f, 38.2f)
                verticalLineToRelative(86.34f)
                lineTo(47.24f, 167.7f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -74.74f, -39.92f)
                lineTo(208.76f, 88.3f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _chartpie!!
    }

private var _chartpie: ImageVector? = null
