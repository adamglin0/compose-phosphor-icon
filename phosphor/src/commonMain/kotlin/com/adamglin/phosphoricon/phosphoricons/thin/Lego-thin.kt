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

public val ThinGroup.`Lego-thin`: ImageVector
    get() {
        if (`_lego-thin` != null) {
            return `_lego-thin`!!
        }
        `_lego-thin` = Builder(name = "Lego-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.79f, 76.42f)
                lineTo(194.37f, 52.71f)
                curveTo(189.84f, 42.92f, 176.36f, 36.0f, 160.0f, 36.0f)
                curveToRelative(-20.19f, 0.0f, -36.0f, 10.54f, -36.0f, 24.0f)
                arcToRelative(17.55f, 17.55f, 0.0f, false, false, 2.2f, 8.43f)
                lineTo(101.65f, 80.7f)
                arcTo(49.17f, 49.17f, 0.0f, false, false, 80.0f, 76.0f)
                curveToRelative(-20.19f, 0.0f, -36.0f, 10.54f, -36.0f, 24.0f)
                arcToRelative(17.55f, 17.55f, 0.0f, false, false, 2.2f, 8.43f)
                lineToRelative(-32.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 128.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f)
                lineToRelative(64.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f)
                lineToRelative(160.0f, -80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 244.0f, 144.0f)
                lineTo(244.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 241.79f, 76.42f)
                close()
                moveTo(160.0f, 44.0f)
                curveToRelative(15.18f, 0.0f, 28.0f, 7.33f, 28.0f, 16.0f)
                reflectiveCurveToRelative(-12.82f, 16.0f, -28.0f, 16.0f)
                reflectiveCurveToRelative(-28.0f, -7.33f, -28.0f, -16.0f)
                reflectiveCurveTo(144.82f, 44.0f, 160.0f, 44.0f)
                close()
                moveTo(131.43f, 74.76f)
                curveTo(138.0f, 80.41f, 148.23f, 84.0f, 160.0f, 84.0f)
                curveToRelative(19.0f, 0.0f, 34.09f, -9.32f, 35.83f, -21.61f)
                lineTo(231.06f, 80.0f)
                lineTo(80.0f, 155.53f)
                lineTo(24.94f, 128.0f)
                lineToRelative(26.49f, -13.24f)
                curveTo(58.0f, 120.41f, 68.23f, 124.0f, 80.0f, 124.0f)
                curveToRelative(20.19f, 0.0f, 36.0f, -10.54f, 36.0f, -24.0f)
                curveToRelative(0.0f, -5.34f, -2.49f, -10.21f, -6.75f, -14.15f)
                close()
                moveTo(80.0f, 84.0f)
                curveToRelative(15.18f, 0.0f, 28.0f, 7.33f, 28.0f, 16.0f)
                reflectiveCurveToRelative(-12.82f, 16.0f, -28.0f, 16.0f)
                curveToRelative(-10.49f, 0.0f, -19.85f, -3.5f, -24.63f, -8.52f)
                curveToRelative(-0.09f, -0.12f, -0.19f, -0.21f, -0.28f, -0.31f)
                arcTo(10.7f, 10.7f, 0.0f, false, true, 52.0f, 100.0f)
                curveTo(52.0f, 91.33f, 64.82f, 84.0f, 80.0f, 84.0f)
                close()
                moveTo(20.0f, 134.47f)
                lineToRelative(56.0f, 28.0f)
                verticalLineToRelative(55.06f)
                lineToRelative(-56.0f, -28.0f)
                close()
                moveTo(84.0f, 217.53f)
                lineTo(84.0f, 162.47f)
                lineToRelative(152.0f, -76.0f)
                verticalLineToRelative(55.06f)
                close()
            }
        }
        .build()
        return `_lego-thin`!!
    }

private var `_lego-thin`: ImageVector? = null
