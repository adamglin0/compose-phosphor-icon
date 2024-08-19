package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(7.61f, 7.61f, 0.0f, false, true, -1.57f, -0.16f)
                lineTo(156.0f, 161.0f)
                verticalLineToRelative(23.73f)
                lineToRelative(17.66f, 17.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 208.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, 7.43f)
                lineToRelative(-37.0f, -14.81f)
                lineTo(91.0f, 239.43f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 232.0f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.66f)
                lineTo(100.0f, 184.69f)
                verticalLineTo(161.0f)
                lineTo(25.57f, 175.84f)
                arcTo(7.61f, 7.61f, 0.0f, false, true, 24.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.42f, -7.16f)
                lineTo(100.0f, 89.06f)
                verticalLineTo(44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineTo(89.06f)
                lineToRelative(79.58f, 39.78f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 136.0f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
