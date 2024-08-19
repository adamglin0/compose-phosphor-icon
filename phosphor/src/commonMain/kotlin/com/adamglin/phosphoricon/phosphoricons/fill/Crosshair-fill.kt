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

public val FillGroup.`Crosshair-fill`: ImageVector
    get() {
        if (`_crosshair-fill` != null) {
            return `_crosshair-fill`!!
        }
        `_crosshair-fill` = Builder(name = "Crosshair-fill", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                horizontalLineToRelative(-8.34f)
                arcTo(96.14f, 96.14f, 0.0f, false, false, 136.0f, 32.34f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.34f)
                arcTo(96.14f, 96.14f, 0.0f, false, false, 32.34f, 120.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.34f)
                arcTo(96.14f, 96.14f, 0.0f, false, false, 120.0f, 223.66f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.34f)
                arcTo(96.14f, 96.14f, 0.0f, false, false, 223.66f, 136.0f)
                lineTo(232.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(200.0f, 136.0f)
                horizontalLineToRelative(7.6f)
                arcTo(80.15f, 80.15f, 0.0f, false, true, 136.0f, 207.6f)
                lineTo(136.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(7.6f)
                arcTo(80.15f, 80.15f, 0.0f, false, true, 48.4f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(48.4f, 120.0f)
                arcTo(80.15f, 80.15f, 0.0f, false, true, 120.0f, 48.4f)
                lineTo(120.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 48.4f)
                arcTo(80.15f, 80.15f, 0.0f, false, true, 207.6f, 120.0f)
                lineTo(200.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(168.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_crosshair-fill`!!
    }

private var `_crosshair-fill`: ImageVector? = null
