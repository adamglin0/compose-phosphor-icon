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

public val LightGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.84f, 51.39f)
                arcToRelative(284.14f, 284.14f, 0.0f, false, false, -49.16f, -32.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                arcTo(284.14f, 284.14f, 0.0f, false, false, 76.16f, 51.39f)
                curveTo(42.88f, 79.13f, 26.0f, 107.59f, 26.0f, 136.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 75.24f, 49.65f)
                lineToRelative(-11.0f, 36.63f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 230.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.75f, -7.72f)
                lineToRelative(-11.0f, -36.63f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 230.0f, 136.0f)
                curveTo(230.0f, 107.59f, 213.12f, 79.13f, 179.84f, 51.39f)
                close()
                moveTo(176.0f, 178.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -27.6f, -10.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.69f, 6.24f)
                lineTo(151.94f, 218.0f)
                horizontalLineTo(104.06f)
                lineToRelative(13.23f, -44.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.69f, -6.24f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 38.0f, 136.0f)
                curveToRelative(0.0f, -53.73f, 74.77f, -97.0f, 90.0f, -105.22f)
                curveTo(143.24f, 39.0f, 218.0f, 82.2f, 218.0f, 136.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 176.0f, 178.0f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
