package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Baseball-cap-light`: ImageVector
    get() {
        if (`_baseball-cap-light` != null) {
            return `_baseball-cap-light`!!
        }
        `_baseball-cap-light` = Builder(name = "Baseball-cap-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 26.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 35.0f, 17.74f)
                curveToRelative(12.38f, -9.0f, 34.06f, -19.74f, 67.0f, -19.74f)
                reflectiveCurveToRelative(54.61f, 10.73f, 67.0f, 19.73f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 230.0f, 184.0f)
                lineTo(230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(218.0f, 128.0f)
                verticalLineToRelative(12.5f)
                arcToRelative(164.29f, 164.29f, 0.0f, false, false, -44.8f, -20.3f)
                arcTo(165.07f, 165.07f, 0.0f, false, false, 141.69f, 39.0f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(160.79f, 117.22f)
                arcToRelative(168.56f, 168.56f, 0.0f, false, false, -65.58f, 0.0f)
                curveToRelative(5.0f, -38.38f, 24.16f, -65.59f, 32.79f, -76.14f)
                curveTo(136.63f, 51.65f, 155.8f, 78.85f, 160.79f, 117.23f)
                close()
                moveTo(114.31f, 39.0f)
                arcTo(165.07f, 165.07f, 0.0f, false, false, 82.8f, 120.21f)
                arcTo(164.29f, 164.29f, 0.0f, false, false, 38.0f, 140.51f)
                lineTo(38.0f, 128.0f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 114.31f, 39.0f)
                close()
                moveTo(212.57f, 192.85f)
                arcTo(9.94f, 9.94f, 0.0f, false, true, 202.0f, 192.0f)
                curveToRelative(-13.82f, -10.0f, -37.88f, -22.0f, -74.0f, -22.0f)
                reflectiveCurveToRelative(-60.22f, 12.0f, -74.0f, 22.0f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, true, -10.53f, 0.85f)
                arcTo(9.79f, 9.79f, 0.0f, false, true, 38.0f, 184.0f)
                lineTo(38.0f, 155.0f)
                arcToRelative(154.0f, 154.0f, 0.0f, false, true, 180.0f, 0.0f)
                verticalLineToRelative(29.0f)
                arcTo(9.79f, 9.79f, 0.0f, false, true, 212.57f, 192.89f)
                close()
            }
        }
        .build()
        return `_baseball-cap-light`!!
    }

private var `_baseball-cap-light`: ImageVector? = null
