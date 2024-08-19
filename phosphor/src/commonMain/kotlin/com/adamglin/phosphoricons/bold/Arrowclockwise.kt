package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Arrowclockwise: ImageVector
    get() {
        if (_arrowclockwise != null) {
            return _arrowclockwise!!
        }
        _arrowclockwise = Builder(name = "Arrowclockwise", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f)
                horizontalLineTo(201.1f)
                lineToRelative(-19.0f, -17.38f)
                curveToRelative(-0.13f, -0.12f, -0.26f, -0.24f, -0.38f, -0.37f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 127.0f, 204.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(75.53f, 75.53f, 0.0f, false, false, 52.15f, -20.72f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.49f, 17.45f)
                arcTo(99.45f, 99.45f, 0.0f, false, true, 128.0f, 228.0f)
                horizontalLineToRelative(-1.37f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 198.51f, 57.06f)
                lineTo(220.0f, 76.72f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowclockwise!!
    }

private var _arrowclockwise: ImageVector? = null
