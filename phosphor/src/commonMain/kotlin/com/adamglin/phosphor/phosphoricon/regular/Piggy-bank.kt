package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Piggy-bank`: ImageVector
    get() {
        if (`_piggy-bank` != null) {
            return `_piggy-bank`!!
        }
        `_piggy-bank` = Builder(name = "Piggy-bank", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 116.0f)
                close()
                moveTo(152.0f, 64.0f)
                lineTo(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(248.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(-2.36f)
                lineToRelative(-16.21f, 45.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 190.36f, 224.0f)
                lineTo(177.64f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.07f, -10.62f)
                lineTo(160.65f, 208.0f)
                horizontalLineToRelative(-57.3f)
                lineToRelative(-1.92f, 5.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 86.36f, 224.0f)
                lineTo(73.64f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.07f, -10.62f)
                lineTo(46.0f, 178.22f)
                arcToRelative(87.69f, 87.69f, 0.0f, false, true, -21.44f, -48.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 24.28f, -31.0f)
                arcTo(88.12f, 88.12f, 0.0f, false, true, 112.0f, 32.0f)
                lineTo(216.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(194.61f, 48.0f)
                arcToRelative(87.93f, 87.93f, 0.0f, false, true, 30.17f, 37.0f)
                curveToRelative(0.43f, 1.0f, 0.85f, 2.0f, 1.25f, 3.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 248.0f, 112.0f)
                close()
                moveTo(232.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineToRelative(-3.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.64f, -5.6f)
                arcTo(71.9f, 71.9f, 0.0f, false, false, 144.0f, 48.0f)
                lineTo(112.0f, 48.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 58.91f, 168.64f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.64f, 2.71f)
                lineTo(73.64f, 208.0f)
                lineTo(86.36f, 208.0f)
                lineToRelative(3.82f, -10.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 97.71f, 192.0f)
                horizontalLineToRelative(68.58f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.53f, 5.31f)
                lineTo(177.64f, 208.0f)
                horizontalLineToRelative(12.72f)
                lineToRelative(18.11f, -50.69f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 152.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_piggy-bank`!!
    }

private var `_piggy-bank`: ImageVector? = null
