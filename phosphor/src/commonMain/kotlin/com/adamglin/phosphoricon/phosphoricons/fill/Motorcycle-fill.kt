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

public val FillGroup.`Motorcycle-fill`: ImageVector
    get() {
        if (`_motorcycle-fill` != null) {
            return `_motorcycle-fill`!!
        }
        `_motorcycle-fill` = Builder(name = "Motorcycle-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 120.0f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, false, -6.6f, 0.55f)
                lineToRelative(-5.82f, -15.14f)
                arcTo(55.64f, 55.64f, 0.0f, false, true, 216.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(196.88f, 88.0f)
                lineTo(183.47f, 53.13f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 48.0f)
                lineTo(144.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(26.51f)
                lineToRelative(9.23f, 24.0f)
                lineTo(152.0f, 88.0f)
                curveToRelative(-18.5f, 0.0f, -33.5f, 4.31f, -43.37f, 12.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.76f, 2.07f)
                curveToRelative(-10.58f, -4.81f, -73.29f, -30.12f, -73.8f, -30.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.0f, 15.19f)
                reflectiveCurveTo(68.57f, 109.4f, 79.6f, 120.4f)
                arcTo(55.67f, 55.67f, 0.0f, false, true, 95.43f, 152.0f)
                lineTo(79.2f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 16.0f)
                horizontalLineToRelative(52.12f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, false, 30.74f, -23.1f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 26.59f, -33.72f)
                lineToRelative(5.82f, 15.13f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 216.0f, 120.0f)
                close()
                moveTo(40.0f, 168.0f)
                lineTo(62.62f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -16.0f)
                lineTo(40.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.0f, 184.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -15.58f, -42.23f)
                lineToRelative(8.11f, 21.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.94f, -5.74f)
                lineTo(215.35f, 136.0f)
                lineToRelative(0.65f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_motorcycle-fill`!!
    }

private var `_motorcycle-fill`: ImageVector? = null
