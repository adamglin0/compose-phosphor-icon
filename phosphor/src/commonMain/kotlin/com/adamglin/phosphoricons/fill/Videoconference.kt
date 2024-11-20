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

public val FillGroup.VideoConference: ImageVector
    get() {
        if (_videoConference != null) {
            return _videoConference!!
        }
        _videoConference = Builder(name = "VideoConference", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 88.0f)
                close()
                moveTo(192.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 156.0f)
                close()
                moveTo(96.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 104.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(168.0f, 120.0f)
                horizontalLineToRelative(48.0f)
                lineTo(216.0f, 56.0f)
                lineTo(168.0f, 56.0f)
                close()
                moveTo(135.75f, 166.0f)
                arcToRelative(39.76f, 39.76f, 0.0f, false, false, -17.19f, -23.34f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.12f, 0.0f)
                arcTo(39.84f, 39.84f, 0.0f, false, false, 56.25f, 166.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.5f, 4.0f)
                curveToRelative(2.64f, -10.25f, 13.06f, -18.0f, 24.25f, -18.0f)
                reflectiveCurveToRelative(21.62f, 7.73f, 24.25f, 18.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.5f, -4.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(216.0f, 136.0f)
                lineTo(168.0f, 136.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
