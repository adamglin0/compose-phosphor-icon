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

public val FillGroup.`Steering-wheel-fill`: ImageVector
    get() {
        if (`_steering-wheel-fill` != null) {
            return `_steering-wheel-fill`!!
        }
        `_steering-wheel-fill` = Builder(name = "Steering-wheel-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(49.63f, 168.0f)
                lineTo(90.45f, 168.0f)
                lineToRelative(17.0f, 45.58f)
                arcTo(88.35f, 88.35f, 0.0f, false, true, 49.63f, 168.0f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 156.0f)
                close()
                moveTo(148.46f, 213.59f)
                lineTo(165.55f, 168.0f)
                horizontalLineToRelative(40.82f)
                arcTo(88.34f, 88.34f, 0.0f, false, true, 148.46f, 213.59f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(136.38f, 136.38f, 0.0f, false, false, -88.0f, 32.33f)
                lineTo(40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f)
                verticalLineToRelative(0.33f)
                arcTo(136.38f, 136.38f, 0.0f, false, false, 128.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_steering-wheel-fill`!!
    }

private var `_steering-wheel-fill`: ImageVector? = null
