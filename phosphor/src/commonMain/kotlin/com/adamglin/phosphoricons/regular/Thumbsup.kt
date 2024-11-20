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

public val RegularGroup.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 80.12f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 216.0f, 72.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 4.42f)
                lineTo(75.06f, 96.0f)
                horizontalLineTo(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 23.82f, -21.0f)
                lineToRelative(12.0f, -96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 234.0f, 80.12f)
                close()
                moveTo(32.0f, 112.0f)
                horizontalLineTo(72.0f)
                verticalLineToRelative(88.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(223.94f, 97.0f)
                lineToRelative(-12.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 7.0f)
                horizontalLineTo(88.0f)
                verticalLineTo(105.89f)
                lineToRelative(36.71f, -73.43f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 144.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.94f, 9.0f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
