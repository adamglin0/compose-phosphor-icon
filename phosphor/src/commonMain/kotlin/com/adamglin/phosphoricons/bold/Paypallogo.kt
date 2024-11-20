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

public val BoldGroup.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) {
            return _paypalLogo!!
        }
        _paypalLogo = Builder(name = "PaypalLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.27f, 91.08f)
                arcToRelative(59.82f, 59.82f, 0.0f, false, false, -19.5f, -16.27f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 144.0f, 20.0f)
                lineTo(84.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 64.6f, 35.15f)
                lineToRelative(-36.0f, 144.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 204.0f)
                lineTo(70.39f, 204.0f)
                lineToRelative(-1.79f, 7.15f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 88.0f, 236.0f)
                horizontalLineToRelative(31.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.4f, -15.15f)
                lineTo(147.13f, 188.0f)
                lineTo(176.0f, 188.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 47.29f, -96.92f)
                close()
                moveTo(87.13f, 44.0f)
                lineTo(144.0f, 44.0f)
                arcToRelative(35.77f, 35.77f, 0.0f, false, true, 28.37f, 13.85f)
                arcTo(36.18f, 36.18f, 0.0f, false, true, 178.0f, 68.06f)
                curveToRelative(-0.66f, 0.0f, -1.31f, -0.06f, -2.0f, -0.06f)
                lineTo(120.0f, 68.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 100.6f, 83.15f)
                lineTo(76.39f, 180.0f)
                lineTo(53.13f, 180.0f)
                close()
                moveTo(177.89f, 92.05f)
                arcTo(35.93f, 35.93f, 0.0f, false, true, 144.0f, 116.0f)
                lineTo(117.13f, 116.0f)
                lineToRelative(6.0f, -24.0f)
                lineTo(176.0f, 92.0f)
                curveTo(176.62f, 92.0f, 177.26f, 92.0f, 177.89f, 92.05f)
                close()
                moveTo(210.89f, 136.73f)
                arcTo(35.94f, 35.94f, 0.0f, false, true, 176.0f, 164.0f)
                lineTo(144.0f, 164.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.4f, 15.15f)
                lineTo(116.39f, 212.0f)
                lineTo(93.13f, 212.0f)
                lineToRelative(18.0f, -72.0f)
                lineTo(144.0f, 140.0f)
                arcToRelative(59.89f, 59.89f, 0.0f, false, false, 56.1f, -38.75f)
                arcToRelative(36.12f, 36.12f, 0.0f, false, true, 10.82f, 35.48f)
                close()
            }
        }
        .build()
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
