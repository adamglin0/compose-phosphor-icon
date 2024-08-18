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

public val FillGroup.`Goggles-fill`: ImageVector
    get() {
        if (`_goggles-fill` != null) {
            return `_goggles-fill`!!
        }
        `_goggles-fill` = Builder(name = "Goggles-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 64.0f)
                lineTo(72.0f, 64.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 0.0f, 136.0f)
                arcToRelative(24.06f, 24.06f, 0.0f, false, false, 17.0f, 23.0f)
                curveToRelative(6.06f, 20.37f, 37.63f, 33.0f, 55.0f, 33.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, 39.2f, -32.0f)
                horizontalLineToRelative(33.6f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 184.0f, 192.0f)
                curveToRelative(17.33f, 0.0f, 48.9f, -12.66f, 55.0f, -33.0f)
                arcToRelative(24.06f, 24.06f, 0.0f, false, false, 17.0f, -23.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, false, 184.0f, 64.0f)
                close()
                moveTo(89.0f, 169.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineTo(53.14f, 144.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f)
                lineTo(89.0f, 157.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 89.0f, 169.0f)
                close()
                moveTo(208.52f, 168.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f)
                lineToRelative(-25.41f, -25.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineToRelative(25.4f, 25.41f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.48f, 168.48f)
                close()
                moveTo(237.72f, 141.65f)
                curveTo(229.34f, 123.25f, 200.34f, 112.0f, 184.0f, 112.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, -39.2f, 32.0f)
                lineTo(111.2f, 144.0f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 72.0f, 112.0f)
                curveToRelative(-16.34f, 0.0f, -45.34f, 11.25f, -53.68f, 29.62f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 136.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 72.0f, 80.0f)
                lineTo(184.0f, 80.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, 56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.68f, 141.62f)
                close()
            }
        }
        .build()
        return `_goggles-fill`!!
    }

private var `_goggles-fill`: ImageVector? = null
