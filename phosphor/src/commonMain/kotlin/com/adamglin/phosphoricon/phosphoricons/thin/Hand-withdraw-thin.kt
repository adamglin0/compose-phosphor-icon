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

public val ThinGroup.`Hand-withdraw-thin`: ImageVector
    get() {
        if (`_hand-withdraw-thin` != null) {
            return `_hand-withdraw-thin`!!
        }
        `_hand-withdraw-thin` = Builder(name = "Hand-withdraw-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 198.65f)
                lineTo(228.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 198.65f)
                arcToRelative(78.83f, 78.83f, 0.0f, false, false, -32.0f, -63.18f)
                verticalLineToRelative(66.84f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.35f, 2.19f)
                lineTo(170.0f, 188.19f)
                lineToRelative(-0.12f, -0.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.77f, 15.91f)
                lineToRelative(22.2f, 33.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.69f, 4.38f)
                lineToRelative(-22.26f, -34.0f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, true, -0.12f, -0.19f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.51f, -24.1f)
                lineToRelative(3.27f, 5.0f)
                lineTo(180.02f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(160.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(61.78f)
                arcTo(86.84f, 86.84f, 0.0f, false, true, 228.0f, 198.65f)
                close()
                moveTo(80.0f, 52.0f)
                lineTo(64.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 64.0f)
                lineTo(52.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(60.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(154.83f, 101.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(124.0f, 126.34f)
                lineTo(124.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(116.0f, 126.34f)
                lineTo(90.83f, 101.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 154.83f, 101.17f)
                close()
            }
        }
        .build()
        return `_hand-withdraw-thin`!!
    }

private var `_hand-withdraw-thin`: ImageVector? = null
