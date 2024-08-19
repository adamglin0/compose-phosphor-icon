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

public val RegularGroup.Mediumlogo: ImageVector
    get() {
        if (_mediumlogo != null) {
            return _mediumlogo!!
        }
        _mediumlogo = Builder(name = "Mediumlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 64.0f, 64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 72.0f, 64.0f)
                close()
                moveTo(72.0f, 176.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 72.0f, 176.0f)
                close()
                moveTo(184.0f, 64.0f)
                curveToRelative(-5.68f, 0.0f, -16.4f, 2.76f, -24.32f, 21.25f)
                curveTo(154.73f, 96.8f, 152.0f, 112.0f, 152.0f, 128.0f)
                reflectiveCurveToRelative(2.73f, 31.2f, 7.68f, 42.75f)
                curveTo(167.6f, 189.24f, 178.32f, 192.0f, 184.0f, 192.0f)
                reflectiveCurveToRelative(16.4f, -2.76f, 24.32f, -21.25f)
                curveTo(213.27f, 159.2f, 216.0f, 144.0f, 216.0f, 128.0f)
                reflectiveCurveToRelative(-2.73f, -31.2f, -7.68f, -42.75f)
                curveTo(200.4f, 66.76f, 189.68f, 64.0f, 184.0f, 64.0f)
                close()
                moveTo(184.0f, 176.0f)
                curveToRelative(-5.64f, 0.0f, -16.0f, -18.22f, -16.0f, -48.0f)
                reflectiveCurveToRelative(10.36f, -48.0f, 16.0f, -48.0f)
                reflectiveCurveToRelative(16.0f, 18.22f, 16.0f, 48.0f)
                reflectiveCurveTo(189.64f, 176.0f, 184.0f, 176.0f)
                close()
                moveTo(248.0f, 72.0f)
                lineTo(248.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(232.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumlogo!!
    }

private var _mediumlogo: ImageVector? = null
