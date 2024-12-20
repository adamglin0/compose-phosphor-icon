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

public val BoldGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.0f, 77.47f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 216.0f, 68.0f)
                horizontalLineTo(164.0f)
                verticalLineTo(56.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.73f, 6.63f)
                lineTo(72.58f, 92.0f)
                horizontalLineTo(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.78f, -24.53f)
                lineToRelative(12.0f, -96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 237.0f, 77.47f)
                close()
                moveTo(36.0f, 116.0f)
                horizontalLineTo(68.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(220.0f, 96.5f)
                lineToRelative(-12.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 3.5f)
                horizontalLineTo(92.0f)
                verticalLineTo(106.83f)
                lineTo(126.82f, 37.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 140.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.5f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
