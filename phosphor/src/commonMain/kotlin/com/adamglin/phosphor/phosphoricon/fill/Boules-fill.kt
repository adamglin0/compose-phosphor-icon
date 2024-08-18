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

public val FillGroup.`Boules-fill`: ImageVector
    get() {
        if (`_boules-fill` != null) {
            return `_boules-fill`!!
        }
        `_boules-fill` = Builder(name = "Boules-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                curveToRelative(0.0f, 56.63f, -47.38f, 104.0f, -104.0f, 104.0f)
                arcToRelative(103.67f, 103.67f, 0.0f, false, true, -31.52f, -4.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.62f, -6.65f)
                lineTo(220.46f, 94.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.65f, 1.62f)
                arcTo(103.69f, 103.69f, 0.0f, false, true, 232.0f, 128.0f)
                close()
                moveTo(215.84f, 72.39f)
                arcToRelative(103.16f, 103.16f, 0.0f, false, false, -6.06f, -8.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, -0.33f)
                lineTo(63.5f, 203.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.33f, 6.0f)
                arcToRelative(103.16f, 103.16f, 0.0f, false, false, 8.56f, 6.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, -0.54f)
                lineTo(215.3f, 77.39f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 215.84f, 72.39f)
                close()
                moveTo(192.17f, 46.22f)
                arcToRelative(103.16f, 103.16f, 0.0f, false, false, -8.56f, -6.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.0f, 0.54f)
                lineTo(40.7f, 178.62f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.54f, 5.0f)
                arcToRelative(103.16f, 103.16f, 0.0f, false, false, 6.06f, 8.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, 0.33f)
                lineTo(192.5f, 52.18f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.17f, 46.22f)
                close()
                moveTo(159.53f, 28.89f)
                arcTo(103.67f, 103.67f, 0.0f, false, false, 128.0f, 24.0f)
                curveTo(71.38f, 24.0f, 24.0f, 71.37f, 24.0f, 128.0f)
                arcToRelative(103.69f, 103.69f, 0.0f, false, false, 4.89f, 31.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.65f, 1.62f)
                lineTo(161.15f, 35.54f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 159.53f, 28.89f)
                close()
            }
        }
        .build()
        return `_boules-fill`!!
    }

private var `_boules-fill`: ImageVector? = null
