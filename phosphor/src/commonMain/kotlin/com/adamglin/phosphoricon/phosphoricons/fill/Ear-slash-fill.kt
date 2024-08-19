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

public val FillGroup.`Ear-slash-fill`: ImageVector
    get() {
        if (`_ear-slash-fill` != null) {
            return `_ear-slash-fill`!!
        }
        `_ear-slash-fill` = Builder(name = "Ear-slash-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineTo(191.8f, 210.07f)
                arcToRelative(103.18f, 103.18f, 0.0f, false, false, 11.83f, -10.77f)
                close()
                moveTo(64.2f, 45.93f)
                lineTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(52.37f, 56.7f)
                arcTo(103.18f, 103.18f, 0.0f, false, true, 64.2f, 45.93f)
                close()
                moveTo(203.63f, 199.3f)
                lineTo(64.2f, 45.93f)
                arcTo(103.94f, 103.94f, 0.0f, false, true, 203.63f, 199.3f)
                close()
                moveTo(159.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -20.08f, -22.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.45f, 15.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 10.0f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.74f, 6.0f)
                arcToRelative(7.68f, 7.68f, 0.0f, false, false, 2.0f, -0.26f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 159.0f, 104.0f)
                close()
                moveTo(192.0f, 112.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -85.89f, -60.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.47f, 15.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(148.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, true, 1.0f, -7.0f)
                lineToRelative(-20.45f, -22.5f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 104.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.68f, -6.56f)
                lineTo(84.39f, 91.92f)
                arcTo(47.59f, 47.59f, 0.0f, false, false, 80.0f, 112.0f)
                curveToRelative(0.0f, 11.9f, 6.71f, 20.5f, 13.82f, 29.6f)
                curveToRelative(7.0f, 8.92f, 14.18f, 18.15f, 14.18f, 30.4f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.0f, 14.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.19f, 11.42f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 172.0f)
                curveToRelative(0.0f, -6.74f, -5.0f, -13.14f, -10.79f, -20.55f)
                curveTo(73.54f, 141.63f, 64.0f, 129.41f, 64.0f, 112.0f)
                arcToRelative(63.5f, 63.5f, 0.0f, false, true, 9.0f, -32.66f)
                lineTo(52.37f, 56.7f)
                arcTo(103.94f, 103.94f, 0.0f, false, false, 191.8f, 210.07f)
                lineTo(153.0f, 167.37f)
                arcTo(19.82f, 19.82f, 0.0f, false, true, 148.0f, 168.0f)
                close()
            }
        }
        .build()
        return `_ear-slash-fill`!!
    }

private var `_ear-slash-fill`: ImageVector? = null
