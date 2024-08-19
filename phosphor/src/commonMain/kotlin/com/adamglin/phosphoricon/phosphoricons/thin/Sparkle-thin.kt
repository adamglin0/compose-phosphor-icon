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

public val ThinGroup.`Sparkle-thin`: ImageVector
    get() {
        if (`_sparkle-thin` != null) {
            return `_sparkle-thin`!!
        }
        `_sparkle-thin` = Builder(name = "Sparkle-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.2f, 132.81f)
                lineToRelative(-53.36f, -19.65f)
                lineTo(123.19f, 59.8f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, -22.38f, 0.0f)
                lineTo(81.16f, 113.16f)
                lineTo(27.8f, 132.81f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, 22.38f)
                lineToRelative(53.36f, 19.65f)
                lineToRelative(19.65f, 53.36f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 22.38f, 0.0f)
                lineToRelative(19.65f, -53.36f)
                lineToRelative(53.36f, -19.65f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 0.0f, -22.38f)
                close()
                moveTo(193.43f, 147.68f)
                lineTo(138.35f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.37f, 2.37f)
                lineToRelative(-20.3f, 55.08f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -7.36f, 0.0f)
                lineTo(88.0f, 170.35f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 85.65f, 168.0f)
                lineToRelative(-55.08f, -20.3f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, -7.36f)
                lineTo(85.65f, 120.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 88.0f, 117.65f)
                lineToRelative(20.3f, -55.08f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 7.36f, 0.0f)
                lineTo(136.0f, 117.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.37f, 2.37f)
                lineToRelative(55.08f, 20.3f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.0f, 7.36f)
                close()
                moveTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(20.0f)
                lineTo(172.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(180.0f, 36.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 44.0f)
                lineTo(152.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 40.0f)
                close()
                moveTo(244.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(228.0f, 92.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(220.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(220.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(228.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_sparkle-thin`!!
    }

private var `_sparkle-thin`: ImageVector? = null
