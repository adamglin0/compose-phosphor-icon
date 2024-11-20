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

public val LightGroup.TumblrLogo: ImageVector
    get() {
        if (_tumblrLogo != null) {
            return _tumblrLogo!!
        }
        _tumblrLogo = Builder(name = "TumblrLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(198.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(150.0f, 66.0f)
                lineTo(150.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(112.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 64.0f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(90.0f, 118.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(62.07f, 62.07f, 0.0f, false, false, 62.0f, 62.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(198.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(160.0f, 178.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(150.0f, 118.0f)
                close()
                moveTo(160.0f, 190.0f)
                horizontalLineToRelative(26.0f)
                verticalLineToRelative(36.0f)
                lineTo(152.0f, 226.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f)
                lineTo(102.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(70.0f, 106.0f)
                lineTo(70.0f, 77.67f)
                arcTo(54.12f, 54.12f, 0.0f, false, false, 117.67f, 30.0f)
                lineTo(138.0f, 30.0f)
                lineTo(138.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(28.0f)
                lineTo(144.0f, 106.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(56.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 160.0f, 190.0f)
                close()
            }
        }
        .build()
        return _tumblrLogo!!
    }

private var _tumblrLogo: ImageVector? = null
