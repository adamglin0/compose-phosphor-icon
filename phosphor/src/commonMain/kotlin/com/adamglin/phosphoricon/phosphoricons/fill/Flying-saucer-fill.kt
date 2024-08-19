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

public val FillGroup.`Flying-saucer-fill`: ImageVector
    get() {
        if (`_flying-saucer-fill` != null) {
            return `_flying-saucer-fill`!!
        }
        `_flying-saucer-fill` = Builder(name = "Flying-saucer-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(183.59f, 213.47f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.18f, 5.06f)
                lineToRelative(-8.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.18f, -5.06f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 184.0f)
                close()
                moveTo(90.53f, 184.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.12f, 5.06f)
                lineToRelative(-8.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.18f, 5.06f)
                lineToRelative(8.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 90.53f, 184.41f)
                close()
                moveTo(248.0f, 112.0f)
                curveToRelative(0.0f, 16.22f, -13.37f, 30.89f, -37.65f, 41.29f)
                curveTo(188.22f, 162.78f, 159.0f, 168.0f, 128.0f, 168.0f)
                reflectiveCurveToRelative(-60.22f, -5.22f, -82.35f, -14.71f)
                curveTo(21.37f, 142.89f, 8.0f, 128.22f, 8.0f, 112.0f)
                curveToRelative(0.0f, -8.37f, 3.67f, -20.79f, 21.17f, -32.5f)
                curveToRelative(11.37f, -7.61f, 26.94f, -13.76f, 45.18f, -17.85f)
                arcTo(63.64f, 63.64f, 0.0f, false, true, 173.0f, 50.45f)
                arcToRelative(64.84f, 64.84f, 0.0f, false, true, 9.11f, 11.3f)
                curveTo(223.43f, 71.09f, 248.0f, 89.74f, 248.0f, 112.0f)
                close()
                moveTo(176.0f, 96.0f)
                arcToRelative(47.66f, 47.66f, 0.0f, false, false, -6.06f, -23.35f)
                lineToRelative(-0.06f, -0.09f)
                arcTo(48.07f, 48.07f, 0.0f, false, false, 127.36f, 48.0f)
                curveTo(101.25f, 48.34f, 80.0f, 70.25f, 80.0f, 96.83f)
                verticalLineToRelative(3.0f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 6.13f, 7.76f)
                arcTo(188.24f, 188.24f, 0.0f, false, false, 128.0f, 112.0f)
                arcToRelative(188.09f, 188.09f, 0.0f, false, false, 41.85f, -4.37f)
                arcTo(7.93f, 7.93f, 0.0f, false, false, 176.0f, 99.87f)
                close()
            }
        }
        .build()
        return `_flying-saucer-fill`!!
    }

private var `_flying-saucer-fill`: ImageVector? = null
