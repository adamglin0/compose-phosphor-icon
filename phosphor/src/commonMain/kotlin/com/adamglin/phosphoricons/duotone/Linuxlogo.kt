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

public val DuotoneGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 208.0f)
                horizontalLineTo(168.0f)
                curveToRelative(-8.0f, -14.35f, -22.91f, -24.0f, -40.0f, -24.0f)
                reflectiveCurveToRelative(-32.0f, 9.65f, -40.0f, 24.0f)
                horizontalLineTo(32.0f)
                reflectiveCurveTo(64.0f, 168.0f, 64.0f, 88.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                curveTo(192.0f, 168.0f, 224.0f, 208.0f, 224.0f, 208.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.0f, 214.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 217.76f, 213.0f)
                curveTo(216.39f, 211.27f, 184.0f, 169.86f, 184.0f, 88.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 72.0f, 88.0f)
                curveToRelative(0.0f, 81.86f, -32.37f, 123.27f, -33.75f, 125.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.51f, -10.0f)
                curveToRelative(0.15f, -0.2f, 7.69f, -9.9f, 15.13f, -28.74f)
                curveTo(47.77f, 156.8f, 56.0f, 127.64f, 56.0f, 88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveToRelative(0.0f, 39.64f, 8.23f, 68.8f, 15.13f, 86.28f)
                curveToRelative(7.48f, 18.94f, 15.06f, 28.64f, 15.14f, 28.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.0f, 214.25f)
                close()
                moveTo(100.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 88.0f)
                close()
                moveTo(168.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 100.0f)
                close()
                moveTo(99.58f, 128.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.15f, 14.31f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, false, 7.15f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, -14.31f)
                lineTo(128.0f, 143.05f)
                close()
                moveTo(128.0f, 176.0f)
                arcToRelative(54.07f, 54.07f, 0.0f, false, false, -47.0f, 28.11f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.78f)
                arcToRelative(37.35f, 37.35f, 0.0f, false, true, 66.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.0f, -7.78f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 128.0f, 176.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
