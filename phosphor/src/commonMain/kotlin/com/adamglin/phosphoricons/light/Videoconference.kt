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

public val LightGroup.VideoConference: ImageVector
    get() {
        if (_videoConference != null) {
            return _videoConference!!
        }
        _videoConference = Builder(name = "VideoConference", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 56.0f)
                verticalLineToRelative(66.0f)
                lineTo(166.0f, 122.0f)
                lineTo(166.0f, 54.0f)
                horizontalLineToRelative(50.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 218.0f, 56.0f)
                close()
                moveTo(38.0f, 200.0f)
                lineTo(38.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(154.0f, 54.0f)
                lineTo(154.0f, 202.0f)
                lineTo(40.0f, 202.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f)
                close()
                moveTo(216.0f, 202.0f)
                lineTo(166.0f, 202.0f)
                lineTo(166.0f, 134.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(66.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f)
                close()
                moveTo(182.0f, 88.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 88.0f)
                close()
                moveTo(202.0f, 168.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 202.0f, 168.0f)
                close()
                moveTo(133.81f, 166.51f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 115.23f, 143.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -38.45f, 0.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 58.19f, 166.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.62f, 3.0f)
                curveTo(72.67f, 158.38f, 83.93f, 150.0f, 96.0f, 150.0f)
                reflectiveCurveToRelative(23.34f, 8.38f, 26.19f, 19.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.62f, -3.0f)
                close()
                moveTo(78.0f, 120.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 78.0f, 120.0f)
                close()
            }
        }
        .build()
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
