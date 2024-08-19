package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flowarrow: ImageVector
    get() {
        if (_flowarrow != null) {
            return _flowarrow!!
        }
        _flowarrow = Builder(name = "Flowarrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 74.34f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(220.69f, 72.0f)
                horizontalLineTo(208.0f)
                curveToRelative(-49.33f, 0.0f, -61.05f, 28.12f, -71.38f, 52.92f)
                curveToRelative(-9.38f, 22.51f, -16.92f, 40.59f, -49.48f, 42.84f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.1f, 16.0f)
                curveToRelative(43.26f, -2.65f, 54.34f, -29.15f, 64.14f, -52.69f)
                curveTo(161.41f, 107.0f, 169.33f, 88.0f, 208.0f, 88.0f)
                horizontalLineToRelative(12.69f)
                lineToRelative(-18.35f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineToRelative(32.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 245.66f, 74.34f)
                close()
                moveTo(48.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 200.0f)
                close()
            }
        }
        .build()
        return _flowarrow!!
    }

private var _flowarrow: ImageVector? = null
