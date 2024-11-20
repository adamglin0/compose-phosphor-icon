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

public val LightGroup.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) {
            return _twitchLogo!!
        }
        _twitchLogo = Builder(name = "TwitchLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(66.0f, 206.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.84f, 4.61f)
                lineTo(122.17f, 206.0f)
                lineTo(165.1f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.0f, -3.25f)
                lineTo(217.0f, 167.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.0f, -10.76f)
                lineTo(222.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(210.0f, 156.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.72f, 1.54f)
                lineToRelative(-42.9f, 35.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.28f, 0.46f)
                lineTo(120.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.84f, 1.39f)
                lineTo(78.0f, 227.19f)
                lineTo(78.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(48.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(208.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(174.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(162.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(126.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(114.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
