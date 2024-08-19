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

public val ThinGroup.`Trophy-thin`: ImageVector
    get() {
        if (`_trophy-thin` != null) {
            return `_trophy-thin`!!
        }
        `_trophy-thin` = Builder(name = "Trophy-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 68.0f)
                lineTo(204.0f, 68.0f)
                lineTo(204.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(56.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(52.0f, 68.0f)
                lineTo(24.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 80.0f)
                lineTo(12.0f, 96.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(6.66f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 124.0f, 187.89f)
                lineTo(124.0f, 220.0f)
                lineTo(96.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 220.0f)
                lineTo(132.0f, 187.88f)
                curveToRelative(32.93f, -1.74f, 60.41f, -24.91f, 69.11f, -55.88f)
                lineTo(208.0f, 132.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(244.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 68.0f)
                close()
                moveTo(48.0f, 124.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 20.0f, 96.0f)
                lineTo(20.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(52.0f, 76.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, 1.0f, 12.0f)
                close()
                moveTo(196.0f, 111.1f)
                curveToRelative(0.0f, 37.71f, -30.79f, 68.62f, -68.0f, 68.9f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -68.0f, -68.0f)
                lineTo(60.0f, 52.0f)
                lineTo(196.0f, 52.0f)
                close()
                moveTo(236.0f, 96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineToRelative(-5.1f)
                arcToRelative(77.35f, 77.35f, 0.0f, false, false, 1.1f, -12.9f)
                lineTo(204.0f, 76.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_trophy-thin`!!
    }

private var `_trophy-thin`: ImageVector? = null
