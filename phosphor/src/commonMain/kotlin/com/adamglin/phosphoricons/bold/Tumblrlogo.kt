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

public val BoldGroup.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) {
            return _tumblrLogo!!
        }
        _tumblrLogo = Builder(name = "TumblrLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(156.0f, 60.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(112.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 72.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(84.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, 68.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(204.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(160.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(156.0f, 124.0f)
                close()
                moveTo(160.0f, 196.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(24.0f)
                lineTo(152.0f, 220.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(108.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(76.0f, 100.0f)
                lineTo(76.0f, 82.79f)
                arcTo(60.18f, 60.18f, 0.0f, false, false, 122.79f, 36.0f)
                lineTo(132.0f, 36.0f)
                lineTo(132.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(16.0f)
                lineTo(144.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 160.0f, 196.0f)
                close()
            }
        }
        .build()
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
