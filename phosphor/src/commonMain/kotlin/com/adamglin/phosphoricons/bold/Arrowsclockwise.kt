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

public val BoldGroup.Arrowsclockwise: ImageVector
    get() {
        if (_arrowsclockwise != null) {
            return _arrowsclockwise!!
        }
        _arrowsclockwise = Builder(name = "Arrowsclockwise", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 48.0f)
                verticalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(19.0f)
                lineToRelative(-7.8f, -7.8f)
                arcToRelative(75.55f, 75.55f, 0.0f, false, false, -53.32f, -22.26f)
                horizontalLineToRelative(-0.43f)
                arcTo(75.49f, 75.49f, 0.0f, false, false, 72.39f, 75.57f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 55.61f, 58.41f)
                arcToRelative(99.38f, 99.38f, 0.0f, false, true, 69.87f, -28.47f)
                horizontalLineTo(126.0f)
                arcTo(99.42f, 99.42f, 0.0f, false, true, 196.2f, 59.23f)
                lineTo(204.0f, 67.0f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(183.61f, 180.43f)
                arcToRelative(75.49f, 75.49f, 0.0f, false, true, -53.09f, 21.63f)
                horizontalLineToRelative(-0.43f)
                arcTo(75.55f, 75.55f, 0.0f, false, true, 76.77f, 179.8f)
                lineTo(69.0f, 172.0f)
                horizontalLineTo(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(189.0f)
                lineToRelative(7.8f, 7.8f)
                arcTo(99.42f, 99.42f, 0.0f, false, false, 130.0f, 226.06f)
                horizontalLineToRelative(0.56f)
                arcToRelative(99.38f, 99.38f, 0.0f, false, false, 69.87f, -28.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.78f, -17.16f)
                close()
            }
        }
        .build()
        return _arrowsclockwise!!
    }

private var _arrowsclockwise: ImageVector? = null
