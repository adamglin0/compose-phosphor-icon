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

public val FillGroup.`Alien-fill`: ImageVector
    get() {
        if (`_alien-fill` != null) {
            return `_alien-fill`!!
        }
        `_alien-fill` = Builder(name = "Alien-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 16.0f)
                arcToRelative(96.11f, 96.11f, 0.0f, false, false, -96.0f, 96.0f)
                curveToRelative(0.0f, 24.0f, 12.56f, 55.06f, 33.61f, 83.0f)
                curveToRelative(21.18f, 28.15f, 44.5f, 45.0f, 62.39f, 45.0f)
                reflectiveCurveToRelative(41.21f, -16.81f, 62.39f, -45.0f)
                curveToRelative(21.05f, -28.0f, 33.61f, -59.0f, 33.61f, -83.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 16.0f)
                close()
                moveTo(64.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 64.0f, 116.0f)
                close()
                moveTo(144.0f, 200.0f)
                lineTo(112.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(156.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 156.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_alien-fill`!!
    }

private var `_alien-fill`: ImageVector? = null
