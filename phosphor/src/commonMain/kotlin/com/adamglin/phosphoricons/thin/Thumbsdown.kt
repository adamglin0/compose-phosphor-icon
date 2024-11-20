package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.85f, 157.52f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 204.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(77.53f, 156.0f)
                lineToRelative(38.89f, 77.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 120.0f, 236.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(156.0f, 180.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -22.48f)
                close()
                moveTo(76.0f, 148.0f)
                lineTo(32.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(76.0f, 52.0f)
                close()
                moveTo(225.0f, 167.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.0f, 4.06f)
                lineTo(152.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -25.58f, 27.9f)
                lineTo(84.0f, 151.06f)
                lineTo(84.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.91f, 10.51f)
                lineToRelative(12.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 225.0f, 167.94f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
