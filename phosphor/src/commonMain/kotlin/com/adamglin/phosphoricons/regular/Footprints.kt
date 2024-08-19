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

public val RegularGroup.Footprints: ImageVector
    get() {
        if (_footprints != null) {
            return _footprints!!
        }
        _footprints = Builder(name = "Footprints", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.06f, 184.0f)
                lineTo(152.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.05f, 0.0f)
                lineTo(216.05f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.06f, 184.0f)
                close()
                moveTo(200.06f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(104.0f, 160.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 112.0f, 180.0f)
                lineTo(112.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 160.0f)
                close()
                moveTo(96.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                lineTo(96.0f, 176.0f)
                close()
                moveTo(76.0f, 16.0f)
                curveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, 2.93f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f)
                curveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f)
                close()
                moveTo(97.15f, 128.0f)
                lineTo(54.78f, 128.0f)
                curveToRelative(-11.4f, -18.1f, -7.21f, -52.7f, 3.89f, -76.11f)
                curveTo(65.14f, 38.22f, 72.17f, 32.0f, 76.0f, 32.0f)
                reflectiveCurveToRelative(10.82f, 6.22f, 17.3f, 19.89f)
                curveTo(104.36f, 75.3f, 108.55f, 109.9f, 97.15f, 128.0f)
                close()
                moveTo(154.76f, 168.0f)
                horizontalLineToRelative(50.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f)
                curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f)
                curveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f)
                reflectiveCurveToRelative(-22.89f, 10.31f, -31.77f, 29.0f)
                curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f)
                arcTo(8.05f, 8.05f, 0.0f, false, false, 154.76f, 168.0f)
                close()
                moveTo(162.76f, 75.89f)
                curveTo(169.22f, 62.22f, 176.25f, 56.0f, 180.0f, 56.0f)
                reflectiveCurveToRelative(10.82f, 6.22f, 17.29f, 19.89f)
                curveToRelative(11.1f, 23.41f, 15.29f, 58.0f, 3.9f, 76.11f)
                lineTo(158.85f, 152.0f)
                curveTo(147.45f, 133.9f, 151.64f, 99.3f, 162.74f, 75.89f)
                close()
            }
        }
        .build()
        return _footprints!!
    }

private var _footprints: ImageVector? = null
