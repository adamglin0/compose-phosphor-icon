package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Hand-eye-thin`: ImageVector
    get() {
        if (`_hand-eye-thin` != null) {
            return `_hand-eye-thin`!!
        }
        `_hand-eye-thin` = Builder(name = "Hand-eye-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 168.0f)
                close()
                moveTo(212.0f, 116.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -168.0f, 0.0f)
                lineTo(44.0f, 76.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 84.0f, 58.13f)
                lineTo(84.0f, 44.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.93f, -1.8f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 172.0f, 60.0f)
                lineTo(172.0f, 98.13f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 212.0f, 116.0f)
                close()
                moveTo(204.0f, 116.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(164.0f, 60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(84.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f)
                close()
                moveTo(179.58f, 166.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 3.58f)
                curveToRelative(-0.7f, 1.4f, -17.5f, 34.21f, -51.58f, 34.21f)
                reflectiveCurveToRelative(-50.88f, -32.81f, -51.58f, -34.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -3.58f)
                curveToRelative(0.7f, -1.4f, 17.5f, -34.21f, 51.58f, -34.21f)
                reflectiveCurveTo(178.88f, 164.81f, 179.58f, 166.21f)
                close()
                moveTo(171.42f, 168.01f)
                curveToRelative(-3.83f, -6.43f, -18.55f, -28.0f, -43.42f, -28.0f)
                reflectiveCurveToRelative(-39.6f, 21.55f, -43.42f, 28.0f)
                curveToRelative(3.84f, 6.44f, 18.55f, 28.0f, 43.42f, 28.0f)
                reflectiveCurveTo(167.6f, 174.45f, 171.42f, 168.0f)
                close()
            }
        }
        .build()
        return `_hand-eye-thin`!!
    }

private var `_hand-eye-thin`: ImageVector? = null
