package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Push-pin-slash`: ImageVector
    get() {
        if (`_push-pin-slash` != null) {
            return `_push-pin-slash`!!
        }
        `_push-pin-slash` = Builder(name = "Push-pin-slash", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(67.37f, 73.2f)
                arcTo(69.82f, 69.82f, 0.0f, false, false, 38.0f, 87.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.29f, 23.78f)
                lineTo(85.0f, 159.71f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(96.29f, 171.0f)
                lineToRelative(48.29f, 48.29f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 155.9f, 224.0f)
                curveToRelative(0.38f, 0.0f, 0.75f, 0.0f, 1.13f, 0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 11.64f, -6.33f)
                arcToRelative(89.75f, 89.75f, 0.0f, false, false, 11.58f, -20.27f)
                lineToRelative(21.84f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
                moveTo(155.9f, 208.0f)
                lineTo(48.0f, 100.08f)
                curveTo(58.23f, 91.83f, 69.2f, 87.72f, 80.66f, 87.81f)
                lineToRelative(87.16f, 95.88f)
                curveTo(165.59f, 193.56f, 160.24f, 202.23f, 155.9f, 208.0f)
                close()
                moveTo(235.32f, 104.0f)
                lineTo(190.68f, 148.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.33f, -11.3f)
                lineTo(224.0f, 92.7f)
                lineTo(163.32f, 32.0f)
                lineTo(122.1f, 73.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.33f, -11.29f)
                lineTo(152.0f, 20.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 235.32f, 104.0f)
                close()
            }
        }
        .build()
        return `_push-pin-slash`!!
    }

private var `_push-pin-slash`: ImageVector? = null
