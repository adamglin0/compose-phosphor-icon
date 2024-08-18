package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Coin-fill`: ImageVector
    get() {
        if (`_coin-fill` != null) {
            return `_coin-fill`!!
        }
        `_coin-fill` = Builder(name = "Coin-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(207.58f, 63.84f)
                curveTo(186.85f, 53.48f, 159.33f, 48.0f, 128.0f, 48.0f)
                reflectiveCurveTo(69.15f, 53.48f, 48.42f, 63.84f)
                reflectiveCurveTo(16.0f, 88.78f, 16.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 15.22f, 11.82f, 29.85f, 32.42f, 40.16f)
                reflectiveCurveTo(96.67f, 208.0f, 128.0f, 208.0f)
                reflectiveCurveToRelative(58.85f, -5.48f, 79.58f, -15.84f)
                reflectiveCurveTo(240.0f, 167.22f, 240.0f, 152.0f)
                lineTo(240.0f, 104.0f)
                curveTo(240.0f, 88.78f, 228.18f, 74.15f, 207.58f, 63.84f)
                close()
                moveTo(120.0f, 159.84f)
                verticalLineToRelative(32.0f)
                curveToRelative(-19.0f, -0.62f, -35.0f, -3.42f, -48.0f, -7.49f)
                lineTo(72.0f, 153.05f)
                arcTo(203.43f, 203.43f, 0.0f, false, false, 120.0f, 159.86f)
                close()
                moveTo(136.0f, 159.84f)
                arcToRelative(203.43f, 203.43f, 0.0f, false, false, 48.0f, -6.81f)
                verticalLineToRelative(31.31f)
                curveToRelative(-13.0f, 4.07f, -29.0f, 6.87f, -48.0f, 7.49f)
                close()
                moveTo(32.0f, 152.0f)
                lineTo(32.0f, 133.53f)
                arcToRelative(82.88f, 82.88f, 0.0f, false, false, 16.42f, 10.63f)
                curveToRelative(2.43f, 1.21f, 5.0f, 2.35f, 7.58f, 3.43f)
                lineTo(56.0f, 178.0f)
                curveTo(40.17f, 170.16f, 32.0f, 160.29f, 32.0f, 152.0f)
                close()
                moveTo(200.0f, 178.0f)
                lineTo(200.0f, 147.59f)
                curveToRelative(2.61f, -1.08f, 5.15f, -2.22f, 7.58f, -3.43f)
                arcTo(82.88f, 82.88f, 0.0f, false, false, 224.0f, 133.53f)
                lineTo(224.0f, 152.0f)
                curveTo(224.0f, 160.29f, 215.83f, 170.16f, 200.0f, 178.0f)
                close()
            }
        }
        .build()
        return `_coin-fill`!!
    }

private var `_coin-fill`: ImageVector? = null
