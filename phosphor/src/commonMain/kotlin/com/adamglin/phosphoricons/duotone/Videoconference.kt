package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(40.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(160.0f, 208.0f)
                lineTo(160.0f, 48.0f)
                close()
                moveTo(96.0f, 144.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 96.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(216.0f, 120.0f)
                lineTo(168.0f, 120.0f)
                lineTo(168.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(40.0f, 56.0f)
                lineTo(152.0f, 56.0f)
                lineTo(152.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                close()
                moveTo(216.0f, 200.0f)
                lineTo(168.0f, 200.0f)
                lineTo(168.0f, 136.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(180.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 88.0f)
                close()
                moveTo(204.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 168.0f)
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
                moveTo(80.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null
