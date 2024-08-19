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

public val LightGroup.Arrowclockwise: ImageVector
    get() {
        if (_arrowclockwise != null) {
            return _arrowclockwise!!
        }
        _arrowclockwise = Builder(name = "Arrowclockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.55f)
                lineToRelative(-30.38f, -27.8f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.13f, -0.19f, -0.19f)
                arcToRelative(82.0f, 82.0f, 0.0f, true, false, -1.7f, 117.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.24f, 8.73f)
                arcTo(93.46f, 93.46f, 0.0f, false, true, 128.0f, 222.0f)
                horizontalLineToRelative(-1.28f)
                arcTo(94.0f, 94.0f, 0.0f, true, true, 194.37f, 61.4f)
                lineTo(226.0f, 90.35f)
                verticalLineTo(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowclockwise!!
    }

private var _arrowclockwise: ImageVector? = null
