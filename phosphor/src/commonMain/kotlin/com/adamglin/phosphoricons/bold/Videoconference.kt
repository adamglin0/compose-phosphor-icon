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

public val BoldGroup.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 116.0f)
                lineTo(156.0f, 116.0f)
                lineTo(156.0f, 60.0f)
                horizontalLineToRelative(56.0f)
                close()
                moveTo(52.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 52.0f, 120.0f)
                close()
                moveTo(44.0f, 169.77f)
                curveTo(46.69f, 161.84f, 55.0f, 156.0f, 64.0f, 156.0f)
                curveToRelative(9.43f, 0.0f, 18.19f, 6.44f, 20.38f, 15.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.24f, -6.0f)
                arcToRelative(43.22f, 43.22f, 0.0f, false, false, -15.16f, -23.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 44.0f, 90.08f)
                lineTo(44.0f, 60.0f)
                horizontalLineToRelative(88.0f)
                lineTo(132.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                close()
                moveTo(156.0f, 196.0f)
                lineTo(156.0f, 140.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(168.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 88.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 168.0f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null
