package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Baseball-cap-fill`: ImageVector
    get() {
        if (`_baseball-cap-fill` != null) {
            return `_baseball-cap-fill`!!
        }
        `_baseball-cap-fill` = Builder(name = "Baseball-cap-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 24.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, false, 14.18f, -4.64f)
                curveTo(74.33f, 194.53f, 95.6f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(53.67f, 10.52f, 65.81f, 19.35f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 232.0f, 184.0f)
                lineTo(232.0f, 128.0f)
                arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(88.15f, 88.15f, 0.0f, false, true, 109.81f, 41.9f)
                arcToRelative(167.0f, 167.0f, 0.0f, false, false, -28.87f, 76.76f)
                arcTo(166.0f, 166.0f, 0.0f, false, false, 40.0f, 136.88f)
                close()
                moveTo(216.0f, 184.0f)
                arcToRelative(7.77f, 7.77f, 0.0f, false, true, -4.34f, 7.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, -0.69f)
                curveTo(189.16f, 180.2f, 164.7f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveTo(66.84f, 180.2f, 52.78f, 190.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.44f, 0.69f)
                arcTo(7.77f, 7.77f, 0.0f, false, true, 40.0f, 184.0f)
                lineTo(40.0f, 156.07f)
                arcToRelative(150.62f, 150.62f, 0.0f, false, true, 49.93f, -23.28f)
                arcToRelative(7.06f, 7.06f, 0.0f, false, false, 1.0f, -0.26f)
                arcToRelative(154.06f, 154.06f, 0.0f, false, true, 74.17f, 0.0f)
                arcToRelative(8.64f, 8.64f, 0.0f, false, false, 1.0f, 0.27f)
                arcTo(150.49f, 150.49f, 0.0f, false, true, 216.0f, 156.07f)
                close()
                moveTo(216.0f, 136.87f)
                arcToRelative(166.0f, 166.0f, 0.0f, false, false, -40.94f, -18.22f)
                arcTo(167.0f, 167.0f, 0.0f, false, false, 146.19f, 41.9f)
                arcTo(88.15f, 88.15f, 0.0f, false, true, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_baseball-cap-fill`!!
    }

private var `_baseball-cap-fill`: ImageVector? = null
