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

public val RegularGroup.Arrowsclockwise: ImageVector
    get() {
        if (_arrowsclockwise != null) {
            return _arrowsclockwise!!
        }
        _arrowsclockwise = Builder(name = "Arrowsclockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 48.0f)
                verticalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(28.69f)
                lineTo(182.06f, 73.37f)
                arcToRelative(79.56f, 79.56f, 0.0f, false, false, -56.13f, -23.43f)
                horizontalLineToRelative(-0.45f)
                arcTo(79.52f, 79.52f, 0.0f, false, false, 69.59f, 72.71f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 58.41f, 61.27f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 135.0f, 0.79f)
                lineTo(208.0f, 76.69f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(186.41f, 183.29f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -112.47f, -0.66f)
                lineTo(59.31f, 168.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(179.31f)
                lineToRelative(14.63f, 14.63f)
                arcTo(95.43f, 95.43f, 0.0f, false, false, 130.0f, 222.06f)
                horizontalLineToRelative(0.53f)
                arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, -27.33f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.18f, -11.44f)
                close()
            }
        }
        .build()
        return _arrowsclockwise!!
    }

private var _arrowsclockwise: ImageVector? = null
