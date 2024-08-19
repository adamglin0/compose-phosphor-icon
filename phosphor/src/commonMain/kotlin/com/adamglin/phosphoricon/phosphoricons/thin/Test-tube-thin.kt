package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Test-tube-thin`: ImageVector
    get() {
        if (`_test-tube-thin` != null) {
            return `_test-tube-thin`!!
        }
        `_test-tube-thin` = Builder(name = "Test-tube-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 89.18f)
                lineToRelative(-60.0f, -60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(39.94f, 158.41f)
                arcTo(40.78f, 40.78f, 0.0f, false, false, 97.6f, 216.08f)
                lineTo(210.16f, 103.5f)
                lineToRelative(23.1f, -7.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.57f, -6.62f)
                close()
                moveTo(91.94f, 210.42f)
                arcTo(32.77f, 32.77f, 0.0f, true, true, 45.6f, 164.07f)
                lineTo(75.0f, 134.63f)
                curveToRelative(9.2f, -3.38f, 23.94f, -5.08f, 43.11f, 4.93f)
                curveToRelative(12.09f, 6.31f, 22.74f, 8.48f, 31.66f, 8.48f)
                curveToRelative(1.64f, 0.0f, 3.2f, -0.09f, 4.73f, -0.22f)
                close()
                moveTo(206.74f, 96.21f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, false, -1.57f, 1.0f)
                lineTo(165.0f, 137.39f)
                curveToRelative(-9.2f, 3.38f, -23.94f, 5.08f, -43.11f, -4.93f)
                curveToRelative(-14.3f, -7.47f, -26.58f, -9.13f, -36.38f, -8.27f)
                lineTo(172.0f, 37.66f)
                lineToRelative(52.6f, 52.6f)
                close()
            }
        }
        .build()
        return `_test-tube-thin`!!
    }

private var `_test-tube-thin`: ImageVector? = null
