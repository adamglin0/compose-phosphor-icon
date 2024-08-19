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

public val FillGroup.Binary: ImageVector
    get() {
        if (_binary != null) {
            return _binary!!
        }
        _binary = Builder(name = "Binary", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 168.0f)
                curveToRelative(0.0f, 4.75f, -1.11f, 9.16f, -3.05f, 12.11f)
                arcTo(7.77f, 7.77f, 0.0f, false, true, 158.0f, 184.0f)
                curveToRelative(-9.72f, 0.0f, -10.0f, -14.36f, -10.0f, -16.0f)
                curveToRelative(0.0f, -4.74f, 1.11f, -9.16f, 3.05f, -12.11f)
                arcTo(7.77f, 7.77f, 0.0f, false, true, 158.0f, 152.0f)
                curveTo(167.72f, 152.0f, 168.0f, 166.36f, 168.0f, 168.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(140.84f, 75.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, 3.58f)
                lineTo(156.0f, 76.94f)
                lineTo(156.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(172.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f)
                lineToRelative(-16.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 140.84f, 75.58f)
                close()
                moveTo(112.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.58f, -7.16f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 14.32f)
                lineTo(96.0f, 156.94f)
                lineTo(96.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 88.0f)
                curveToRelative(0.0f, -18.84f, -10.69f, -32.0f, -26.0f, -32.0f)
                reflectiveCurveTo(76.0f, 69.16f, 76.0f, 88.0f)
                reflectiveCurveToRelative(10.69f, 32.0f, 26.0f, 32.0f)
                reflectiveCurveTo(128.0f, 106.84f, 128.0f, 88.0f)
                close()
                moveTo(184.0f, 168.0f)
                curveToRelative(0.0f, -18.84f, -10.69f, -32.0f, -26.0f, -32.0f)
                reflectiveCurveToRelative(-26.0f, 13.16f, -26.0f, 32.0f)
                reflectiveCurveToRelative(10.69f, 32.0f, 26.0f, 32.0f)
                reflectiveCurveTo(184.0f, 186.84f, 184.0f, 168.0f)
                close()
                moveTo(102.0f, 72.0f)
                arcToRelative(7.77f, 7.77f, 0.0f, false, false, -7.0f, 3.89f)
                curveToRelative(-1.94f, 3.0f, -3.0f, 7.37f, -3.0f, 12.11f)
                curveToRelative(0.0f, 1.64f, 0.28f, 16.0f, 10.0f, 16.0f)
                arcToRelative(7.77f, 7.77f, 0.0f, false, false, 7.0f, -3.89f)
                curveToRelative(1.94f, -3.0f, 3.0f, -7.36f, 3.0f, -12.11f)
                curveTo(112.0f, 86.36f, 111.72f, 72.0f, 102.0f, 72.0f)
                close()
            }
        }
        .build()
        return _binary!!
    }

private var _binary: ImageVector? = null
